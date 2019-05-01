import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s =  new Scanner (System.in);
    int n;
    System.out.println("Please type integer number:");
    n =  s.nextInt();
    
    if(n<100){
      System.out.println("The input number is smaller than 100.");
    }
    else{
      System.out.println("The input number is not smaller than 100.");
    }
  }
}