import java.util.Scanner;

class Point {
  private int x;
  private int y;
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public int getX() {
    return this.x;
  }
  
  public int getY() {
    return this.y;
  }
}

class Polygon {
  protected Point center;
	protected double radius;
	
	public Polygon(Point cent, double r) {
		this.center = new Point(cent.getX(), cent.getY());
		this.radius = r;
	}
	
	public Point getCenter() {
		return new Point(this.center.getX(),
			this.center.getY());
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void explain() {
		System.out.println("This is polygon.");
		System.out.println("Center : [" + center.getX() + ", " + center.getY() + "]");
		System.out.println("Radius : " + radius);
	}
}

class Circle extends Polygon {
  public Circle(Point p, double r) {
    super(p, r);
  }
  
  public void explain() {
    System.out.println("This is circle.");
    System.out.println("Center : [" + center.getX() + ", " + center.getY() + "]");
    System.out.println("Radius : " + radius);
  }
}

class Triangle extends Polygon {
  public Triangle(Point p, double r) {
    super(p, r);
  }
  
  public void explain() {
    System.out.println("This is Triangle.");
   System.out.println("Center : [" + center.getX() + ", " + center.getY() + "]");
    System.out.println("Radius : " + radius);
  }
}

class Square extends Polygon {
  public Square(Point p, double r) {
    super(p, r);
  }
  
  public void explain() {
    System.out.println("This is square.");
    System.out.println("Center : [" + center.getX() + ", " + center.getY() + "]");
    System.out.println("Radius : " + radius);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int x = 0, y = 0, type = 0;
		double r = 0;
		Polygon p;
		
		System.out.println("Input x, y, r");
		x = keyboard.nextInt();
		y = keyboard.nextInt();
		r = keyboard.nextDouble();
		
		
		System.out.println("Input type - 1: circle | 2: triangle | 3: square | others: polygon");
		type = keyboard.nextInt();
		
		Point point = new Point(x, y);
		
		if (type == 1){
		  p = new Circle(point, r);
		  p.explain();
		}
		else if (type == 2){
		  p = new Triangle(point, r);
		  p.explain();
		}
		else if (type == 3){
		  p = new Square(point, r);
		  p.explain();
		}
		else{
		  p = new Polygon(point, r);
		  p.explain();
		}
		
		// Don't use System.out.println at here.
		// System.out.println should be placed on explain function.
		
		
		
		keyboard.close();
  }
}