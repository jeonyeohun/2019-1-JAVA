import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, KeyListener{

	private boolean isRunning = false; 

	public static final int WIDTH = 1340; // 맵 가로길이 
	public static final int HEIGHT = 960; // 맵 세로길이
	public static final String TITLE = "Pacman"; // 게임 타이틀

	private Thread thread; //쓰레드 

	public static Pacman pacman; 
	public static Map map;
	public static Appearance appearance;
	public static Score score;
	// ����
	public static final int START = 0;
	public static final int GAME = 1;
	public static boolean DEAD = false; // 게임오버-죽음 여부 확인
	public static boolean WIN =false; // 게임오버-승리 여부 확인 

	public static int STATE = -1;

	public boolean isEnter = false;

	private int time = 0;
	private int targetFrames =  35;
	private boolean showText = true;

	/********************************************************************************************************/

	public Game() {
		Dimension dimension = new Dimension(Game.WIDTH, Game.HEIGHT); // 위에서 설정한 가로세로 길이를 가지는 dimension 클래스 선언(awt)
		setPreferredSize(dimension); // dimension 객체에 사이즈를
		setMinimumSize(dimension);
		setMaximumSize(dimension);
		addKeyListener(this);

		STATE=START;
		WIN=false;
		DEAD=false;

		score = new Score("/res/scoreboard/scoreboard.txt"); // Score 객체를 생성. 생성자 인자로 score 파일의 경로를 넘겨줌
		pacman = new Pacman(Game.WIDTH/2, Game.HEIGHT/2); // 맵 가로/2, 세로/2 정보를 생성자의 인자로 넘겨주며 팩맨 객체 생성 
		map=new Map("/map/map.png"); // 맵 객체 생성. 생성자 인자로 맵 이미지파일 위치를 넘겨줌
		appearance = new Appearance("/appearance/appearance.png"); // appearance 파일의 저장경로를 넘겨주며 객체 생성 

		new Character(); // Character 객체 생성 
	}

	/********************************************************************************************************/

	public synchronized void start() { // Start 메소드 
		if(isRunning) // 만약에 게임이 실행중이면
			return; // 메소드 종료 -> 어차피 실행중이기 때문에 다시 시작할 필요가 없으므로 
		isRunning = true; // 아니면 게임을 실행 중 상태로 바꾸고
		thread = new Thread(this); // 이 객체를 쓰레드로 넘긴다
		thread.start(); // 쓰레드 시작 
	}

	/********************************************************************************************************/

	public synchronized void stop() {
		if(!isRunning) // 만약 게임이 실행중이 아니라면 
			return; // 메소드 종료
		isRunning = false; // 아니면 게임을 실행종료 상태로 바꿈
		try {
			thread.join(); // 다른 스레드가 종료될 때까지 대기했다가 다 종료되면 종료
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/********************************************************************************************************/

	private void render() { 
		BufferStrategy bs = getBufferStrategy(); 

		if(bs==null) {
			createBufferStrategy(3); 
			return;
		}

		Graphics g = bs.getDrawGraphics(); // 그림그리기 객체 생성
		g.setColor(Color.black); // 색깔을 검은색으로 변경
		g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT); // 0,0 좌표에 맵 가로길이, 세로길이 만큼의 사각형 채워 그리기 -> 검은색으로 설정했기 때문에 검은색 사각형으로 채운

		if(STATE==GAME) { // STATE 변수가 GAME. 게임 실행 중 상태 
			pacman.render(g); // 팩맨 이미지 그리기 
			map.render(g); // 맵 이미지 그리기 
			score.render(g); // 스코어 이미지 그리기 

			g.setColor(Color.white); //하얀색으로 설정 
			g.setFont(new Font(Font.DIALOG, Font.BOLD, 25)); // 글씨 세팅
			g.drawString("SCORE", 30, 870); // 글씨 그리기

		}

		else if(STATE==START) { // 게임 상태가 START. 대기중 상태
			int menu_width = 600; // 메뉴화면 가로길이 
			int menu_height = 400; // 메뉴화면 세로길이
			int xx = Game.WIDTH/2 - menu_width/2; // 사각형의 왼쪽 상단 꼭지점의 x좌표 
			int yy = Game.HEIGHT/2 - menu_height/2; // 사각형의 왼쪽 상단 꼭지점의 y좌표
			g.setColor(new Color(0, 0, 150)); // BLUE 로 색깔로 설정 
			g.fillRect(xx, yy, menu_width, menu_height); // 메뉴 화면 그리기

			g.setColor(Color.white); // 하얀색 설정
			g.setFont(new Font(Font.DIALOG, Font.BOLD, 25)); // 글씨 그리기 설정

			if(showText) { // showText 가 true라면 
				if(DEAD){	// gameover-dead 상태면 게임오버 메세지 출력
					g.drawString("YOU ARE DEAD", xx+200, yy+100);
					g.drawString("Your Score is "+score.score, xx+190, yy+140);
					g.drawString("Your Rank is "+score.rank, xx+200, yy+180);
					g.drawString("Press enter to restart the game", xx+122, yy+250);
				}
				else if(WIN) { // gameover-win 상태면 승리 메세지 출력
					g.drawString("!!! YOU WIN !!!", xx+215, yy+130);
					g.drawString("Press enter to start the game", xx+125, yy+180);
				}
				else	// 처음 시작화면에서는 누르면 시작 메세지 출력
					g.drawString("Press enter to start the game", xx+125, yy+200);
			}
		}

		g.dispose(); // 그려진 애들을 지우기
		bs.show(); // 
	}

	/********************************************************************************************************/

	private void tick() { 
		if(STATE==GAME) { 
			pacman.tick(); // 게임중 상태일 때,tick() 메서드 실행 
			map.tick(); // 게임중 상태일 때, tick() 메소드 실행 
		}
		else if(STATE == START) { // 게임 시작 대기 상태이면
			time++; // 값 증가
			if(time==targetFrames) { // 타겟 프레임 변수와 같은 값이라면
				time=0; // 타임 초기화 
				if(showText) { // show text 가 true면
					showText=false; // false 로 변경
				}
				else			   // show text 가 false 
					showText=true; // true 로 변경
			} 

			if(isEnter) {  // 엔터가 눌렸다면
				isEnter=false; // isEnter 를 false로 변경
				pacman = new Pacman(Game.WIDTH/2, Game.HEIGHT/2);// 새로운 팩맨 객체 생성
				map=new Map("/map/map.png");
				appearance = new Appearance("/appearance/appearance.png");
				STATE=GAME;
			}
		}
	}

	/********************************************************************************************************/
	//************* 메인 함수 ***************// 
	public static void main(String[] args) {
		Game game = new Game(); // 새로운 게임 객체 생성
		JFrame frame = new JFrame(); // Jframe 생성
		frame.setTitle(Game.TITLE); // 프레임의 제목을 타이틀로 변경
		frame.add(game); // 만든 game 객체를 만들어진 창 위에 붙인다
		frame.setResizable(false); // 창조절이 불가능하게 설정
		frame.pack(); // 만들어진 컴포넌트들을 창에 맞게 다 합쳐줌 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setLocationRelativeTo(null);

		frame.setVisible(true); 
		game.start(); // 스레드 시작
	}

	/***************************************** 스레드가 시작되면 호출됨 ************************************************/

	public void run() {

		requestFocus(); //호면에 focus가 가도록 한다.
		int fps = 0; // fps를 0으로 최기화
		double timer = System.currentTimeMillis();// 현재시간을 millisecond 로 환산해서 timer에 저장 
		long lastTime = System.nanoTime(); // 경과된 시간을 lasttime에 저장 
		double targetTick = 100.0; // 그래픽 새로 띄울 시간 간격을 설정하기 위한 변수 
		double delta = 0;
		double ns = 1000000000 / targetTick; // targettick을 nanosecond 로 환산하여 ns에 저장 

		while(isRunning) { // 게임이 실행중 상태라면 
			long now = System.nanoTime(); // 경과시간을 now에 저장
			delta = delta + ((now-lastTime)/ns); // 경과시간에서 이전 경과시간을 빼서 ns 로 나누어줌  
			lastTime = now; //지금 경과시간을 저장 

			while(delta >=1) { // delta가 1이상일때는 계속 새로운 그래픽을 생성한다.
				tick(); // 게임상태 계속 확인 
				render(); // 그림 그리기 
				fps++;
				delta--;
			}

			if(System.currentTimeMillis()-timer>=1000) { 
				fps=0;
				timer = timer+1000;
			}

		}
		stop(); // 스레드 종료
	}

	/****************************************************** 키보드 입력관리 *******************************************************/

	public void keyPressed(KeyEvent e) { 
		if(STATE == GAME) { // 게임이 실행 중 상태일 때,
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) // 키를 입력받아서 그 키가 오른쪽 키라면
				pacman.right=true; // 팩맨 클래스에 right 시그널을 보내기 
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
				pacman.left=true; // 팩맨 클래스에 left 시그널을 보내기 
			if(e.getKeyCode()==KeyEvent.VK_UP)
				pacman.up=true; // 팩맨 클래스에 up 시그널을 보내기 
			if(e.getKeyCode()==KeyEvent.VK_DOWN)
				pacman.down=true; // 팩맨 클래스에 down 시그널을 보내기 
		}

		else if(STATE==START) { // 게임이 대기중 상태일 때 
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {// 엔터가 입력되면 
				isEnter = true; // 엔터변수를 true 로 변경 
			}
		}
	}

	public void keyReleased(KeyEvent e) { // 키보드를 눌렀다가 떼면
		// 현재 움직이고 있는 팩맨을 멈추게 함 //
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			pacman.right=false;
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
			pacman.left=false;
		if(e.getKeyCode()==KeyEvent.VK_UP)
			pacman.up=false;
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
			pacman.down=false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
