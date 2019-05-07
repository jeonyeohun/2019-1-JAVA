import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String nums;
    System.out.print("Input: ");
    nums = s.nextLine(); 
    
    String sb = new StringBuffer(nums).reverse().toString();
    System.out.print(sb);
    
  }
}