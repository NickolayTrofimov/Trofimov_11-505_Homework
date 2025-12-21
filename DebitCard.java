public class DebitCard extends Transaction{

    @Override
    public void doTransaction(int amount) {
        System.out.println("Оплата картой " + amount);
    }
}