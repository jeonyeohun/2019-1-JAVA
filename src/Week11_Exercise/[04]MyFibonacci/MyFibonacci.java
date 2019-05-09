import java.util.Scanner;
public class MyFibonacci{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    while(true){
      System.out.println("Input n: ");
      int n = kb.nextInt();
      if (n<0) {break;}
      System.out.println("Fibonacci(" + n +") is "+ Fibonacci(n));
    }
    System.out.println("Good Bye!");
  }

  public static int Fibonacci (int n){
    if (n==0) return 0;
    if (n == 1) return 1;

    return Fibonacci (n-1) + Fibonacci(n-2);
  }
}
