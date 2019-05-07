import java.util.Scanner;

class LittleSmarterCalculator {
  static int add (int[] arr){
    int isum=0;
    for (int i=0 ; i<arr.length ; i++){
      isum += arr[i];
    }
    return isum;
  }
  
  static double add (double[] arr){
    double dsum=0;
    for (int i=0 ; i<arr.length ; i++){
      dsum += arr[i];
    }
    return dsum;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int size = keyboard.nextInt();
		
		int[] iarr = new int[size];
		double[] darr = new double[size];
		
		for (int i = 0; i < size; i++)
			iarr[i] = keyboard.nextInt();
		
		for (int i = 0; i < size; i++)
			darr[i] = keyboard.nextDouble();
		
		System.out.println(LittleSmarterCalculator.add(iarr));
		System.out.println(LittleSmarterCalculator.add(darr));
		keyboard.close();
  }
}