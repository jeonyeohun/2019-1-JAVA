import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int value = 0;
		String changeMe = keyboard.next();
		
		value = Integer.parseInt(changeMe);
		
		System.out.println(changeMe + " mod 7 is " + (value % 7));
		keyboard.close();
	}
}