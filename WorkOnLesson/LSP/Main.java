package LSP;

public class Main {
    public static void main(String[] args) {
        Bird pinguin = new Pinguin();
        Bird sparrow = new Sparrow();
        Sparrow sparrow1 = new Sparrow();

        pinguin.eat();
//        pinguin.fly(); - Пингвин не умеет летать, и здесь всё норм.

        sparrow.eat();
//        sparrow.fly(); - А воробей умеет, и как быть?

        sparrow1.eat();
        sparrow1.fly(); // У нас есть наследник, который умеет всё, что умела птица, но также умеет летать.
    }
}
