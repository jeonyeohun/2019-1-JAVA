import java.util.Scanner;

class Name {
  // Your code here
  private String name;
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return this.name;
  }
}

class Main {
  public static void main(String[] args) {
    String name;
		Scanner keyboard = new Scanner(System.in);
		Name N = new Name();
		
		// Input name while length of name is not 0.
  		// Your code here
  		while(true){
  		  System.out.print("Input your name: ");
  		  name = keyboard.nextLine();
  		  
  		  if ((name.length())>0){break;}
  		}
  		
  		N.setName(name);
		
		System.out.println("My name is "+ N.getName());
		keyboard.close();

  }
}