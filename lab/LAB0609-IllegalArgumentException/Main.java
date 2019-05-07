import java.util.Scanner;

class Date {
  int hour, minute, second;
  
  // Create constructor with thorws IllegalArgumentException
  Date (int h, int m, int s) throws IllegalArgumentException{
    hour = h;
    minute = m;
    second = s;
    
    if (hour>24 || minute >60 || second >60 || hour<0 || minute <0 || second <0){
      throw new IllegalArgumentException();
    }
  }
  // Create show method
  public void show (){
    System.out.printf("%02d:%02d:%02d", hour, minute, second);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Date date;
		int h, m, s;
		
		h = keyboard.nextInt();
		m = keyboard.nextInt();
		s = keyboard.nextInt();
		
		try{
  		date = new Date(h, m, s);
  		date.show();		
  		keyboard.close();
		}
		catch(IllegalArgumentException e){
		  System.out.println("Illegal arguments");
		}
  }
}