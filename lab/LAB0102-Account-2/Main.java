import java.util.Scanner;

class Account {
  // Balance variable here
  private int balance = 0;
  
  // Set Balance method here
  public void setBalance (int money){
   this.balance = money;
  }
  
  public int getBalance(){
    return this.balance;
  }
  
  // Deposit method here
  public void deposit (int money){
      this.balance += money;
    }
  // Withdraw method here
  public void withdraw (int money){
    if(this.balance - money < 0){
      System.out.println("Can't withdraw.");
    }
    else{
      this.balance -= money;
    }
  }
}

class Main {
  public static void main(String[] args) {
    int money = 0;
		Scanner keyboard = new Scanner(System.in);
		Account account = new Account();
		
		// Set balance to 10000 won.
		account.setBalance(10000);
		System.out.println("Balance: " + account.getBalance());
		
		// Withdrawal (minus impossible)
		System.out.print("Amount to be withdrawn: ");
		money = keyboard.nextInt();
		account.withdraw(money);
		System.out.println("Balance: " + account.getBalance());
		
		// Deposit
		System.out.print("Amount to be deposited: ");
		money = keyboard.nextInt();
		account.deposit(money);
		System.out.println("Balance: " + account.getBalance());
		
		keyboard.close();
  }
}