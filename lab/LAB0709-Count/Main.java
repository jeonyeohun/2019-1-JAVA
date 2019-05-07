import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		String filename = "out.bat";
		ObjectInputStream inputStream = null;
		Scanner keyboard = new Scanner(System.in);
		prepare(filename);
		int count=0;
		
		char userinput = keyboard.next().charAt(0);
		
		try {
		  inputStream = new ObjectInputStream (new FileInputStream (filename));
		  String str = inputStream.readUTF();
      for (int i=0 ; i<str.length() ; i++){
        if (str.charAt(i) == userinput){
          count++;
        }
      }
      inputStream.close();
    }
    catch (FileNotFoundException e){
      System.out.println("FILE OPEN ERROR!");
    }
    catch(IOException e){
      System.out.println("IO ERROR!");
    }
    
		keyboard.close();
		System.out.println(count);
	}
	
	public static void prepare(String filename) {
		ObjectOutputStream outputStream = null;
		Random generator = new Random(30);
			
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(filename));
			String line = "";
			
			for (int i = 0; i < 100; i++)
				line += (char)(generator.nextInt(26) + 65);
			outputStream.writeUTF(line);
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