import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		
		int[] array1 = new int[30];
		int counter = 1;
		for (int i = 0; i< array1.length-1; i++){
			array1[i] = counter++;
			counter++;
			System.out.println("i = " + array1[i]);
		}
		
		for(int j:array1){
			
			System.out.println(j);
		}
		
		System.out.println(Arrays.toString(array1));
		
		int [][] arr1 = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0; j < arr1[i].length; j++){
				System.out.print(arr1[i], arr1[j]);
			}
		}		
		
	}
} 