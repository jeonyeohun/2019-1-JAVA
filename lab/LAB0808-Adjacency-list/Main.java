import java.util.Scanner;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		LinkedList<LinkedList<Integer>> list = new LinkedList<>();
		
		// This makes N linked list's head
		// Each head can get by list.get(index)
		// It is illustrated as picture
		int count = keyboard.nextInt();
		for (int i = 0; i < count; i++)
			list.add(new LinkedList<Integer>());

		// Your code here
		// Be careful to use index.
		// Input index starts at 1, but list's index start at 0.
		int dNum = keyboard.nextInt();
		for (int i=0 ; i<dNum ; i++){
		  int order = keyboard.nextInt();
		  int data = keyboard.nextInt();
		  list.get(order-1).add(data);
		}
		int sumorder = keyboard.nextInt();
		int sum =0;
		for (int i=0 ; i<list.get(sumorder-1).size() ; i++){
		  sum += list.get(sumorder-1).get(i);
		}
		System.out.println(sum);
		
		keyboard.close();
  }
}