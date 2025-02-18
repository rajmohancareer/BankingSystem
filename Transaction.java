public abstract class Transaction {
    double amount;
    String sender;
    String receiver;

    // Constructor
    public Transaction(double amount, String sender, String receiver) {
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
    }

    // Abstract method to be implemented by subclasses
    public abstract void executeTransaction();

    // Common method to print transaction details
    public void printTransactionDetails() {
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Amount: " + amount);
    }
}
