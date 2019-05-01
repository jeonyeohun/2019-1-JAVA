import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n1, n2;
    int sum = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    n1 = s.nextInt();
    n2 = s.nextInt();
    sum = n1+n2;
    System.out.println("Addition is");
    System.out.println(sum);
  }
}