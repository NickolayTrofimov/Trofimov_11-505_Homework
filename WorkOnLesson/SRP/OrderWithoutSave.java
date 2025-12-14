package SRP;

public class OrderWithoutSave implements Print{

    @Override
    public void print(String print){
        System.out.println("Я могу вывести только информацию об " + print);
    }
}
