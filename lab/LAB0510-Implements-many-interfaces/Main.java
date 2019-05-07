import java.util.Scanner;

interface Measurable {
  double getArea();
  
}

interface Comparable {
  int compareTo(Object o);
}

abstract class Polygon implements Comparable, Measurable {
  double length;
}

class Circle extends Polygon {
  Circle (double length){
    this.length = length;
  }
  public double getArea (){
    return Math.PI * (length * length);
  }
  
  public int compareTo(Object o) {
    if ((o != null) && (o instanceof Polygon)){
      Square square = (Square) o;
      if (getArea()==(square.getArea())){
        return 0;
      }
    }
    return -1;
  }
}

class Square extends Polygon {
  Square (double length){
    this.length = length;
  }
  public double getArea (){
    return (length * length);
  }
  
  public int compareTo(Object o) {
    if ((o != null) && (o instanceof Polygon)){
      Circle circle = (Circle) o;
      if (getArea()==(circle.getArea())){
        return 0;
      }
    }
    return -1;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		double length;
		
		length = keyboard.nextDouble();
		Circle c = new Circle(length);
		System.out.printf("Circle's area is %.2f.\n", c.getArea());
		
		length = keyboard.nextDouble();
		Square s = new Square(length);
		System.out.printf("Square's area is %.2f.\n", s.getArea());
		
		if (c.compareTo(s) == 0)
			System.out.println("Circle's area and square's area is same.");
		else
			System.out.println("Circle's area and square's area is different.");
		
		keyboard.close();
  }
}