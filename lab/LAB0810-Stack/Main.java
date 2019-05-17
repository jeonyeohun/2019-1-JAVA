import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

class Stack<T> implements Iterator<T> {
	LinkedList<T> list;
	
	public Stack() {
		list = new LinkedList<T>();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void push(T data) {
		list.add(data);
	}
	
	public T pop() {
		if (list.isEmpty())
			return null;
		
		return list.removeLast();
	}
		public T peek() {
		if (list.isEmpty())
			return null;
		
		return list.getLast();
	}
	
	public boolean hasNext() {
		if (list.size() <= 0)
			return false;
		return true;
	}

	public T next() {
	  return this.pop();
	}
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		int count = keyboard.nextInt();
		for (int i = 0; i < count; i++) {
			int num = keyboard.nextInt();
			stack.push(num);
		}
		
		Iterator<Integer> itr = stack;
		while(itr.hasNext())
			System.out.println(itr.next());
		
		if (stack.isEmpty())
			System.out.println("Stack is empty.");
		
		keyboard.close();
  }
}