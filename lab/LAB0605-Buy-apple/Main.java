import java.util.Scanner;

class NoMoneyException extends Exception {
	NoMoneyException(){
	  super("No money!");
	}
}

class Buyer {
	private int balance;
	private int appleCount;
	
	public Buyer(int money) {
		balance = money;
		appleCount = 0;
	}
	
	public void buy(int applePrice) throws NoMoneyException {
		if (applePrice > balance)
			throw new NoMoneyException();
		balance -= applePrice;
		appleCount++;
	}
	
	public int getAppleCount() {
		return appleCount;
	}
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Buyer b;
		int initialMoney = 0, applePrice = 0, numberOfAppleWantToBuy = 0;
		
		initialMoney = keyboard.nextInt();
		applePrice = keyboard.nextInt();
		numberOfAppleWantToBuy = keyboard.nextInt();
		
	
  		b = new Buyer(initialMoney);
  		try{
  		for (int i = 0; i < numberOfAppleWantToBuy; i++)
  			b.buy(applePrice);
	}
	
	catch(NoMoneyException e){
		      System.out.println(e.getMessage());
	}
	finally{
	  System.out.println("I got " + b.getAppleCount() + " apples.");
	}
		keyboard.close();
  }
}