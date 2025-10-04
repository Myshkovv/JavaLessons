import java.util.Arrays;

public class Lesson3{
	public static void main(String[] args){
		System.out.println("hello array");
		
		int[] arr1 = new int[10];
		System.out.println(arr1.length);
		
		for (int i = 0; i<arr1.length; i++){
			System.out.print(arr1[i]+ ", ");
		}
		
		for (int i = 0; i<arr1.length; i++){
			arr1[i] = i;
		}
		System.out.println();
		for (int i = 0; i<arr1.length;i++){
			System.out.print(arr1[i] + ", ");
		}
		System.out.println();

		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Arrays.deepToString(arr1));
		
	}
}