import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MethodString {
    public static void main(String[] args) {
        polindromv1("А роза упала на лапу Азора");
        polindromv2("А роза упала на лапу Азора");
        polindromv3("А роза упала на лапу Азора");
        deleteSymbolsv1("UFKFKffff");
        deleteSymbolsv2("UFFFKFKKAKaaffff");
        firstIndSymbol("UFFFKFKKAKaaffff");
        replaceSymbols("А роза упала на лапу Азора");
        countOfWords("А роза упала на лапу Азора");
        equalWordsv1("Шиншила", "ШИНШИЛА");
        equalWordsv2("Шиншила", "ШИНШИЛА");
        equalWordsv3("Шиншила", "ШИНШИЛА");
        equalWordsv4("Шиншила", "ШИНШИЛА");
        phoneNumber("89600362223");
        phoneNumber("+7 (960) 036-22-23");
        nums("1.2342, 1232, fdsdsf, 1.43fgfdgd21, bfd2");
        replaceSpaces("     А     роза   упала  на лапу Азора   ");
        validMail("Tnd552005@gmail.com");
        returnInfov1("Молоко", 85.4578);
        returnInfov2("Молоко", 85.4578);
        String[] fraze = {"А", "роза", "упала", "на", "лапу", "Азора"};
        joiningArray(fraze);
    }

    public static void polindromv1(String word){
        word = word.toLowerCase().replaceAll("\\s*", "");
        boolean flag = true;
        int start = 0;
        int end = word.length();
        char[] proverka = new char[end - start];
        word.getChars(start, end, proverka, 0);
        char[] perevert = new char[end - start];
        for (int i = 0; i < end; i++){
            perevert[i] = proverka[end - i - 1];
        }
        for (int i = 0; i < end; i++){
            if (proverka[i] == perevert[i]){
                flag = true;
            }
            else {
                flag = false;
            }
        }
        if(flag){
            System.out.println(word + " - Это полиндром");
        }
        else{
            System.out.println(word + " - Это не полиндром");
        }
    }

    public static void polindromv2(String word) {
        word = word.toLowerCase().replaceAll("\\s", "");
        boolean flag = true;
        int start = 0;
        int end = word.length() - 1;

        for (int i = 0; i <= end / 2; i++) {
            if (word.charAt(i) != word.charAt(end - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(word + " - Это полиндром");
        } else {
            System.out.println(word + " - Это не полиндром");
        }
    }

    public static void polindromv3(String word) {
        word = word.toLowerCase();
        boolean flag = true;
        char[] proverka = word.toCharArray();
        for (int i = 0; i < proverka.length; i++) {
            if (proverka[i] == proverka[proverka.length - 1 - i]) {
                flag = true;
            }
            else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(word + " - Это полиндром");
        } else {
            System.out.println(word + " - Это не полиндром");
        }
    }

    public static void deleteSymbolsv1(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (i == word.indexOf(word.charAt(i))) {
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void deleteSymbolsv2(String word) {
        String result = "";
        result += word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(i - 1)) {
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void firstIndSymbol(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
                result += word.charAt(i);
                break;
            }
        }
        System.out.println(result);
    }

    public static void replaceSymbols(String word){
        String result = word.replace("а", "@");
        System.out.println(result);
    }

    public static void countOfWords(String sentence) {
        int counter = 0;
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            counter += 1;
        }
        System.out.println(counter);
    }

    public static void equalWordsv1(String word1, String word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if (word1.equals(word2)){
            System.out.println("Они одинаковы");
        }
        else {
            System.out.println("Они не одинаковы");
        }
    }

    public static void equalWordsv2(String word1, String word2) {
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Они одинаковы");
        }
        else {
            System.out.println("Они не одинаковы");
        }
    }

    public static void equalWordsv3(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] firstWord = word1.toCharArray();
        char[] secondWord = word1.toCharArray();
        boolean flag = true;
        for (int i = 0; i <= word1.length() - 1; i++){
            if(firstWord[i] != secondWord[i]){
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Они одинаковы");
        }
        else {
            System.out.println("Они не одинаковы");
        }
    }

    public static void equalWordsv4(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] firstWord = new char[word1.length()];
        char[] secondWord = new char[word2.length()];
        boolean flag = true;
        for(int i = 0; i <= word1.length() - 1; i++){
            firstWord[i] = word1.charAt(i);
        }
        for(int i = 0; i <= word2.length() - 1; i++){
            secondWord[i] = word2.charAt(i);
        }
        for (int i = 0; i <= word1.length() - 1; i++){
            if(firstWord[i] != secondWord[i]){
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Они одинаковы");
        }
        else {
            System.out.println("Они не одинаковы");
        }
    }

    public static void phoneNumber(String number) {
        if (number.matches("8[0-9]{10}") || number.matches("\\+7 \\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}")){
            System.out.println("Номер соответствует");
        }
        else {
            System.out.println("Номер не соответствует");
        }
    }

    public static void nums(String digits) {
        Pattern pattern = Pattern.compile("-?\\d+(?:\\.\\d+)?");
        Matcher matcher = pattern.matcher(digits);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void replaceSpaces(String text) {
        System.out.println(text.strip().replaceAll("\\s+", " "));
    }

    public static void validMail(String mail) {
        if (mail.matches("[\\w]+@[\\w]+(\\.[\\w]+)")) {
            System.out.println("Почтовый адрес корректный");
        }
        else {
            System.out.println("Почтовый адрес не корректный");
        }
    }

    public static void returnInfov1(String name, double price) {
        System.out.println(String.format("Товар: %s, Цена: %.2f руб.", name, price));
    }

    public static void returnInfov2(String name, double price){
        String cost = String.valueOf(price);
        int dotIndex = cost.indexOf(".");
        String beforeDot = cost.substring(0, dotIndex);
        String afterDot = cost.substring(dotIndex, dotIndex + 3);
        cost = beforeDot + afterDot;
        System.out.println("Товар: " + name + " Цена: " + cost + " руб.");
    }

    public static void joiningArray(String[] fraze) {
        System.out.println(String.join("; ", fraze));
    }
}