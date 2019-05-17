import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		
		while(true){
		  String entry = keyboard.next();
		  if (entry.equals("quit")) break;
		  list.addFirst(entry);
		  
		}
				
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
		  System.out.print(itr.next()+" ");
		}

		keyboard.close();
  }
}