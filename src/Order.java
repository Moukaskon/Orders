
public class Order {
    private CustomerOrderDetails customerOrderDetails;
    private PaymentProcessor paymentProcessor;

    public Order(CustomerOrderDetails customerOrderDetails, PaymentProcessor paymentProcessor) {
        this.customerOrderDetails = customerOrderDetails;
        this.paymentProcessor = paymentProcessor;
    }

    public void printOrderDetails() {
        customerOrderDetails.printOrderDetails();
    }

    public void processPayment() {
        paymentProcessor.processPayment();
    }
}
