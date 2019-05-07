import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int score = 0;
		
		score = keyboard.nextInt();
		try{
  		if (score > 100){
  		  throw new Exception ("Score > 100");
  		}
  		else if(score < 0){
  		  throw new Exception ("Score < 0");
  		}
		  System.out.println("Score: " + score); 		
		}
		catch (Exception e){
		  System.out.println(e.getMessage());
		}
		keyboard.close();
  }
}