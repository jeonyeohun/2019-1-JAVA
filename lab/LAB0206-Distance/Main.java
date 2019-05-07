import java.util.Scanner;

class Position {
  private double x, y;
  
  public Position(double x, double y){
    this.x = x;
    this.y = y;
  }
  
  public double getX(){
    return this.x;
  }
  public double getY(){
    return this.y;
  }
  
  public double getDistance (Position p2){
    return Math.sqrt(Math.pow(p2.getX()-this.x ,2)+Math.pow(p2.getY()-this.y ,2));
  }
}

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x = 0, y = 0;
		
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		Position p1 = new Position(x, y);
		
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		Position p2 = new Position(x, y);
		
		System.out.println("Distance between [" + p1.getX() + ", " + 
				p1.getY() + "] and [" + p2.getX() + ", " + 
				p2.getY() + "] is " + p1.getDistance(p2));
		keyboard.close();
	}
}