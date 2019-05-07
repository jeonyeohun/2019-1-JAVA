import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n;
    Scanner s = new Scanner (System.in);
    System.out.println("Input: ");
    n = s.nextInt();
    
    if(n<0){
      System.out.println("negative");
    }
    else if(n>0){
      System.out.println("positive");
    }
    else{
      System.out.println("zero");
    }
  }
}