import java.util.Scanner;

class Person {
  private String name;
  private int age;
  Person (String name, int age){
    this.name = name;
    this.age = age;
  }
  
  void writeOutput(){
    System.out.println("My name is " + name +" and I'm "+age+ " years old");
  }
  
  String getName(){
    return name;
  }
  int getAge(){
    return age;
  }
}

class Student extends Person {
  private int studentId;
  Student(String name, int age, int studentId){
    super(name, age);
    this.studentId = studentId;
  }
  int getstudentId(){
    return studentId;
  }
  void writeOutput(){
    System.out.println("My name is " + super.getName() +" and I'm "+super.getAge()+ " years old");
    System.out.println("My student id is "+ studentId);
  }
}

class Undergraduate extends Student {
  private int level;
  
  Undergraduate(String name, int age, int studentId, int level){
    super(name, age, studentId);
    this.level = level;
  }
  void writeOutput(){
    System.out.println("My name is " + super.getName() +" and I'm "+super.getAge()+ " years old");
    System.out.println("My student id is "+ super.getstudentId());
    System.out.println("My level is "+ level);
  }
  
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		String name;
		int age, studentId, level;
		Person[] p = new Person[3];
		
		name = keyboard.next();
		age = keyboard.nextInt();
		p[0] = new Person(name, age);
		
		name = keyboard.next();
		age = keyboard.nextInt();
		studentId = keyboard.nextInt();
		p[1] = new Student(name, age, studentId);
		
		name = keyboard.next();
		age = keyboard.nextInt();
		studentId = keyboard.nextInt();
		level = keyboard.nextInt();
		p[2] = new Undergraduate(name, age,
						 studentId, level);
		
		for (int i = 0; i < p.length; i++) {
			p[i].writeOutput();
			System.out.println();
		}
		
		keyboard.close();
  }
}