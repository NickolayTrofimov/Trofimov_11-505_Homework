public class Product {
    private int price;
    private String name;
    private int quantity;

    public void setProduct(int price, String name, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getTotalPrice(){
        return price * quantity;
    }
}
