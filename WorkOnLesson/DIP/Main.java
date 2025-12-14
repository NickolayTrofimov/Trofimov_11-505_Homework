package DIP;

public class Main {
    public static void main(String[] args) {
        BankCard visa = new DebitCard();
        BankCard sbp = new DebitSBP();
        int price1 = 1000;
        int price2 = 500;
        int amount = 666;

        visa.cardReturn();
        visa.doTransaction(amount);


        sbp.cardReturn();
        sbp.doTransaction(amount);

        Store magaz1 = new Store(sbp);
        magaz1.toPay(price1, amount);

        Store magaz2 = new Store(visa);
        magaz2.toPay(price2, amount);
    }
}
