import java.util.Scanner;
import java.util.Arrays;
//public class Main{
//	public static void main(String[] args){
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		kalkul(s, a, b);
//	}
//	public static int sum(int a, int b){
//		return a+b;
//	}
//	public static int minus(int a, int b){
//		return a-b;
//	}
//	public static void kalkul(String s, int a, int b){
//		if (s.equals("summa")){
//			System.out.println(sum(a, b));
//		}
//		if (s.equals("minus")){
//			System.out.println(minus(a, b));
//		}
//	}
//}

public class Lesson5{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		System.out.println(Arrays.toString(intMassive(5)));
		int[][] matrix = intMatrix(4, 3);
		for (int i = 0; i< 4; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
		
	}
	public static int[] intMassive(int lenght){
		
		int[] arr = new int[lenght];
		for (int i = 0; i<lenght; i++){
			arr[i] = (int)(Math.random() * 100);
		}
		return arr;
	}
	public static int[][] intMatrix(int n, int m){
		int[][] matrix = new int[n][m];
		for (int i = 0; i<n; i++){
			for (int j = 0; j<m; j++){
				matrix[i][j] = (int) (Math.random() * 100);
			}
		}
		return matrix;
	}
	
}