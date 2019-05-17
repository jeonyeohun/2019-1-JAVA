import java.util.Scanner;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    HashMap<Integer, String> stu = new HashMap<Integer, String>();
    int N= keyboard.nextInt();
    
    for (int i=0 ; i<N ; i++){
      int stuNum = keyboard.nextInt();
      String name = keyboard.nextLine();
      
      stu.put(stuNum, name);
    }
    
    for (Integer num : stu.keySet()){
      System.out.println(num + " " + stu.get(num));
    }
				
		keyboard.close();
  }
}