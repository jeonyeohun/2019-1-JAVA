import java.util.Scanner;

class Circle {
  private int radius;
  
  public void setRadius(int radius){
    this.radius = radius;
  }
  
  public double getArea(){
    return Math.pow(this.radius, 2) * Math.PI;
  }
  
  public double getPerimeter(){
    return this.radius * 2 * Math.PI;
  }
}

class Main {
  public static void main(String[] args) {
    int radius = 0;
		Circle c = new Circle();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input the radius: ");
		radius = keyboard.nextInt();
		
		c.setRadius(radius);
		System.out.println("Area of circle: " + 
					String.format("%.2f", c.getArea()));
		System.out.println("Perimeter of circle: " +
					String.format("%.2f", c.getPerimeter()));
		
		keyboard.close();

  }
}