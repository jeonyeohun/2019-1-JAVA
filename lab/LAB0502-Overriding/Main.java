import java.util.Scanner;

class Person {
  private String name;
  private int age;
  Person (String name, int age){
    this.name = name;
    this.age = age;
  }
  
  void writeOutput(){
    System.out.println("My name is " + name + " and " +age+ " years old.");
  }
  
  int getAge(){
    return age;
  }
  String getName(){
    return name;
  }
}

class Student extends Person {
  private int StudentId;
  Student(String name, int age, int StudentId){
    super(name, age);
    this.StudentId = StudentId;
  }
  
  void writeOutput(){
    System.out.println("My name is " + super.getName() + " and " + super.getAge() + " years old.");
    System.out.println("My student id is " + StudentId);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		String name;
		int age, studentId;
		
		name = keyboard.next();
		age = keyboard.nextInt();
		
		Person p = new Person(name, age);
		p.writeOutput();
		
		name = keyboard.next();
		age = keyboard.nextInt();
		studentId = keyboard.nextInt();
		
		Student s = new Student(name, age, studentId);
		s.writeOutput();
		
		keyboard.close();
  }
}