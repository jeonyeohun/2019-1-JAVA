import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_main{
  public static void main(String[] args){
    LinkedList<String> list = new LinkedList <String>();
    list.add("One");
    list.add("Two");
    list.add("Three");

    Iterator<String> itr = list.iterator();
    System.out.println("Printing elements using Iterator");
    System.out.println("Deleting \"Two\" using Iterator");

    while(itr.hasNext()){
      String curStr = itr.next();
      System.out.println(curStr);
      if(curStr.compareTo("Two") == 0)
        itr.remove();
    }

    System.out.println("Printing elements using Iterator");
    itr = list.iterator();
    while(itr.hasNext());
    System.out.println(itr.next());
  }
}
