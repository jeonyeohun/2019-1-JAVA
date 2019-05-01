import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n;
    
    System.out.println("Please type integer number:");
    n = s.nextInt();
    
    if((n%2 == 0)&&(n>0)){
      System.out.println("The input number is a positive and even number");
    }
    else{
      System.out.println("The input number is either not a positive or not a even number");
    }
  }
}