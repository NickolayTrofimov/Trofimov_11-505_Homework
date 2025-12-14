package LSP;

public class Sparrow extends Bird implements Fly{

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}