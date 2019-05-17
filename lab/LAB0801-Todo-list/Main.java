import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<String> toDoList = new ArrayList<String>();
    
    while(true){
      System.out.print("Type an entry: ");
      String entry = keyboard.nextLine();
      if (entry.equals("quit"))
        break;
      toDoList.add(entry);
      
        
    }
    
    System.out.println("The List contains:");
    for (String s : toDoList){
      System.out.println(s);
    }
		

		keyboard.close();
  }
}