import java.util.Scanner;
public class Lesson5 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		 String[] otvets = {"nickname", "age", "email", "proff"};
		 String[] nickname = new String[5];
		 int[] age = new int[5];
		 String[] email = new String[5];
		 String[] proff = new String[5];
		for (int i = 0; i< 5; i++){
			System.out.print(" nick " + (i+1) + " : ");
			nickname[i] = scan.nextLine();
			System.out.print(" age " + (i+1) + " : ");
			age[i] = scan.nextInt();
			scan.nextLine();
			System.out.print(" email " + (i+1) + " : ");
			email[i] = scan.nextLine();
			System.out.print(" proff " + (i+1) + " : ");
			proff[i] = scan.nextLine();
		}
		int maxLenNick = 0;
		String nickToPrint = "";
		for (String n : nickname){
			if (maxLenNick < n.length()){
				maxLenNick = n.length();
				nickToPrint = n;
			}
		}
		System.out.println("Самое длинное имя: " + nickToPrint);
		Double srAge = 0.0;
		for (int iAge : age){
			srAge += iAge;
		}
		System.out.println("Среднее арифметическое: " + (srAge/5));
		System.out.println("Измененные почты: ");
		for (int i = 0; i<5; i++){
			String emailName = email[i].replaceAll("@.*", "");
			System.out.println(emailName);
		}
		System.out.println("Всего профессий: " + proff.length);
	}
}