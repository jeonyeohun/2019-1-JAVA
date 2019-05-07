class Person {
  private String name;
  Person (String name){
    this.name = name;
  }
  String getName(){
    return this.name;
  }
  void explain(){
    System.out.println("My name is " + getName());
  }
}

class Student extends Person {
  private String sNumber;
  
  Student(String name, String number){
    super(name);
    this.sNumber = number;
  }
  
  String getSNumber(){
    return this.sNumber;
  }
  
  void explain(){
    System.out.println("My name is " + super.getName());
    System.out.println("My student number is " + this.sNumber);
  }
  
}

class Undergraduate extends Student {
  private int level;
  
  Undergraduate(String name, String snumber, int level){
    super(name, snumber);
    this.level = level;
  }
  
  int getLevel(){
    return level;
  }
  
  void explain(){
    System.out.println("My name is " + super.getName());
    System.out.println("My student number is " + super.getSNumber());
    System.out.println("My level is " + this.level);
  }
}

class PersonCheck {
   static void whatPerson (Person a){
    System.out.println(a.getName() + " is person");
  }
  static void whatPerson (Student a){
    System.out.println(a.getName() + " is student");
  }
  static void whatPerson (Undergraduate a){
    System.out.println(a.getName() + " is Undergraduate");
  }
}

class Main {
  public static void main(String[] args) {
    Person p = new Person("Per");
		Student s = new Student("Stu", "21800001");
		Undergraduate u = new Undergraduate("Under", "21800001", 2);
		
		PersonCheck.whatPerson(u);
		PersonCheck.whatPerson(s);
		PersonCheck.whatPerson(p);
  }
}