public class Pet{
  private String name;
  private int age;
  public Pet (String initialName, int initialAge){
    name = initialName;
    age = initialAge;
  }

  public void setPet(String initialName, int initialAge){
    name = initialName;
    age = initialAge;
  }

  public String getName () {return name;}
  public int getAge() {return age;}
  public void writeOutput(){
    System.out.print("Name : " + name);
    System.out.println("\tAge: " + age + " years");
  }
}
