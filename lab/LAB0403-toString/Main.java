class Person {
  private String name;
  private int age;
  
  Person (String name, int age){
    this.name = name;
    this.age = age;
  }
  
  
  final public String toString(){
    return ("My name is " + this.name + " and I'm "+ this.age + " years old"); 
  }
}

class Main {
  public static void main(String[] args) {
    Person p = new Person("Jackson", 21);
		System.out.println(p.toString());
  }
}