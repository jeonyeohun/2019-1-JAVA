import java.util.Scanner;

class Person {
  private int balance;
  private int count;
  String[] myItems = new String[5];
  
  Person (int balance){
    this.balance = balance;
  }
  
  void buy (Product a){
      if (this.balance - a.price >= 0){
        myItems[this.count] = a.name;
        this.balance -= a.price;
        this.count++;
      }
  }
  
  int getBalance (){
    return this.balance;
  }
  int getItemsCount(){
    return this.count;
  }
}

class Product {
  protected int price;
  protected String name;
  
  Product(int price, String name){
    this.price = price;
    this.name = name;
  }
}

class TV extends Product {
  public TV(int price, String name) {
    super(price, name);
  }
}

class Computer extends Product {
  public Computer(int price, String name) {
    super(price, name);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int balance = 0;
		
		Product[] items = new Product[3];
		items[0] = new TV(3000, "Television");
		items[1] = new Computer(5000, "Samsung laptop");
		items[2] = new Computer(4000, "LG laptop");
		
		System.out.print("How many money do you have: ");
		balance = keyboard.nextInt();
		Person p = new Person(balance);
		
		System.out.println("\nI want to buy three items");
		for (int i = 0; i < 3; i++)
			System.out.println((i + 1) + ". " + items[i].name + ": " + items[i].price);

		for (int i = 0; i < 3; i++)
			p.buy(items[i]);
		
		System.out.println("\nMy balance is " + p.getBalance() + " and my items are");
		for (int i = 0; i < p.getItemsCount(); i++)
			System.out.print(p.myItems[i] + ", ");
		
		keyboard.close();
  }
}