import java.util.Scanner;

interface Measurable {
  double getPerimeter();
  double getArea();
}

class Circle implements Measurable {
  private double radius;
  public Circle (double length){
    radius = length;
  }
  
  public double getPerimeter(){
    return 2* Math.PI * radius;
  }
  public double getArea(){
    return Math.PI * (radius * radius);
  }
}

class Square implements Measurable {
  private double length;
  public Square (double length){
    this.length = length;
  }
  public double getPerimeter(){
    return 4* length;
  }
  public double getArea(){
    return length*length;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		double length;
		
		length = keyboard.nextDouble();
		Circle c = new Circle(length);
		Square s = new Square(length);
		
		System.out.printf("Circle's perimeter is %.2f and area is %.2f.\n",
				c.getPerimeter(), c.getArea());
		System.out.printf("Square's perimeter is %.2f and area is %.2f.\n",
				s.getPerimeter(), s.getArea());
		keyboard.close();
  }
}