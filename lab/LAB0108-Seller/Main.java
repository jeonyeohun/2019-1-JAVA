import java.util.Scanner;

class Seller {
  int apple;
  int price;
  int balance=0;
  
  public void setApple(int n){
    apple = n;
  }
  
  public void setApplePrice (int price){
    this.price = price;
  }
  
  public void sell (int num){
    if(this.apple - num <0){
      System.out.println("There's not enough apples");
    }
    else{
      this.apple -= num;
      this.balance += price*num;
      System.out.println(apple + "apples left and balance is " +balance +"won." );
    }
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Seller seller = new Seller();
		int number = 0;
		
		seller.setApple(5);
		seller.setApplePrice(3000);
		
		System.out.println("How many apples do you want?");
		number = keyboard.nextInt();
		seller.sell(number);
		
		System.out.println("How many apples do you want?");
		number = keyboard.nextInt();
		seller.sell(number);
		
		keyboard.close();
  }
}