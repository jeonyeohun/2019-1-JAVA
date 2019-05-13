import java.util.HashSet;
public class HashSetDemo{
  public static void main (String[] args){
    HashSet<Integer> intSet = new HashSet <Integer>(); //해쉬셋 선언
    intSet.add(2); // 요소 추가
    intSet.add(7);
    intSet.add(7); // 중복되는 요소는 추가하지 않는다.
    intSet.add(3);
    printSet(intSet);

    System.out.println("Set contains 2: " + intSet.contains(2)); // contains() 인수로 전달된 값이 해쉬셋 안에 있는지 확인 (true/false)
    System.out.println("Set contains 3: " + intSet.contains(3));
  }

  public static void printSet(HashSet<Integer> intSet){
    System.out.println("The set contains: ");
    for (Object obj : intSet.toArray()){
      Integer num = (Integer) obj;
      System.out.println(num.intValue());
    }
  }
}
