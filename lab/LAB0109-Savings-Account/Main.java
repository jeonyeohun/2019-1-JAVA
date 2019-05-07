import java.util.Scanner;

class Account {
  double interest;
  double balance;
  public void setMoney (double money){
    this.balance = money;
  }
  
  public void setInterestRate (double intrate){
    this.interest = intrate;
  }
  
  public double getAfterOneYear (){
    for (int i=0 ; i < 12 ; i++){
    balance += balance *this.interest /100;
    }
    return balance;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		double ratio = 0;
		
		System.out.print("Set interest for account1: ");
		ratio = keyboard.nextDouble();
		Account acc1 = new Account();
		acc1.setMoney(10000.0);
		acc1.setInterestRate(ratio);
		
		System.out.print("Set interest for account2: ");
		ratio = keyboard.nextDouble();
		Account acc2 = new Account();
		acc2.setMoney(50000.0);
		acc2.setInterestRate(ratio);
		
		System.out.println("Account 1 after 1 year: " + String.format("%.0f", acc1.getAfterOneYear()) + " won.");
		System.out.println("Account 2 after 1 year: " + String.format("%.0f", acc2.getAfterOneYear()) + " won.");
		System.out.println("Account 1 after 2 year: " + String.format("%.0f", acc1.getAfterOneYear()) + " won.");
		System.out.println("Account 2 after 2 year: " + String.format("%.0f", acc2.getAfterOneYear()) + " won.");
		
		keyboard.close();
  }
}