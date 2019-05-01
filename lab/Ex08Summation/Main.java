import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n;
    int sum=0;
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a number");
    n = s.nextInt();
    
    for(int i=1 ; i<=n ; i++){
      sum += i;
    }
    
    System.out.println("The Summation from 1 to " + n +" is " + sum);
    
  }
}