import java.util.Scanner;

class Matrix {
  static int calDeterminant(int[][] a){
    int result;
     result=a[0][0]*(a[1][1]*a[2][2]-a[2][1]*a[1][2])-a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])+a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]); 
     return result;
    }
  }

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		
		for (int i = 0; i < 9; i++)
			matrix[i / 3][i % 3] = keyboard.nextInt();
		
		System.out.println(Matrix.calDeterminant(matrix));
		keyboard.close();
  }
}