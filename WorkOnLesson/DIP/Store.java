package DIP;

public class Store {
    private Transaction transaction;


    public Store(Transaction transaction){
        this.transaction = transaction;
    }

    public void toPay (int price, int amount){
        if (price <= transaction.getAvailableAmount(amount)){
            System.out.println("Оплата прошла успешно");
        }
        else {
            System.out.println("Недостаточно средств");
        }
    }

}
