import java.util.Scanner;

abstract class Polygon {
  double lengthOfOneSide;
  
  public abstract void writeOutput();
}

class Triangle extends Polygon {
  Triangle (double length){
    lengthOfOneSide = length;
  }
  
  double getPerimeter (){
    return lengthOfOneSide*3;
  }
  
  public void writeOutput(){
    System.out.printf("Triangle perimeter is %.2f\n", getPerimeter());
  }
}

class Square extends Polygon {
  Square (double length){
    lengthOfOneSide = length;
  }
  
  double getPerimeter (){
    return lengthOfOneSide*4;
  }
  
  public void writeOutput(){
    System.out.printf("Square perimeter is %.2f\n", getPerimeter());
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		double length;
		Polygon p;
		
		length = keyboard.nextDouble();
		p = new Triangle(length);
		p.writeOutput();
		
		length = keyboard.nextDouble();
		p = new Square(length);
		p.writeOutput();
		
		keyboard.close();
  }
}