public class ExpressOrder extends SimpleOrder{
    private int addPayment = 500; // Надбавка за срочность
    private int deliveryDays;

    public ExpressOrder(int number, int date, int maxItems, int deliveryDays) {
        super(number, date, maxItems);
        this.deliveryDays = deliveryDays;
    }

    @Override
    public int getSumOfOrder(){
        int price = super.getSumOfOrder();
        int totalPrice = price + addPayment;
        return totalPrice;
    }

    public int getDeliveryDays(){
        return deliveryDays;
    }

    public void setDeliveryDays(int deliveryDays) {
        if (deliveryDays > 0) {
            this.deliveryDays = deliveryDays;
        } else {
            System.out.println("Срок доставки должен быть положительным числом!");
        }
    }
}
