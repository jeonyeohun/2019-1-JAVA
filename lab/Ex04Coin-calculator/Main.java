import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int n;
    System.out.println("Enter a number");
    n = s.nextInt();
    
    System.out.println((n/500) + " of 500 coins");
    n =  n%500;
    System.out.println((n/100) + " of 100 coins");
    n =  n%100;
    System.out.println((n/10) + " of 10 coins");
    n =  n%10;
    System.out.println(n + " of 1 coins");
    
  }
}