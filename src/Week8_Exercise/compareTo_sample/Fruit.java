public class Fruit implements Comparable{
  private String fruitName;
  public Fruit(){
    fruitName = "";
  }
  public Fruit(String name){
    fruitName = name;
  }
  public void setName(String name){
    fruitName = name;
  }
  public String getName(){
    return fruitName;
  }

  public int compareTo (object o){
    if ((o != null) && (o instanceof Fruit)){ // instanceof >> 형번환이 가능한지 알아보기. o가 Fruit 를 상속하는 객체라면 true 반환
      Fruit otherFruit = (Fruit) o;
      return (fruitName.compareTo(otherFruit.fruitName));
    }
    return -1;
  }
}
