import java.util.Scanner;

class Account {
  private String owner;
  private int balance;
  
  Account(String name, int money){
    owner = name;
    balance = money;
  }
  
  public void printStatus(){
    System.out.println(this.owner + "'s account.");
    System.out.println("Balance: " + this.balance);
  }
}

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		int money;
		
		System.out.print("Input your name: ");
		name = keyboard.next();
		
		System.out.print("Input initial money: ");
		money = keyboard.nextInt();
		
		Account acc = new Account(name, money);
		acc.printStatus();
		
		keyboard.close();
	}
}
