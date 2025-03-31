import java.util.List;

public class Order {
    private String orderId;
    private List<String> items;
    private double totalPrice;
    private Customer customer;
    private Payment payment;

    public Order(String orderId, List<String> items, double totalPrice, Customer customer, Payment payment) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.payment = payment;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Items: " + items);
        System.out.println("Total Price: $" + totalPrice);
    }

    public void printCustomerInfo() {
        customer.printCustomerInfo();
    }

    public void processPayment() {
        payment.processPayment();
    }
}
