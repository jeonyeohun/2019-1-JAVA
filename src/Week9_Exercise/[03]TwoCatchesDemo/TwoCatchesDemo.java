import java.util.Scanner;
public class TwoCatchesDemo{
  public static void main(String[] args){
    try{
      System.out.println("Enter number of Pizza slices: ");
      Scanner kb = new Scanner(System.in);
      int slices = kb.nextInt();
      if (slices<0){
        throw new NegativeNumberException("slices");
      }
      System.out.println("How many students? ");
      int students  = kb.nextInt();
      if(students < 0){
        throw new NegativeNumberException("students");
      }

        double ratio = exceptionalDivision(slices, students, "stuents");
        system.out.println("Each student can eat " + ratio + " pizza slices");
      }

      catch(DividedByZeroException e){
        System.out.println("There is no " + e.getMessage());
      }
      catch(NegativeNumberException e){
        System.out.println("Cannot have a negative number of " + e.getMessage());
      }
    }
  }

public static double exceptionalDivision(double numerator, double denominator, String eMessage) throws DividedByZeroException{
  if (denominator == 0 )
    throw new DividedByZeroException(eMessage);
    return numerator/denominator;
  }

public class NegativeNumberException extends Exception{
  public NegativeNumberException(){
    super("Negative Number Exception!");
  }
  public NegativeNumberException (String message){
    super(message);
  }
}

public class DividedByZeroException extends Exception{
  public DividedByZeroException(){
    super("Dividing by Zero");
  }
  public DividedByZeroException(String message){
    super(message);
  }
}
