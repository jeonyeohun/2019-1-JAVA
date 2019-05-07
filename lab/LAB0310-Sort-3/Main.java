import java.util.Scanner;
import java.util.Arrays;

class Sort {
  static void sortByKey (int[] iarr, String[] sarr){
    int temp;
    String dtemp;
    for (int i=0 ; i<iarr.length-1 ; i++){
      for (int j=i+1 ; j<iarr.length ; j++){
        if(iarr[i] > iarr[j]) {
          // sorting key//
					temp = iarr[j];
					iarr[j] = iarr[i];
					iarr[i] = temp;
					// paring data //
					dtemp = sarr[j];
					sarr[j] = sarr[i];
					sarr[i] = dtemp;
				}
      }
    }
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		
		int[] key = new int[n];
		String[] value = new String[n];
		
		for (int i = 0; i < n; i++) {
			key[i] = keyboard.nextInt();
			value[i] = keyboard.next();
		}

		Sort.sortByKey(key, value);
		for (int i = 0; i < n; i++)
			System.out.println(value[i]);
		
		keyboard.close();
  }
}