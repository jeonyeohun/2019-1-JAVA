import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n;
    Scanner s = new Scanner(System.in);
    System.out.print("Input: ");
    n = s.nextInt();
    
    for(int i=1 ; i<=n ; i++){
      for(int j=1 ; j<=n ; j++){
        if (i==j){
          System.out.print("1 ");
        }
        else{
          System.out.print("0 ");
        }
      }
      System.out.print("\n");
    }
    
    
    
  }
}