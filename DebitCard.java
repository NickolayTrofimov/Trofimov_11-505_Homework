public class DebitCard extends Transaction{

    public DebitCard(int amount, int id) {
        super(amount, id);
    }

    @Override
    public void doTransaction(int amount) {
        System.out.println("Оплата картой " + amount);
    }
}