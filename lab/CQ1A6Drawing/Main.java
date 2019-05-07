import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n;
    Scanner s = new Scanner(System.in);
    System.out.println("Input: ");
    n = s.nextInt();
    
    for (int i=1 ; i<=n ; i++){
      for(int j=0 ; j<i ; j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
    for (int i=0 ; i<n ; i++){
      for (int j=n-i ; j>0 ; j--){
        System.out.print("*");
      }
      System.out.print("\n");
    }
    
  }
}