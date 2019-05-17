import java.util.Scanner;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); 
		HashSet<Integer> intSet = new HashSet<Integer>();
		int N = keyboard.nextInt();
		for (int i=0 ; i<N ; i++){
		  int key = keyboard.nextInt();
		  intSet.add(key);
		}
		
		for (Object obj : intSet.toArray()){
		  Integer num = (Integer) obj;
		  System.out.print(num.intValue() +" ");
		}
		keyboard.close();
  }
}