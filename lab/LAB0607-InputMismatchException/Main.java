import java.util.Scanner;
import java.util.InputMismatchException;


class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int number = 0;

    try{
		  number = keyboard.nextInt();
		  System.out.println(number * 10);
    }
    catch (InputMismatchException e){
      System.out.println("Input is not int!");
      System.out.println("0");
    }
		
		
		keyboard.close();
  }
}