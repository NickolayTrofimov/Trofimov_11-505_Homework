import java.util.Scanner;
public class GogleForm {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите кол-во участников опроса: "); int cl = scan.nextInt();
		scan.nextLine();
		
		int i = 0;
		String[] nickname = new String[cl];
		int[] age = new int[cl];
		String[] profession = new String[cl];
		String[] email = new String[cl];
		String[] adress = new String[cl];
		String[] tg = new String[cl];
		String[] emailWithOut = new String[cl];
		
		String longestNick = "";
		int srAge = 0;
		int counter = 0;
		char myChar = '@';
		

		
		while (i < cl) {
			System.out.println("Введите ваше имя: "); nickname[i] = scan.nextLine();
			if (longestNick.length() < nickname[i].length()) {
				longestNick = nickname[i];
			}
			
			System.out.println("Введите ваш возраст: "); age[i] = scan.nextInt();
			srAge = srAge + age[i];
			scan.nextLine();
			
			System.out.println("Введите вашу профессию"); profession[i] = scan.nextLine();
			
			System.out.println("Введите вашу электронную почту: "); email[i] = scan.nextLine();
			String proba = "";
			for (int j = 0; j < email[i].length(); j++) {
				char ch = email[i].charAt(j);
				if (ch != myChar) {
					proba = (String) (proba + ch);
				}
				else {
					break;
				}
			}
			emailWithOut[i] = proba;
			
			System.out.println("Введите ваш адрес проживания: "); adress[i] = scan.nextLine();
			System.out.println("Введите ваш тг: "); tg[i] = scan.nextLine();
			
			i = i + 1;
		}
		
		for (int k = 0; k < cl; k++) {
			for (String proverka : profession) {
				if (proverka.equals(profession[k])) {
					counter = counter + 1;
				}
			}
		}
		counter = (counter - cl) / 2;
		
		System.out.println("Самый длинное имя: " + longestNick);
		System.out.println("Средний возраст: " + (srAge / cl));
		System.out.println("Кол-во профессий без повторов: " + (profession.length - counter));
		System.out.println("Почтовые адреса: ");
		
		for (int c = 0; c < cl; c++) {
			System.out.println(emailWithOut[c]);
		}
	}
}