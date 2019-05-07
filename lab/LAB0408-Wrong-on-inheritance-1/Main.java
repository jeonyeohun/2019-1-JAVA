import java.util.Scanner;

class Motor {
	private int speed;
	
	public Motor(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		if (this.speed < 0)
			this.speed = 0;
	}
}

class Car extends Motor {
	Motor motor;
	private String name;
	private int highSpeed;
	
	public Car(int s, String name, int range) {
		super(s);
		this.name = name;
		this.highSpeed = range;
	}
	
	public void speedUp(int speed) {
		if (super.getSpeed() + speed > highSpeed)
			System.out.println("Can't accelerate!");
		else
			super.speedUp(speed);
	}
	
	public String toString() {
		return name + "'s current speed : " + super.getSpeed();
	}
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Car oldCar = new Car(0, "Martiz", 100);
		Car newCar = new Car(0, "Genesis", 200);
		
		oldCar.speedUp(keyboard.nextInt());
		newCar.speedUp(keyboard.nextInt());
		System.out.println(oldCar);
		System.out.println(newCar);
		
		keyboard.close();
  }
}