import java.util.Scanner;

class Fibonacci {
  static int fib (int n){
    int[] arr = new int [n];
    arr[0] = 1;
    arr[1] = 1;
    for (int i=2 ; i<n ; i++){
      arr[i] = arr[i-2] + arr[i-1];
    }
    return arr[n-1];
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int n = 0;
		
		n = keyboard.nextInt();		
		System.out.println(Fibonacci.fib(n));
		
		
		keyboard.close();
  }
}