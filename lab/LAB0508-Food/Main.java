import java.util.Scanner;

interface Eatable {
  void eat();
}

abstract class Food implements Eatable {
  String name;
}

class Salad extends Food {
  Salad(String name){
    this.name = name;
  }
  public void eat(){
    System.out.println("Eat Salad: " + name);
  }
}

class NoodleLoad extends Food {
  NoodleLoad(String name){
    this.name = name;
  }
  public void eat(){
    System.out.println("Eat NoodleLoad: " + name);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int whatToEat;
		String name;
		Eatable food;
		
		System.out.println("What to eat? 1. Salad 2. NoodleLoad");
		whatToEat = keyboard.nextInt();
		
		if (whatToEat == 1) {
			System.out.println("What is salad's name?");
			name = keyboard.next();
			food = new Salad(name);
		}
		else if (whatToEat == 2) {
			System.out.println("What is NoodleLoad menu's name?");
			name = keyboard.next();
			food = new NoodleLoad(name);
		}
		else {
			keyboard.close();
			return;
		}
		
		food.eat();		
		keyboard.close();
  }
}