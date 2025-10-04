import java.util.Scanner;

public class DZ_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Имя: ");
        String name = scan.nextLine();
		System.out.print("Введите операцию из предложенных (+, -, *, /): ");
        String operation = scan.nextLine();
        System.out.print("Первое число: ");
        double firstNumber = scan.nextDouble();
        System.out.print("Второе число: ");
        double secondNumber = scan.nextDouble();
		
        double result = 0;
		boolean isWork = true;
        
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    isWork = false;
                    System.out.println("На ноль делить нельзя!");
                }
                break;
        }
		if (isWork){
			System.out.println(name + " ваш результат: " + result);
        }
    }
}