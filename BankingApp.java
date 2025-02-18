public class BankingApp {
    public static void main(String[] args) {
        // UPI Transaction
        UPITransaction upiPayment = new UPITransaction(500.0, "Raj", "Amazon", "raj@upi");
        upiPayment.executeTransaction();

        System.out.println("\n----------------------------\n");

        // Bank Transfer
        BankTransfer bankPayment = new BankTransfer(10000.0, "Raj", "Tesla Motors", "HDFC Bank", "1234567890");
        bankPayment.executeTransaction();

        System.out.println("\n----------------------------\n");

        // PayPal Transaction
        PayPalTransaction paypalPayment = new PayPalTransaction(2500.0, "Raj", "Freelancer", "rajmohan@paypal.com");
        paypalPayment.executeTransaction();
    }
}
