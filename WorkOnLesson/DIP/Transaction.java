package DIP;

public interface Transaction {
    void doTransaction(int amount);
    default int getAvailableAmount(int amount){
        return amount;
    };

}
