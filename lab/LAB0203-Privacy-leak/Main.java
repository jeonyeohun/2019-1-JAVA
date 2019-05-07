class Pet {
	private String name;
	private int age;
	
	public Pet(String initialName, int initialAge) {
		name = initialName;
		age = initialAge;
	}
	
	public void setPet(String initialName, int initialAge) {
		name = initialName;
		age = initialAge;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	
	public void writeOutput() {
		System.out.print("Name: " + name);
		System.out.println("\tAge: " + age + " years");
	}
}

class PetPair {
	private Pet first, second;
	
	public PetPair(Pet firstPet, Pet secondPet) {
		first = firstPet;
		second = secondPet;
	}
	
	public Pet getFirst() { 
	  Pet temp = new Pet(first.getName(), first.getAge());
	  return temp; 
	}
	public Pet getSecond() { return second; }
	
	public void writeOutput() {
		System.out.println("First pet in the pair: ");
		first.writeOutput();
		System.out.println("\nSecond pet in the pair: ");
		second.writeOutput();
	}
}

public class Main {
	public static void main(String[] args) {
		Pet goodDog = new Pet("Dog", 5);
		Pet goodCat = new Pet("Cat", 4);
		PetPair pair = new PetPair(goodDog, goodCat);
		System.out.println("Our pair: ");
		pair.writeOutput();
		
		Pet badGuy = pair.getFirst();
		badGuy.setPet("Hacked", 1200);
		System.out.println("\n\nOur pair now: ");
		pair.writeOutput();
	}
}
