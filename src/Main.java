import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "123 Main St", "john@example.com");
        Payment payment = new Payment("Credit Card", false);

        Order order = new Order("ORD123", Arrays.asList("Laptop", "Mouse"), 1200.00, customer, payment);

        order.printOrderDetails();
        order.printCustomerInfo();
        order.processPayment();
    }
}

