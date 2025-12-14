package ISP;

public class HumanWorker extends Worker implements Work, Eat{

    @Override
    public void eat(){
        System.out.println("Я поел");
    }

    @Override
    public void work(){
        System.out.println("Я работаю");
    }

    @Override
    public void clean(){
        System.out.println("Я убираюсь");
    }
}
