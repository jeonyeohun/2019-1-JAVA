import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Person implements Serializable{
  public String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "My name is " + name;
	}
}

class Main {
  public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);		
		ObjectOutputStream outputStream = null;
		String filename = "person.records";
		
		
		try {outputStream = new ObjectOutputStream(new FileOutputStream(filename));}
		catch (IOException e){System.out.println("Error"); System.exit(0);}
		
		int n = keyboard.nextInt();
		
		try{
		outputStream.writeInt(n);
		}
		catch(IOException e){
		  System.out.println("Error");
		}
		try{
		  for (int i=0 ; i<n ; i++){
		    String line = keyboard.next();
		    Person p = new Person (line);
		    outputStream.writeObject(p);
		  }
		  outputStream.close();
		}
		catch (IOException e){
		  System.out.println("IO Error!");
		}
    
    
		keyboard.close();
		check(filename);
	}
	public static void check(String filename) {
		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream(filename));
			int n = inputStream.readInt();
			for (int i = 0; i < n; i++) {
				Person p = (Person)inputStream.readObject();
				System.out.println(p);
			}
			inputStream.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening the file " + filename);
			System.exit(0);
		}
		catch (ClassNotFoundException e) {
			System.out.println("Error reading the file " + filename);
			System.exit(0);
		}
		catch (IOException e) {
			System.out.println("Error while I/O to " + filename);
			System.exit(0);
		}
	}

}