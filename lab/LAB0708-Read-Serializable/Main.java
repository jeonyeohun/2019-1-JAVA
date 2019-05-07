import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

class Person implements Serializable{
  // Change code if you need
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "My name is " + name;
	}
}

class Main {
  public static void main(String[] args) {
		String filename = "person.records";
		prepare(filename);
		int n=0;
		
		ObjectInputStream inputStream = null;
		try{
		  inputStream = new ObjectInputStream(new FileInputStream(filename));
		  n = inputStream.readInt();
		  for (int i=0 ; i<n ; i++){
		    Person p = (Person)inputStream.readObject();
		    System.out.println(p);
		  }
		  inputStream.close();
		}
		catch(FileNotFoundException e){
		  System.out.println("File Open Error!");
		}
		catch(IOException e){
		  System.out.println("IO Error!");
		}
		catch (Exception e) {
		  System.out.println("Error!");
		}
	}
	
	public static void prepare(String filename) {
		ObjectOutputStream outputStream = null;
		Random generator = new Random(28);
		
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(filename));
			int n = generator.nextInt(10);
			outputStream.writeInt(n);
			for (int i = 0; i < n; i++) {
				String name = "";
				
				int count = generator.nextInt(5) + 2;
				for (int j = 0; j < count; j++)
					name += (char)(generator.nextInt(26) + 65);
				
				Person p = new Person(name);
				outputStream.writeObject(p);
			}
			outputStream.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening the file " + filename);
			System.exit(0);
		}
		catch (IOException e) {
			System.out.println("Error while I/O to " + filename);
			System.exit(0);
		}
	}

}