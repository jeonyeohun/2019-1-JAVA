import java.util.Scanner;

class Factorial {
  static long fac(int n){
    long [] arr = new long [n];
    arr[0]=1;
    for(int i=1 ; i< n ; i++){
      arr[i] = arr[i-1] * (i+1);
    }
    return arr[n-1];
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		
		System.out.println(Factorial.fac(n));
		keyboard.close();
  }
}