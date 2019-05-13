import java.util.HashMap; // 항상 페어가 되어야
public class HashMapDemo{
  public static void main (String[] args){
    HashMap <String, Integer> mountains = new HashMap<String, Integer>();// 문자열과 정수의 페
    mountains.put("Everest", 29029);
    mountains.put("K2", 28251);
    mountains.put("Kangchenjunga", 28169);
    mountains.put("Denali", 20335);
    printMap(mountains);

    System.out.println("Denali in the map: " + mountains.containsKey("Denali"));
    System.out.println();

    System.out.println("Changing height of Denali.");
    mountains.put("Denali", 20320); // 새로운 값으로 덮어씌운다.
    printMap(mountains);

    System.out.println("Removing Kangchenjunga.");
    mountains.remove("Kangchenjunga");
    printMap(mountains);
  }

  public static void printMap(HashMap<String, Integer> map){
    System.out.println("Map contains: ");
    for (String keyMountainName : map.keySet()){ // keySet 은 키를 리턴한다. 여기서는 스트링데이터타입으로 저장된 키를 리턴함
      Integer height = map.get(keyMountainName); // 키를 넣으면 value가 리턴된다. 정수타입이 value
      System.out.println(keyMountainName + " --> " + height.intValue() + "feet.");
    }
    System.out.println();
  }
}
