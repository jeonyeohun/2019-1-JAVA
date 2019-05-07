import java.util.Scanner;

class StringSort {
  static void sort(String[] arr) {
    int len = arr[0].length();
    for (int i=0 ; i< arr.length-1 ; i++){
      for (int j=i+1 ; j<arr.length ; j++)
        if (arr[i].length() > arr[j].length()){
          String temp;
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
    }
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		String[] strings;
		int n = 0, i = 0;
		
		n = keyboard.nextInt();
		strings = new String[n];
		for (i = 0; i < n; i++)
			strings[i] = keyboard.next();
		
		StringSort.sort(strings);
		
		for (i = 0; i < n; i++)
			System.out.println(strings[i]);
		keyboard.close();
  }
}