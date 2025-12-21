public class DebitSPB extends Transaction{

    @Override
    public void doTransaction(int amount) {
        System.out.println("Оплата по СБП " + amount);
    }
}