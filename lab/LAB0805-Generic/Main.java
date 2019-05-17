import java.util.Scanner;

class Sample<T>{
  private T data;
  void setData(T val){
    data = val;
    
  }
  T getData(){
    return data;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Sample<String> sample1 = new Sample<String>();
		Sample<Integer> sample2 = new Sample<Integer>();
		
		String str = keyboard.next();
		int integer = keyboard.nextInt();
		
		sample1.setData(str);
		sample2.setData(integer);
		
		System.out.println(sample1.getData() + " " + sample2.getData());
		keyboard.close();
  }
}