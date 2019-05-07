import java.util.Scanner;

class Person implements Comparable {
  private String name;
  Person (String name){
    this.name = name;
  }
  
  public int compareTo(Object o) {
    if ((o != null) && (o instanceof Person)){
      Person otherPerson = (Person) o;
      return (name.compareToIgnoreCase(otherPerson.name));
    }
    return -1;
  }
  final public String toString(){
    return name; 
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		String name;
		
		name = keyboard.next();
		Person p1 = new Person(name);
		
		name = keyboard.next();
		Person p2 = new Person(name);
		
		if (p1.compareTo(p2) == 0)
			System.out.println(p1 + " is same with " + p2);
		else
			System.out.println(p1 + " is different with " + p2);
		
		keyboard.close();
  }
}