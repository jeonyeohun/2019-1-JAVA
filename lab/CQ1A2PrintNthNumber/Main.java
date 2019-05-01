import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int n, m;
    System.out.print("Input for M: ");
    m = s.nextInt();
    System.out.print("Input for N: ");
    n = s.nextInt();
    
    for (int i=1 ; i<=m ; i++){
      if (i%n == 0){
        System.out.print(i + " ");
      }
    }
  }
}