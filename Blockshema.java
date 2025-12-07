import java.util.Scanner;
import java.util.Random;
public class Project1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int key = 0;
        int pocket = 5;
        int pocketWihtKey = random.nextInt(1, 6);
        int oborot = 4;
        int oborotForOpenning = random.nextInt(1, 5);
        int sideOfKey = 2;
        int sideThatNeed = random.nextInt(1, 3);

        int i = 1;
        while(i <= pocket) {
            if (i == pocketWihtKey) {
                System.out.println("Нашли ключ и достали его");
                key = 1;
                break;
            }
            else {
                System.out.println("Ключ не  в этом кармане");
            }
            i += 1;
        }

        System.out.println("Вставить ключ в замочную скважину? \"да\\нет\"");
        String otvet1 = scan.nextLine();

        int k = 1;
        int proverka = 0;
        while(k <= sideOfKey){
            if(otvet1.equals("нет")){
                System.out.println("Ну тогда уходите");
                return;
            }
            if(key == 0){
                System.out.println("Вы не достали ключ");
                break;
            }
            if(otvet1.equals("да")){
                if(k == sideThatNeed) {
                    System.out.println("Вы вставили ключ в замочную скважину");
                    proverka = 3;
                    break;
                }
                else{
                    System.out.println("Вы вставляете не той стороной");
                    k += 1;
                }
            }
        }

        System.out.println("Повернуть ключ? \"да\\нет\"");
        String otvet2 = scan.nextLine();

        int c = 1;
        while(c <= oborot){
            if(otvet2.equals("нет")){
                System.out.println("Вы странный");
                return;
            }
            if (proverka != 3) {
                System.out.println("Вы не вставили ключ в замочную скважину");
                break;
            }
            if(otvet2.equals("да")){
                if(c == oborotForOpenning) {
                    System.out.println("Вы открыли дверь");
                    break;
                }
                else{
                    System.out.println("Нужно повернуть ещё");
                    c += 1;
                }
            }
        }

        System.out.println("Потяните за ручку, чтоб открыть дверь? \"да\\нет\"");
        String otvet3 = scan.nextLine();

        if(otvet3.equals("да")){
            System.out.println("Дверь открыта");
        }
        else{
            System.out.println("Досвидание");
        }
    }
}