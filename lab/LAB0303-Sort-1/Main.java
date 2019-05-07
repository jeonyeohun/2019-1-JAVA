import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		String[] strings;
		int n  = 0, i = 0;
		
		n = keyboard.nextInt();
		strings = new String[n];
		
		for (i=0 ; i<n ; i++){
		  strings[i] = keyboard.next();
		}
		
		Arrays.sort(strings);

		for (i = 0; i < n; i++)
			System.out.println(strings[i]);
		
		keyboard.close();
  }
}