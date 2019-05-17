import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    LinkedList<Person> list = new LinkedList<>();
		int N = keyboard.nextInt();
		for (int i=0 ; i<N ; i++){
		  String name = keyboard.next();
		  Person p = new Person (name);
		  list.add(p);
		}
		
	  Iterator<Person> itr = list.iterator();
	  while(itr.hasNext()){
	    System.out.println(itr.next().name);
	  }
	  
	  
		keyboard.close();
  }
}