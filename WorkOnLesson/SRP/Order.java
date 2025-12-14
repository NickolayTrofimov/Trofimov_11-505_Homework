package SRP;

public class Order implements Print,SaveDataBase{
    private String product;
    private int amount;
    public Order(String product, int amount){
        this.product = product;
        this.amount = amount;
    }

    @Override
    public void print(String product){
        System.out.println(product);
    }

    @Override
    public void save(){
        System.out.println("Данные были сохранены");
    }
}
