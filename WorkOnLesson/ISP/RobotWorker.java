package ISP;

public class RobotWorker extends Worker implements Work{

    @Override
    public void work(){
        System.out.println("Я работаю");
    }

    @Override
    public void clean(){
        System.out.println("Я убираюсь");
    }
}
