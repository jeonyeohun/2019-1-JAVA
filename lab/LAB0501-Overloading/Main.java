import java.util.Scanner;

class Person {
  private String name;
  private int age;
  Person(){
    name = "None";
    age = 0;
  }
  Person(String name){
    this.name = name;
  }
  
  Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  void writeOutput(){
    System.out.println("My name is "+name + " and I'm "+ age + " years old.");
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Person[] people = new Person[3];
		String name;
		int age;
		
		name = keyboard.next();
		age = keyboard.nextInt();
		
		people[0] = new Person();
		people[1] = new Person(name);
		people[2] = new Person(name, age);
		
		for (int i = 0; i < people.length; i++)
			people[i].writeOutput();
		
		keyboard.close();
  }
}