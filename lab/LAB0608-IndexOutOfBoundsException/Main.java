import java.util.Scanner;

class List {
	String[] array;
	int current;
	
	public List(int capacity) {
		array = new String[capacity];
		current = 0;
	}
	
	public void add(String element) {
		if (current == array.length)
			return;
		array[current] = element;
		current++;
	}
	
	public String get(int index) throws IndexOutOfBoundsException {
		return array[index];
	}
}


class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		List list;
		int cap = 0, count = 0;
		
		cap = keyboard.nextInt();
		list = new List(cap);
		for (int i = 0; i < cap; i++)
			list.add(keyboard.next());
		
		count = keyboard.nextInt();
		try{
		System.out.println(list.get(count));
		}
		catch(IndexOutOfBoundsException e){
		  System.out.println(count + " is out of capacity.");
		}
		
		keyboard.close();
  }
}