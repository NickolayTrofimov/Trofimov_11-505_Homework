package DIP;

public class DebitCard implements BankCard, Transaction{

    @Override
    public void cardReturn(){
        System.out.println("Пластиковая карта ");
    }

    @Override
    public void doTransaction(int amount) {
        System.out.println("Оплата картой " + amount);
    }

}