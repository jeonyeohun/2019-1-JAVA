import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a, b;
    Scanner s = new Scanner (System.in);
    
    System.out.println("Please input two numbers: ");
    a = s.nextInt();
    b = s.nextInt();
    
    System.out.println("a + b = " + (a+b));
    System.out.println("a - b = " + (a-b));
    System.out.println("a * b = " + (a*b));
    System.out.println("a / b = " + (a/b));
    
  }
}