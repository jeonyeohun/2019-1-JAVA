import java.util.Scanner;

interface ArithmeticOperable {
	public double sum();
	public double sub();
	public double mul();
	public double div() throws DivideByZeroException;
}

class DivideByZeroException extends Exception {
	public DivideByZeroException() {
		super("Divide by zero.");
	}
	public DivideByZeroException(String message) {
		super(message);
	}
}

abstract class AbstractMath implements ArithmeticOperable {
  double operand1, operand2;
  
  // Your code here
  public double sum(){
    return operand1 + operand2;
  }
	public double sub(){
	  return operand1 - operand2;
	}
	public double mul(){
	  return operand1 * operand2;
	}
	public double div() throws DivideByZeroException{
	  if (operand2 == 0){
	    throw new DivideByZeroException("Can't divide with 0");
	  }
	  return operand1/operand2;
	}
}

class MyMath extends AbstractMath {
  public MyMath() {
    operand1 = 0;
    operand2 = 0;
  }
  
  public void setOperands(double op1, double op2) {
    operand1 = op1;
    operand2 = op2;
  }
  
  public double pow() {
    return Math.pow(operand1, operand2);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		MyMath m = new MyMath();
		double op1 = 0, op2 = 0;
		
		op1 = keyboard.nextDouble();
		op2 = keyboard.nextDouble();
		m.setOperands(op1, op2);
		
		System.out.printf("%.2f + %.2f = %.2f\n", op1, op2, m.sum());
		System.out.printf("%.2f - %.2f = %.2f\n", op1, op2, m.sub());
		System.out.printf("%.2f * %.2f = %.2f\n", op1, op2, m.mul());
		
		try {
			System.out.printf("%.2f / %.2f = %.2f\n", op1, op2, m.div());
		}
		catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.printf("%.2f ^ %.0f = %.2f\n", op1, op2, m.pow());
		}
		
		keyboard.close();
  }
}