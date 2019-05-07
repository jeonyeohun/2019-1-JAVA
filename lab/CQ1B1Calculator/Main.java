import java.util.Scanner;
public class Main {
  public static final int CODE_CLOSE = 0;
  public static final int CODE_PLUS = 1;
  public static final int CODE_MINUS = 2;
  public static final int CODE_MULTI = 3;
  public static final int CODE_DIVISION= 4;
  
  public static void main(String[] args) {
    // Variable declaration
    boolean IsRunning = true;
    Scanner s = new Scanner(System.in);
    double n1, n2;
    int op;
    
    // Main body of program. *********
    do
    {
      System.out.println("=====================================");
      System.out.println("Please choose the operation you want.");
    
      System.out.println("0: Close 1: + 2: - 3: * 4: / ");
      op = s.nextInt();
      if (op == 0){
        IsRunning = false;
        break;
      }
      System.out.println("Please input the 1st double number.");
      n1 = s.nextDouble();
      System.out.println("Please input the 2nd double number.");
      n2 = s.nextDouble();
      
      
      if(op ==1){
        System.out.println("Answer:" + n1 + "+" + n2 + "=" + (n1+n2));
      }
      else if (op==2){
        System.out.println("Answer:" +n1 + "-" + n2 + "=" + (n1-n2));
      }
      else if (op==3){
        System.out.println("Answer:" +n1 + "*" + n2 + "=" + (n1*n2));
      }
      else if (op==4){
        System.out.println("Answer:" +n1 + "/" + n2 + "=" + (n1/n2));
      }
    
    }while(IsRunning);
    System.out.println("Good Bye!");
    // The end of main body of program.
  }
}
