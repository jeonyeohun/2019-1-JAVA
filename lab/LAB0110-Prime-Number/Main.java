import java.util.Scanner;

class Prime {
  int num=1;
  int flag = 0;
  public int nextPrime(){
    num++;
      while(true){
        
        for(int j=2 ; j<num ; j++){
          if(num==2){
            break;
          }
          if (num%j == 0){
            flag = 1;
            break;
          }
        }
        if (flag == 0){
          return num;
        }
        else{
          num++;
          flag=0;
        }
      }
    }
  }


class Main {
  public static void main(String[] args) {
    Prime p = new Prime();
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		for (int i = 0; i < n; i++)
			System.out.println(p.nextPrime());
		
		keyboard.close();
  }
}