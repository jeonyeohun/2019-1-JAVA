import java.util.Scanner;

class ModeFinder {
  static int find(int[] arr){
    int [] temparr = new int [arr.length];
    int mod=0;
    int max=0;
    
    for (int i=0 ; i<arr.length ; i++){
      for (int j=0 ; j<arr.length ; j++){
         if (arr[i] == arr[j]){
           temparr[i]++;
         }
      }
     // System.out.println(temparr[i]);
    }
    
    for (int i=0 ; i<arr.length ; i++){
      if(temparr[i]>max){
        max = temparr[i];
        mod = arr[i];
      }
    }
    
    return mod;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int n = 0, arr[];
		
		n = keyboard.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = keyboard.nextInt();
		
		System.out.println("Mode value is : " + 
					ModeFinder.find(arr));
		keyboard.close();
  }
}