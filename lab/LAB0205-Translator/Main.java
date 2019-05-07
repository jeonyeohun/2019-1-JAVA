import java.util.Scanner;

class Translator {
  public static String decimalToBinary(int num){
    return Integer.toBinaryString(num);
  }
}

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int number = keyboard.nextInt();
		
		System.out.println(number + " is " +
			Translator.decimalToBinary(number) + " in binary.");
		keyboard.close();
	}
}
