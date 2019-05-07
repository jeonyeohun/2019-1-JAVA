import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		String filename = "out.bat";
		ObjectOutputStream outputStream = null;
		Scanner keyboard = new Scanner(System.in);
		
		try {
		  outputStream = new ObjectOutputStream(new FileOutputStream(filename));
		  System.out.println("Enter nonnegative integers.");
		  System.out.println("Place a negative number at the end.");
		  int anInteger;
		  do{
		    anInteger = keyboard.nextInt();
		    outputStream.writeInt(anInteger);
		  }while (anInteger >= 0);
		  
		  outputStream.close();
		}
		catch(FileNotFoundException e){
		  System.out.println("Problem! " + filename);
		}
		catch(IOException e){
		  System.out.println("input is wrong!");
		}
		keyboard.close();
		check(filename);
	}

	public static void check(String filename) {
		ObjectInputStream inputStream = null;
		
		try {
			inputStream = new ObjectInputStream(new FileInputStream(filename));
			int anInteger = inputStream.readInt();
			while (anInteger >= 0) {
				System.out.println(anInteger);
				anInteger = inputStream.readInt();
			}
			inputStream.close();
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