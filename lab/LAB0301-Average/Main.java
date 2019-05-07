import java.util.Scanner;

class Calculator {
  static double average(int[] arr){
    int sum=0;
    double average;
    for (int i=0 ; i<arr.length ; i++){
      sum += arr[i];
    }
    average =  (double)sum / (double)arr.length;
    return average;
  } 
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int n = 0;
		n = keyboard.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = keyboard.nextInt();
		
		System.out.print("Average of ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("is " + Calculator.average(arr));
		keyboard.close();
  }
}