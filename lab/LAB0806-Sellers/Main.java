import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		HashMap<String, HashSet<String>> sellers = new HashMap<>();
		int N = keyboard.nextInt();
		for(int i=0 ; i<N ; i++){
		  HashSet <String> things = new HashSet<String>();
		  String name = keyboard.next();
		  while(true){ 
		    String thing = keyboard.next();
		    if (thing.equals("end")) break;
		    things.add(thing);
		  }
		  sellers.put(name, things);
		}
		
		
		for (String seller : sellers.keySet()) {
		  HashSet<String> list = sellers.get(seller);
		  System.out.print(seller + ": ");
		  
		  Iterator<String> itr = list.iterator();
		  while (itr.hasNext())
		    System.out.print(itr.next() + " ");
		  System.out.println();
		}
		keyboard.close();
  }
}