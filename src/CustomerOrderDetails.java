import java.util.List;

public class CustomerOrderDetails {
    private String orderId;
    private List<String> items;
    private double totalPrice;

    private String customerName;
    private String customerAddress;
    private String customerEmail;

    public CustomerOrderDetails(String orderId, List<String> items, double totalPrice,
                                String customerName, String customerAddress, String customerEmail) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Items: " + items);
        System.out.println("Total Price: $" + totalPrice);
        printCustomerInfo();
    }

    public void printCustomerInfo() {
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + customerAddress);
        System.out.println("Email: " + customerEmail);
    }
}

