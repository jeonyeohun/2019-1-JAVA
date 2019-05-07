import java.util.Scanner;

class LargeNumberException extends Exception {
	LargeNumberException(){
	  super("weight or height is more than 200");
	}
}

class NegativeNumberException extends Exception {
  NegativeNumberException(){
	  super("weight or height is less than 0");
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		double weight = 0, height = 0, bmi = 0;
		
		weight = keyboard.nextDouble();
		height = keyboard.nextDouble();
		
		try{
  		bmi = calculateBMI(weight, height);
  		if (bmi < 18.5)
  			System.out.println("low weight");
  		else if (bmi < 22.9)
  			System.out.println("normal weight");
  		else
  			System.out.println("high weight");
		}
		catch(LargeNumberException e ){
		  System.out.println(e.getMessage());
		}
		catch(NegativeNumberException e){
		  System.out.println(e.getMessage());
		}
		keyboard.close();
  }
  
  public static double calculateBMI(double weight, double height) 
			throws NegativeNumberException, LargeNumberException {
		if (weight < 0 || height < 0){
		  throw new NegativeNumberException();
		}
		if (weight > 200 || height > 200){
		  throw new LargeNumberException();
		}
		return weight/Math.pow(height, 2);
	}
}