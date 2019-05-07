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

class Main {
  public static void main(String[] args) {
    Person generalPerson = new Person("Jackson");
		Student me = new Student("Me", "21800001");
		
		System.out.println("General Person's explain :");
		generalPerson.explain();
		System.out.println();
		
		System.out.println("Student's explain: ");
		me.explain();
  }
}