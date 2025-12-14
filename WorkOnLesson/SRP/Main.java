package SRP;

public class Main {
    public static void main(String[] args) {
        String product = "Колбаски";
        Order newOrder = new Order(product, 2);
        OrderWithoutSave newOrderW = new OrderWithoutSave();

        newOrder.print(product);
        newOrder.save();

        newOrderW.print(product);
    }
}
