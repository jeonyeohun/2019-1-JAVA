import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String s1, s2, s3;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Input three strings.");
    s1 = s.nextLine();
    s2 = s.nextLine();
    s3 = s.nextLine();
    
    if(s1.compareTo(s2)<0){
      System.out.println(s1 + " is before " + s2);
    }
    else if(s1.compareTo(s2)>0){
      System.out.println(s1 + " is after " + s2);
    }
    if(s3.compareTo(s2)<0){
      System.out.println(s3 + " is before " + s2);
    }
    else if(s3.compareTo(s2)>0){
      System.out.println(s3 + " is after " + s2);
    }

  }
}