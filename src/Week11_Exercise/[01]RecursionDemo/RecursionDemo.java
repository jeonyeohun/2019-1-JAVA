import java.util.Scanner;
public class RecursionDemo{
  public static void main (String[] args){
    System.out.println("Enter an integer:");
    Scanner kb = new Scanner (System.in);
    int number = kb.nextInt();
    System.out.println("The digits in that number are:");
    displayAsWords(number);
    kb.close();
    System.out.println();
  }
  public static void displayAsWords(int number){
    if (number < 10)
      System.out.print(getWordFromDigit(number) + " ");
    else{
      displayAsWords(number / 10);
      System.out.print(getWordFromDigit(number%10) + " ");
    }
  }
  private static String getWordFromDigit(int digit){
    String result = null;
    switch (digit){
      case 0: result = "zero"; break; case 1: result = "one"; break;
      case 2: result = "two" ; break; case 3: result = "three" ; break;
      case 4: result = "four"; break; case 5: result = "five"; break;
      case 6: result = "six"; break; case 7: result = "seven"; break;
      case 8: result = "eight"; break; case 9: result = "nine"; break;
      default: {System.out.println("Fatal Error."); System.exit(0);}
    }
    return result;
  }
}
