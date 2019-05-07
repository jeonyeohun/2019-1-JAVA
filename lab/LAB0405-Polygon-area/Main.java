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
	protected double area;
	
	public Polygon(Point cent, double r) {
		this.center = new Point(cent.getX(), cent.getY());
		this.radius = r;
		this.area = 0;
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
	
	public String toString() {
	  return "Polygon's area is " + this.area;
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
  public String toString() {
	  return "Circle's area is " + Math.pow(getRadius(),2) *Math.PI ;
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
  
  public String toString() {
	  return "Triangle's area is " + Math.pow(getRadius(),2) * ((3*Math.sqrt(3))/4);
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
  public String toString() {
	  return "Square's area is " + Math.pow(getRadius(),2) *2 ;
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
		
		Point point = new Point(x,y);
		
		type = keyboard.nextInt();
		
		if (type == 1){
		  p = new Circle(point, r);
		}
		else if (type == 2){
		  p = new Triangle(point, r);
		}
		else if (type == 3){
		  p = new Square(point, r);
		}
		else{
		  p = new Polygon(point, r);
		}
		
		//System.out.println(p);
		System.out.println(p.toString());
		
		keyboard.close();
  }
}