import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class SLG {
    public static void main(String[] args){
        start();
    }

    public static void start () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в демо-версию нашей неизвестной игры.\nВсё что здесь происходит, является вымыслом автора и не имеет никакого отношения к реальному миру!");
        System.out.println("Самое главное правило - это отвечать на вопросы игры, используя слова, которые тебе будут данны на выбор.\nЕсли вы захотите закончить игру досрочно, просто напишите \"Закончить игру \"");
        String otvet1;
        boolean validAnswer = false;

        do {
            System.out.println("Вы хотите начать игру? \"да/нет\"");
            otvet1 = scan.nextLine().toLowerCase();

            switch (otvet1){
                case "да" :
                    System.out.println("Отлично, тогда давай начинать)");
                    choiceOfLocation();
                    break;
                case "нет" :
                    System.out.println("Хорошо, надеюсь ещё увидимся!");
                    System.exit(0);
                case "закончить игру" :
                    System.out.println("Хорошо, надеюсь ещё увидимся!");
                    System.exit(0);
                default :
                    System.out.println("Я же вроде сказал как надо отвечать!");
                    validAnswer = true;
            }
        } while (validAnswer);
    }

    public static void choiceOfLocation () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Представим, что здесь есть какое-нибудь предисловие. \nИ так, теперь надо определиться с местом, где вы хотите начать игру.\nПока что вы можете выбрать лишь два места: лес или город.");
        String otvet2;
        boolean validAnswer = false;

        do {
            System.out.println("Куда отправимся?");
            otvet2 = scan.nextLine().toLowerCase();

            switch (otvet2){
                case "лес" :
                    System.out.println("Подождите, идёт перемещение...");
                    forest();
                    break;
                case "город" :
                    System.out.println("Подождите, идёт перемещение...");
                    city();
                    break;
                case "закончить игру" :
                    System.out.println("Хорошо, надеюсь ещё увидимся!");
                    System.exit(0);
                default :
                    System.out.println("Другие локации пока не доступны");
                    validAnswer = true;
            }
        } while (validAnswer);
    }

    public static void forest () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Каким-то чудом вы попали в лес. Вы осмотрелись по сторонам.\nС одной стороны вы увидели дорогу, а с другой ничего не было, кроме дремучего леса. \nКуда отправитесь дальше?");
        String otvet3;
        boolean validAnswer = false;

        do {
            System.out.println("Пойти в глубь леса/пойти к дороге");
            otvet3 = scan.nextLine().toLowerCase();

            switch (otvet3){
                case "пойти в глубь леса" :
                    System.out.println("Вы идёте в дремучую чащу. Тишина вокруг сильно давит на вас.\nВдруг вы слышите хруст ветки рядом с вами.\nВы повернулись, чтоб посмотреть что там такое, и...\nК сожелению это был огормный бурый медведь, который вас съел, оставив лишь кости для ворон.\nПовезёт в следующий раз)");
                    System.exit(0);
                case "пойти к дороге" :
                    System.out.println("Подождите, идёт перемещение...");
                    road();
                    break;
                case "закончить игру" :
                    System.out.println("Хорошо, надеюсь ещё увидимся!");
                    System.exit(0);
                default :
                    System.out.println("Дргуие действия пока не доступны");
                    validAnswer = true;
            }
        } while (validAnswer);
    }

    public static void city () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Каким-то чудом вы попали в город. Вы осмотрелись по сторонам.\nС одной стороны вы увидели машину, а с другой была дверь в здание, откуда доносился чей-то голос");
        String otvet4;
        boolean validAnswer = false;

        do {
            System.out.println("Пойти в здание/пойти к машине");
            otvet4 = scan.nextLine().toLowerCase();

            switch (otvet4){
                case "пойти в здание" :
                    System.out.println("Подождите, идёт перемещение...");
                    bulding();
                    break;
                case "пойти к машине" :
                    System.out.println("Вы подошли к машине и увидели, что у ней не было одного колеса.Вы решили осмотреть её.\nСначала вы открыли багажник, из полезного там оказалась только аптечка и бутылка воды.\nЗатем вы решили осмотреть салон, вы открыли заднюю дверь, и...\nНа вас набросилась бешеная собака, которая оторвала вам лицо. Вы не смогли пережить это нападение.\nПовезёт в следующий раз");
                    System.exit(0);
                case "закончить игру" :
                    System.out.println("Хорошо, надеюсь ещё увидимся!");
                    System.exit(0);
                default :
                    System.out.println("Другие действия пока не доступны");
                    validAnswer = true;
            }
        } while (validAnswer);
    }

    public static void road(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы вышли к дороге и наткнулись на лагерь с выжившеми. \nВы решили поговорить с одним из них, и узнали, что они идут из небольшого населённого пункта, где находится одна из основных баз выживших. Сами они держат путь в сторону гор.");
        String otvet4;
        boolean validAnswer = false;

        do {
            System.out.println("Пойти с ними/пойти к базе");
            otvet4 = scan.nextLine().toLowerCase();

            switch (otvet4){
                case "пойти к базе" :
                    System.out.println("Подождите, идёт перемещение...");
                    base();
                    break;
                case "пойти с ними" :
                    System.out.println("На этом пока всё. Спасибо, что поучаствовали в нашей игре!\nНе забудьте оставить отзыв и поделится о ней с друзьями!\nМб сделаю продолжение)");
                    System.exit(0);
                case "закончить игру" :
                    System.out.println("Хорошо, надеюсь ещё увидимся!");
                    System.exit(0);
                default :
                    System.out.println("Другие действия пока не доступны");
                    validAnswer = true;
            }
        } while (validAnswer);
    }

    public static void base(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Выживший передал вам записку с паролем, но она была зашифрована. Перед тем как зайти на базу, вам надо её расшифровать.\nТакже он сказал, что если, у вас не получится расшифровать, то вы можете перелезть через забор с восточной стороны, но это очень рискова.\nВы дошли до входа на базу, о которой вам говорили. Ваши действия...");
        String otvet4;
        boolean validAnswer = false;

        do {
            System.out.println("Расшифровать записку/ попытаться перелесть");
            otvet4 = scan.nextLine().toLowerCase();

            switch (otvet4){
                case "расшифровать записку" :
                    System.out.println("Давайте подумаем...");
                    String password = "6ва57зе99лин";
                    boolean validPassword = false;
                    do {
                        String result = removeCharacters();
                        if (result.equals(password)) {
                            System.out.println("У вас получилось, вы прошли на базу.\nНа этом пока всё. Спасибо, что поучаствовали в нашей игре!\nНе забудьте оставить отзыв и поделится о ней с друзьями!\nМб сделаю продолжение)");
                            System.exit(0);
                        } else {
                            System.out.println("Пароль не верный!");
                            validPassword = true;
                        }
                    } while (validPassword);
                    break;
                case "попытаться перелесть" :
                    System.out.println("Вас заметила охрана и открыла огонь без предупреждения.\nВы не выжили(\nПовезёт в следующий раз");
                    System.exit(0);
                case "закончить игру" :
                    System.out.println("Хорошо, надеюсь ещё увидимся!");
                    System.exit(0);
                default :
                    System.out.println("Другие действия пока не доступны");
                    validAnswer = true;
            }
        } while (validAnswer);
    }

    public static String removeCharacters() {
        Scanner scanner = new Scanner(System.in);
        String password = "**:(6ва57**зе;*%99л*~и:н:?";
        System.out.print("Записка:" + password);
        System.out.print("\nВведите символы для удаления (без пробелов): ");
        String charsToRemove = scanner.nextLine();
        return removeCharsFromString(password, charsToRemove);
    }

    private static String removeCharsFromString(String input, String charsToRemove) {
        char[] result = new char[input.length()];
        int resultIndex = 0;
        char[] charsToDelete = charsToRemove.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean shouldRemove = false;
            for (char deleteChar : charsToDelete) {
                if (currentChar == deleteChar) {
                    shouldRemove = true;
                    break;
                }
            }
            if (!shouldRemove) {
                result[resultIndex++] = currentChar;
            }
        }
        return new String(result, 0, resultIndex);
    }

    public static void bulding(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы зашли в здание. Голосом оказалось радио, которое играло на всё помещение. Внутри было много всего необходимого для выживания, но единственный нюанс...\nВсё это было под решёткой с замком.\nВы прошли чуть внутрь, там сидел мужик.\nНемного поболтав с ним, вы поняли, что он может достать реально всё, естественно за определённую плату.\nВы захотели купить у него оружие, но денег у вас было не много.\nОн предложил сыграть в орёл решка. В качестве ставки были все ваши деньги и найденные вещи, он же ставил АК-74 и две пачки патрон");
        String otvet4;
        boolean validAnswer = false;
        String[] answers = {"Победил человек", "Победила машина", "Выявить победителя не удалось"};

        do {
            System.out.println("Сыграть / уйти");
            otvet4 = scan.nextLine().toLowerCase();

            switch (otvet4){
                case "сыграть" :
                    System.out.println("Ну чтож, понеслась...");
                    boolean flag = false;
                    String result = headsOrTails();
                    do {
                        if (result.equals(answers[0])){
                            System.out.println("Поздравляю, вы выйграли!\nНа этом пока всё. Спасибо, что поучаствовали в нашей игре!\nНе забудьте оставить отзыв и поделится о ней с друзьями!\nМб сделаю продолжение)");
                        } else if(result.equals(answers[1])){
                            System.out.println("К сожелению, вы проиграли!\nНа этом пока всё. Спасибо, что поучаствовали в нашей игре!\nНе забудьте оставить отзыв и поделится о ней с друзьями!\nМб сделаю продолжение)");
                        } else if(result.equals(answers[2])){
                            System.out.println("Ничья, играем ещё!");
                            flag = true;
                        }
                    } while (flag);
                    break;
                case "уйти" :
                    System.out.println("На этом пока всё. Спасибо, что поучаствовали в нашей игре!\nНе забудьте оставить отзыв и поделится о ней с друзьями!\nМб сделаю продолжение)");
                    System.exit(0);
                case "закончить игру" :
                    System.out.println("Хорошо, надеюсь ещё увидимся!");
                    System.exit(0);
                default :
                    System.out.println("Другие действия пока не доступны");
                    validAnswer = true;
            }
        } while (validAnswer);
    }

    public static String headsOrTails() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Привет! Ты попал в мини игру монетка");
        System.out.println("Ты можешь ввести неограниченное количество подбросов монеты и одну сторону монетки(Сторону можно выбрать один раз за всю игру).");
        System.out.println("Суть заключается в том, что ты должен победить робота, который будет противостоять тебе.");
        System.out.println("Давай начнем");
        String result = "";
        // Выбор стороны для робота
        String[] sides = {"орел", "решка"};
        int randomIndex = random.nextInt(sides.length);
        String robotChosenSide = sides[randomIndex];

        System.out.println("Выбери сторону монетки");
        String chosenSide = scan.nextLine();

        System.out.println("Выбери количество подбросов монеты");
        int numOfReps = scan.nextInt();

        int a = playerOrelReshka(numOfReps, chosenSide, sides);
        int b = robotOrelReshka(numOfReps, robotChosenSide, sides);

        System.out.println("Количество верно выброшенных сторон у человека:");
        System.out.println(a);

        System.out.println("Количество верно выброшенных сторон у робота:");
        System.out.println(b);

        if (a > b) {
            result = "Победил человек";
        } else if (a < b) {
            result = "Победила машина";
        } else if (a == b) {
            result = "Выявить победителя не удалось";
        }
        return result;
    }

    public static int playerOrelReshka(int numOfReps, String chosenSide, String [] sides) {
        Random random = new Random();
        String[] playerSides = new String [numOfReps];
        int countChosenSide = 0;
        for (int i = 0; i < numOfReps; i++) {
            int randomIndex = random.nextInt(sides.length);
            String side = sides[randomIndex];
            playerSides[i] = side;

            if (side.equals("решка")) {
                if (chosenSide.equals("решка")) {
                    countChosenSide++;
                }
            }
            if (side.equals("орел")) {
                if (chosenSide.equals("орел")) {
                    countChosenSide++;
                }
            }
        }
        return countChosenSide;
    }

    public static int robotOrelReshka(int numOfReps, String chosenSide, String [] sides) {
        Random random = new Random();
        String[] robotSides = new String [numOfReps];
        int countChosenSide = 0;
        for (int i = 0; i < numOfReps; i++) {
            int randomIndex = random.nextInt(sides.length);
            String side = sides[randomIndex];
            robotSides[i] = side;

            if (side.equals("решка")) {
                if (chosenSide.equals("решка")) {
                    countChosenSide++;
                }
            }
            if (side.equals("орел")) {
                if (chosenSide.equals("орел")) {
                    countChosenSide++;
                }
            }
        }
        return countChosenSide;
    }
}
