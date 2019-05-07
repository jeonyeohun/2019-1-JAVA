import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int numOfApples = 0, totalPrice = 0;
		int pricePerApple = 0;
		
		numOfApples = keyboard.nextInt();
		totalPrice = keyboard.nextInt();
		
		try{
	    if (numOfApples < 1){
	      throw new Exception();
	    }
  		pricePerApple = totalPrice / numOfApples;
  		System.out.println("Price per apple is " + pricePerApple);
		}
		
		catch (Exception e){
		  System.out.println("No apples");
		}
		keyboard.close();
  }
}