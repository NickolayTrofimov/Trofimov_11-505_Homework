package DIP;

public class DebitSBP implements BankCard, Transaction{

    @Override
    public void cardReturn() {
        System.out.println("Онлайн карат ");
    }

    @Override
    public void doTransaction(int amount) {
        System.out.println("Оплата по СБП " + amount);
    }

}