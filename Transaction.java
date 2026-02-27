public abstract class Transaction {
    private int amount;
    private int id;

    public Transaction(int amount, int id){
        this.amount = amount;
        this.id = id;
    }

    public int getAmount(){
        return amount;
    }

    public int getId(){
        return id;
    }

    public abstract void doTransaction(int amount);

    public int getAvailableAmount(int amount){
        return amount;
    }

}