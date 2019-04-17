public class Fruit{
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
}
