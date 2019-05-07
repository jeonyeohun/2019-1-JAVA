import java.util.Scanner;

class Seller {
  private int pricePerApple;
  private int apple;
  
  public Seller (int pricePerApple, int apple) {
    this.pricePerApple = pricePerApple;
    this.apple = apple;
  }
  
  public int getApple (){
    return apple;
  }
  
  public int getPrice(){
    return pricePerApple;
  }
}

class Buyer {
  private int apple;
  private int balance;
  
  public Buyer(int balance) {
    this.balance = balance;
  }
  public void buy(Seller appleSeller, int count){
    if (appleSeller.getApple() - count < 0){
      System.out.println("Can't buy " + count + " apple(s)!");
    }
    else if (this.balance - appleSeller.getPrice() * count < 0){
      System.out.println("Can't buy " + count + " apple(s)!");
    }
    else{
      this.apple = count;
      this.balance = this.balance - appleSeller.getPrice() * count;
    }
  }
  public int getBalance(){
    return this.balance;
  }
  public int getApple(){
    return this.apple;
  }
}

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Seller appleSeller = new Seller(2000, 10);
		Buyer appleBuyer = new Buyer(15000);
		
		int count = keyboard.nextInt();
		appleBuyer.buy(appleSeller, count);
		System.out.println("Buyer's balance: " + 
				appleBuyer.getBalance());
		System.out.println("Buyer's apple: " + 
				appleBuyer.getApple());
		
		keyboard.close();
	}
}
