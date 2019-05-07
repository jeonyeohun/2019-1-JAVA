class Person {
  String name;
  private String phoneNumber;
  private Person lover;
  
  public Person (String name, String numbers){
    this.name = name;
    this.phoneNumber = numbers;
  }
  public void makeLover(Person lover){
    this.lover = lover;
    this.lover.lover = this;
  }
  
  public Person getLover(){
    return this.lover;
  }
  public String getPhoneNumber(){
    return this.phoneNumber;
  }
  
}

public class Main {
	public static void main(String[] args) {
		Person girl = new Person("Amy", "010-1234-5678");
		Person boy = new Person("Jackson", "010-9876-5432");
		
		girl.makeLover(boy);

		System.out.println(girl.name + "'s boyfriend is " + 
			girl.getLover().name + " and phone number is " + 
			girl.getLover().getPhoneNumber());
		System.out.println(boy.name + "'s girlfriend is " + 
			boy.getLover().name + " and phone number is " + 
			boy.getLover().getPhoneNumber());
	}
}
