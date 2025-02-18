public class UPITransaction extends Transaction implements ITransaction {
    String upiId;

    // Constructor
    public UPITransaction(double amount, String sender, String receiver, String upiId) {
        super(amount, sender, receiver);
        this.upiId = upiId;
    }

    // Implementing the executeTransaction() method from ITransaction
    @Override
    public void executeTransaction() {
        System.out.println("Executing UPI Transaction...");
        printTransactionDetails();
        System.out.println("UPI ID: " + upiId);
    }
}
