import java.util.Scanner;

interface Measurable {
  double getPerimeter();
  double getArea();
}

abstract class Polygon implements Measurable {
  double length;
}

class Circle extends Polygon {
  Circle(double length){
    this.length = length;
  }
  
  public double getPerimeter(){
    return length * 2* Math.PI;
  }
  public double getArea(){
    return length*length *Math.PI;
  }
}

class Square extends Polygon {
  Square(double length){
    this.length = length;
  }
  
  public double getPerimeter(){
    return length*4;
  }
  
  public double getArea(){
    return length*length;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Polygon p;
		double length;
		
		length = keyboard.nextDouble();
		p = new Circle(length);
		System.out.printf("Circle's perimeter is %.2f and area is %.2f.\n",
				p.getPerimeter(), p.getArea());
		
		length = keyboard.nextDouble();
		p = new Square(length);
		System.out.printf("Square's perimeter is %.2f and area is %.2f.\n",
				p.getPerimeter(), p.getArea());
		keyboard.close();
  }
}