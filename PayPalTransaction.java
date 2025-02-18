public class PayPalTransaction extends Transaction implements ITransaction {
    String paypalId;

    // Constructor
    public PayPalTransaction(double amount, String sender, String receiver, String paypalId) {
        super(amount, sender, receiver);
        this.paypalId = paypalId;
    }

    // Implementing the executeTransaction() method from ITransaction
    @Override
    public void executeTransaction() {
        System.out.println("Executing PayPal Transaction...");
        printTransactionDetails();
        System.out.println("PayPal ID: " + paypalId);
    }
}
