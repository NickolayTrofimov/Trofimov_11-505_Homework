import java.util.Scanner;
import java.util.Random;

public class Flowchart {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        int key = 0;
        int pocket = 5;
        int pocketWithKey = random.nextInt(1, 6);
        int oborot = 4;
        int oborotForOpenning = random.nextInt(1, 5);
        int sideOfKey = 2;
        int sideThatNeed = random.nextInt(1, 3);
        
        System.out.println("Начинаем поиск ключа...");
		
        int i = 1;
        while (i <= pocket) {
            if (i == pocketWithKey) {
                System.out.println("Нашли ключ в кармане " + i + " и достали его!");
                key = 1;
                break;
            } 
			else {
                System.out.println("Ключ не в кармане " + i);
            }
            i += 1;
        }
		
        if (key == 0) {
            System.out.println("Ключ не найден. Дверь не открыть.");
            return;
        }
		
        System.out.println("Вставить ключ в замочную скважину? (да/нет)");
        String otvet1 = scan.nextLine();
        
        if (otvet1.equals("нет")) {
            System.out.println("Ну тогда уходите.");
            return;
        }
        
        if (otvet1.equals("да")) {
            int k = 1;
            boolean keyInserted = false;
            
            while (k <= sideOfKey) {
                if (k == sideThatNeed) {
                    System.out.println("Вы вставили ключ правильной стороной в замочную скважину!");
                    keyInserted = true;
                    break;
                } 
				else {
                    System.out.println("Вы вставляете не той стороной. Попробуйте другую сторону.");
                    k++;
                }
            }
            
            if (keyInserted == false) {
                System.out.println("Не удалось вставить ключ.");
                return;
            }
			
            System.out.println("Повернуть ключ? (да/нет)");
            String otvet2 = scan.nextLine();
            
            if (otvet2.equals("нет")) {
                System.out.println("Вы странный... Ключ в замке, но не поворачиваете его.");
                return;
            }
            
            if (otvet2.equals("да")) {
                int c = 1;
                boolean doorUnlocked = false;
                
                while (c <= oborot) {
                    if (c == oborotForOpenning) {
                        System.out.println("Замок открыт!");
                        doorUnlocked = true;
                        break;
                    } 
					else {
                        System.out.println("Нужно повернуть ещё.");
                        c++;
                    }
                }
                
                if (doorUnlocked == false) {
                    System.out.println("Не удалось открыть замок.");
                    return;
                }
				
                System.out.println("Потянуть за ручку, чтобы открыть дверь? (да/нет)");
                String otvet3 = scan.nextLine();
                
                if (otvet3.equals("да")) {
                    System.out.println("Дверь открыта! Вы можете войти.");
                } 
				else {
                    System.out.println("Дверь так и осталась закрытой.");
                }
            } 
			else {
                System.out.println("Некорректный ответ.");
            }
        } 
		else {
            System.out.println("Некорректный ответ. Ожидалось 'да' или 'нет'.");
        }
    }
}