package ISP;

public class Main {
    public static void main(String[] args) {
        HumanWorker person = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        person.eat();
        person.work();
        person.clean();

        robot.clean();
        robot.work();
//        robot.eat(); - А он не умеет кушать, и если бы это было в одном интерфейсе,
//        то нам пришлось бы делать переопределение, которое выводило бы ошибку, что не есть хорошо.
    }
}
