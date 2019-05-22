public class Petpair_main {
  public static void main (String[] args){
    Pet goodDog = new Pet("Dog", 5);
    Pet goodCat = new Pet("Cat", 4);
    PetPair pair = new PetPair(goodDog, goodCat);
    System.out.println("Our pair:");
    pair.writeOutput();
  }
}
