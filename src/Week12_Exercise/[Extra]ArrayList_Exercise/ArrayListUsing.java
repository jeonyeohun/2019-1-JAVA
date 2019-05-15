import java.util.ArrayList;

public class ArrayListUsing{
  private static ArrayList<Integer> mArrayList;
  public static void main (String[]args){
    mArrayList = new ArrayList<Integer>(); // ArrayList 생성

    // ArrayList에 값 추가하기 //
    mArrayList.add(1);
    mArrayList.add(2);
    mArrayList.add(3);

    // ArrayList 값 확인 //
    // ArrayList의 사이즈를 확인 하는 메소드 : .size()
    for (int i=0 ; i<mArrayList.size() ; i++) {
      // .get(int) 메소드의 인덱스값을 넣으면 ArrayList 안에 해당 인덱스에 들어있는 값이 반환된다.
      System.out.println("one index " + i + " : value " + mArrayList.get(i));
    }
    System.out.println();

    mArrayList.remove(0); // 0번째 인덱스에 있는 값을 제거, 1번째에 있던 값이 0번째로 이동. 모든 인덱스가 한칸씩 앞으로 당겨온다.
    for (int i=0 ; i<mArrayList.size() ; i++) {
      System.out.println("two index " + i + " : value " + mArrayList.get(i));
    }
    System.out.println();

    mArrayList.add(0, 7777); // 0번째 인덱스에 새로운 값을 추가. 원래 있던 값들은 한칸씩 뒤로 이동한다.
    for (int i=0 ; i<mArrayList.size() ; i++) {
      System.out.println("three index " + i + " : value " + mArrayList.get(i));
    }
    System.out.println();

    mArrayList.set(0, 7779); // 0번째 인덱스에 있는 값을 새로운 값으로 수정. 인덱스는 변함없다.
    for (int i=0 ; i<mArrayList.size() ; i++) {
      System.out.println("four index " + i + " : value " + mArrayList.get(i));
    }
    System.out.println();

    Integer checkNumber = new Integer(99999); // wrapper class 로 99999를 만든다.
    mArrayList.add(checkNumber);
    // .contians() 메소드로 값이 리스트 안에 들어있는지 확인. 들어있으면 true, 안들어있으면 false 반환
    boolean isFind = mArrayList.contains(checkNumber);
    for (int i=0 ; i<mArrayList.size() ; i++) {
      System.out.println("five index " + i + " : value " + mArrayList.get(i));
    }
    System.out.println();

    // .indexOf() 메소드로 인자로 전달되는 값이 몇번쨰 인덱스에 있는지 반환
    int index = mArrayList.indexOf(checkNumber);
    System.out.println("six : index " + index + "\n");

    // ArrayList 의 값 전체 다 삭제
    mArrayList.clear();
    System.out.println("seven : size " + mArrayList.size() + "\n");

    // ArrayList가 비어 있는지 확인하기
    boolean isEmpty = mArrayList.isEmpty();
    System.out.println("eight : empty " + isEmpty + "\n");

  }

}
