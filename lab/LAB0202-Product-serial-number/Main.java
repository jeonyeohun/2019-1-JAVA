import java.util.Scanner;

class Product {
  static int cnt=0;
  
  public int getSerialNumber(){
    cnt += 1;
    return this.cnt;
  }
}

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Product p;
		int num = keyboard.nextInt();
		
		for (int i = 0; i < num; i++) {
			p = new Product();
			System.out.println("Serial number: " +
					 p.getSerialNumber());
		}
		
		keyboard.close();
	}
}
