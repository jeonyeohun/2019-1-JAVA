import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		String filename = "out.txt";
		prepare(filename);
		int result;
		
		Scanner inputStream;
		try{
		  inputStream = new Scanner (new File(filename));
		  
		  
		  while(inputStream.hasNextLine()){
  		  String str = inputStream.nextLine();
  		  int n1 = str.charAt(0)-'0';
  		  int n2 = str.charAt(2)-'0';
  		  
  		  if (str.charAt(1) == '+')
  		    result = n1 + n2;
  		  else
          result = n1 - n2;
        
        System.out.println(result);
		  }
		  
		  inputStream.close();
		}
		catch (FileNotFoundException e){
		  System.out.println("FILE NOT FOUND");
		}
	}

	public static void prepare(String filename) {
		PrintWriter outputStream = null;
		Random generator = new Random(99);
		
		try {
			outputStream = new PrintWriter(filename);
			outputStream.write(generator.nextInt(10) + "+" + generator.nextInt(10) + "\n");
			outputStream.write(generator.nextInt(10) + "-" + generator.nextInt(10) + "\n");
			outputStream.write(generator.nextInt(10) + "+" + generator.nextInt(10) + "\n");
			outputStream.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening the file " + filename);
			System.exit(0);
		}
	}

}