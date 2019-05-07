import java.util.Scanner;

class DivideByZeroException extends Exception {
  DivideByZeroException(String message){
    super(message);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int dividend = 0, divisor = 0;
		double result = 0;
		
		dividend = keyboard.nextInt();
		divisor = keyboard.nextInt();
		
		try{
  		result = divide(dividend, divisor);
  		System.out.printf(dividend + " / " + divisor + " = %.2f", result);
		}	
		
		catch(DivideByZeroException e){
		  System.out.println(e.getMessage());
		}
		keyboard.close();
  }
  
  public static double divide(int dividend, int dividor)
                        throws DivideByZeroException {
    if (dividor == 0){
      throw new DivideByZeroException ("Divisor is 0");
    }
    
    return (double)dividend/dividor;
  }
}