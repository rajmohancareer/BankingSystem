public class BankTransfer extends Transaction implements ITransaction {
    String bankName;
    String accountNumber;

    // Constructor
    public BankTransfer(double amount, String sender, String receiver, String bankName, String accountNumber) {
        super(amount, sender, receiver);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    // Implementing the executeTransaction() method from ITransaction
    @Override
    public void executeTransaction() {
        System.out.println("Executing Bank Transfer...");
        printTransactionDetails();
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
    }
}
