import java.util.Scanner;

class EnterZeroException extends Exception {
  public EnterZeroException(String message){
    super(message);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int numOfApples = 0, totalPrice = 0;
		int pricePerApple = 0;
		
		numOfApples = keyboard.nextInt();
		totalPrice = keyboard.nextInt();
		
		try{
		  if (numOfApples == 0){
		    throw new EnterZeroException("0 is not allowed");
		  }
  		pricePerApple = totalPrice / numOfApples;
  		System.out.println("Price per apple is " + pricePerApple);
		}
		catch (EnterZeroException e){
		  System.out.println(e.getMessage());
		}
  }
}