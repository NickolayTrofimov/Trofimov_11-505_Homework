public class DebitSPB extends Transaction{

    public DebitSPB(int amount, int id) {
        super(amount, id);
    }

    @Override
    public void doTransaction(int amount) {
        System.out.println("Оплата по СБП " + amount);
    }
}