public class Payment {
    private String method;
    private boolean status;

    public Payment(String method, boolean status) {
        this.method = method;
        this.status = status;
    }

    public void processPayment() {
        if (!status) {
            System.out.println("Processing payment via " + method);
            status = true;
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment already completed.");
        }
    }
}
