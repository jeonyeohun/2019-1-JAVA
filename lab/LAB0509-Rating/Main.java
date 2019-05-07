import java.util.Scanner;

interface Eatable {
  public void eat();
  public void rating();
}

abstract class Food implements Eatable {
  String name;
  int rate;
}

class Salad extends Food {
  Salad(String name, int rate){
    this.name = name;
    this.rate = rate;
  }
  
  public void eat(){
    System.out.println("Eat Salad:" + name);
  }
  public void rating(){
    System.out.println("Salad's rate is " + rate);
  }
}

class NoodleLoad extends Food {
  NoodleLoad(String name, int rate){
    this.name= name;
    this.rate = rate;
  }
  
  public void eat(){
    System.out.println("Eat NoodleLoad:" + name);
  }
  public void rating(){
    System.out.println("NoodleLoad's rate is " + rate);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int whatToEat, rate;
		String name;
		Eatable food;
		
		System.out.println("What to eat? 1. Salad 2. NoodleLoad");
		whatToEat = keyboard.nextInt();
		
		if (whatToEat == 1) {
			System.out.println("What is salad's name and rate?");
			name = keyboard.next();
			rate = keyboard.nextInt();
			food = new Salad(name, rate);
		}
		else if (whatToEat == 2) {
  		System.out.println("What is NoodleLoad menu's name and rate?");
  		name = keyboard.next();
  		rate = keyboard.nextInt();
  		food = new NoodleLoad(name, rate);
  	}
  	else {
			keyboard.close();
			return;
		}
		
		food.eat();	
		food.rating();
		keyboard.close();
  }
}