import java.util.Scanner;
public class Calculator {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Как к Вам можно обратиться");
		String name = scanner.next();
		
		System.out.println("Введите первое значение");
		float a = scanner.nextFloat();
		
		System.out.println("Введите операцию (+, -, *, /)");
		String operation = scanner.next();
		
		System.out.println("Введите второе значение");
		float b = scanner.nextFloat();
		
		float result;
		switch (operation){
			case "+" :
				result = a + b;
				System.out.println(name + " ваш результат:" + result);
				break;
			case "-" :
				result = a - b;
				System.out.println(name + " ваш результат:" + result);
				break;
			case "*" :
				result = a * b;
				System.out.println(name + " ваш результат:" + result);
				break;
			case "/" :
				if (b == 0) {
					System.out.println("На 0 делить нельзя");
					break;
				}
				result = a / b;
				System.out.println(name + " ваш результат:" + result);
				break;
			default:
				System.out.println("Неизвестная операция");
		}
		
	}
}