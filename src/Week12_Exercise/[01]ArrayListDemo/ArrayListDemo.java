import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo{
  public static void main (String []args){
    ArrayList<String> toDoList = new ArrayList<String>(); // 스트링 wrapper class 생성. 이름은 toDoList
    System.out.println("Enter items for the list, when prompted.");
    boolean done = false;
    Scanner kb = new Scanner (System.in);

    while(!done){
      System.out.println("Type an entry: ");
      String entry = kb.nextLine(); // 한줄씩 읽어서 저장
      toDoList.add (entry); // entry에 저장된 값을 toDoList에 추가하기
      System.out.print("More items for the list? ");
      String ans = kb.nextLine();
      if(!ans.equalsIgnoreCase ("yes"))
        done = true;
    }
    System.out.println("The List contains: ");
    int listSize = toDoList.size(); // 리스트의 사이즈 리턴
    for (int position =0 ; position < listSize ; position++)
      System.out.println(toDoList.get (position)); // get 메서드로 인덱스에 있는 아이템 리턴

    // for each 를 사용하면 더 짧고 효율적으로 코딩이 가능하다. //
    for (String s : toDoList ) // for each 문. 파라미터 : 리스트이름 >> 리스트에서 하나씩 가져다가 파라미터 변수에 저장한다.
      System.out.println(s);

      kb.close();
  }
}
