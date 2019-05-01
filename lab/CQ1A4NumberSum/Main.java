import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n;
    int sum = 0;
    
    System.out.print("Input: ");
    n = s.nextInt();
    
    while(true){
      if(n<=0){break;}
    sum += n%10;
    n /=10;
    }
  System.out.print(sum);
  }
}