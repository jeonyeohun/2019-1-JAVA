import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

class Main {
  public static void main(String[] args) {
		String filename = "out.bat";
		prepare(filename);
		
		ObjectInputStream inputStream = null;
		try {
		  inputStream = new ObjectInputStream(new FileInputStream(filename));
      int anInteger=1;
		  int sum = 0;
		  while(anInteger != 0){
		    anInteger = inputStream.readInt();
		    sum = sum + anInteger;
		  }
		  inputStream.close();
		  System.out.println(sum);
		}
		catch(FileNotFoundException e){
		  System.out.println("Problem! " + filename);
		}
		catch(IOException e){
		  System.out.println("input is wrong!");
		}
	}

	public static void prepare(String filename) {
		ObjectOutputStream outputStream = null;
		Random generator = new Random(30);
		
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(filename));
			for (int i = 0; i < generator.nextInt(20) + 4; i++)
				outputStream.writeInt(generator.nextInt(50000) - 25000);
			outputStream.writeInt(0);
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