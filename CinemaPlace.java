import java.util.Scanner;
public class Proba { 
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Количесвто ребят: "); int groupSize = scanner.nextInt();
		System.out.println("Сколько Ваня хочет потратить денег на билет: "); float vanymax = scanner.nextFloat();
		System.out.println("Сколько Андрея хочет потратить денег на билет: "); float andreymax = scanner.nextFloat();
		System.out.println("Сколько Катя хочет потратить денег на билет: "); float katyamin = scanner.nextFloat();
		System.out.println("Сколько Вика может добавить денег на билет: "); float vikadop = scanner.nextFloat();
		System.out.println("Шаг цены на фильмы 2D: "); float priseStep2D = scanner.nextFloat();
		System.out.println("Шаг цены на фильмы 3D: "); float priseStep3D = scanner.nextFloat();
		System.out.println("Скида на билеты по придъявлении студенческого билета: "); float skidka = scanner.nextFloat();
		
		System.out.println("Ваня хочет на 3D (введите true или false)"); boolean vanya3D = scanner.nextBoolean();
		System.out.println("Андрей хочет на 3D (введите true или false)"); boolean andrey3D = scanner.nextBoolean();
		System.out.println("Вика хочет на 3D (введите true или false)"); boolean vika3D = scanner.nextBoolean();
		System.out.println("Катя хочет на 3D (введите true или false)"); boolean katya3D = scanner.nextBoolean();
		System.out.println("Ваня хочет на 2D (введите true или false)"); boolean vanya2D = scanner.nextBoolean();
		System.out.println("Андрей хочет на 2D (введите true или false)"); boolean andrey2D = scanner.nextBoolean();
		System.out.println("Вика хочет на 2D (введите true или false)"); boolean vika2D = scanner.nextBoolean();
		System.out.println("Катя хочет на 2D (введите true или false)"); boolean katya2D = scanner.nextBoolean();
		
		
		boolean GoTo3D = vanya3D && andrey3D && vika3D && katya3D;
		boolean GoTo2D = vanya2D && andrey2D && vika2D && katya2D;
		float currentPrice3D = 0;
		float currentPrice2D = 0;
		
		if (GoTo3D == true) { 
			System.out.println("Они пойдут в 3D");
			System.out.println("Цена на билет без скидки:");
			currentPrice3D = priseStep3D;
			while (currentPrice3D <= vanymax + 1) {
				if (currentPrice3D >= katyamin && currentPrice3D <= vanymax){
					float priceWithOutSkidka3D = currentPrice3D;
					float priceWithSkidka3D = (1-(skidka/100)) * priceWithOutSkidka3D;
					System.out.println("---" + priceWithOutSkidka3D + "---");
					System.out.println("Цена со скидкой, при придъявлении студенческого билета:");
					System.out.println("---" + priceWithSkidka3D + "---");
					break;
				}
				currentPrice3D = currentPrice3D + priseStep3D;
			}
		}
		if (GoTo2D == true) {
			System.out.println("Они пойдут в 2D");
			System.out.println("Цена на билет без скидки:");
			currentPrice2D = priseStep2D;
			while (currentPrice2D <= vanymax + 1) {
				if (currentPrice2D >= katyamin && currentPrice2D <= vanymax){
					float priceWithOutSkidka2D = currentPrice2D;
					float priceWithSkidka2D = (1-(skidka/100)) * priceWithOutSkidka2D;
					System.out.println("---" + priceWithOutSkidka2D + "---");
					System.out.println("Цена со скидкой, при придъявлении студенческого билета:");
					System.out.println("---" + priceWithSkidka2D + "---");
					break;
				}
				currentPrice2D = currentPrice2D + priseStep2D;
			}
		}		
		
        int[] occupied = new int[30];
		for (int i = 0; i < 7; i++) occupied[i] = i+1;
		for (int i = 10; i < 13; i++) occupied[i] = i+1;
		for (int i = 14; i < 17; i++) occupied[i] = i+1;
		for (int i = 21; i < 24; i++) occupied[i] = i+1;
		for (int i = 25; i < 30; i++) occupied[i] = i+1;
		
		int j = 0;
		int lastPlace = 0;
		int counter = 0;
		
		while (counter < 5 && j <= 30 - groupSize) {
			if (occupied[j] == 0){
				counter += 1;
			}
			else {
				if (counter == 4) {
					lastPlace = j;
					System.out.println("Номера посадочных мест с " + lastPlace + " по " + (lastPlace - groupSize + 1) + " в обратном порядке");
					break;
				}
				else {
					counter = 0;
				}
			}
			j += 1;
		}
		
		float price = 0;
		if (GoTo3D == true) {
			price = currentPrice3D;
		}
		else {
			price = currentPrice2D;
		}
		
		int seat = 0;
		float totalCost = 0;
		for (int i = 0; i < groupSize; i++ ) {
			seat = lastPlace - i;
			if (seat >= 10 && seat <= 20){
				price = (float)(price * 1.05);
			}
			totalCost += price;
		}
		System.out.println("Общая стоимость билетов: " + totalCost);
	}
}	