import java.util.Scanner;
import java.util.ArrayList;

public class Order{

    // ENUM
    public enum OrderStatus {
        PENDING, PREPARING, READY, DELIVERED
    }

    // STATIC FINAL
    public static final double VAT_RATE = 0.12;

    // STATIC non-final
    public static int totalOrders = 0;

    // READ-ONLY
    private final String orderNumber;

    // instance fields
    private String customerName;
    private String itemName;
    private double price;
    private OrderStatus status;

    // INITIALIZATION BLOCK
    {
        totalOrders++;
        orderNumber = "ORD-" + totalOrders;
    }

    // Constructor - THIS usage #1
    public Order(String customerName, String itemName, double price, OrderStatus status) {
        this.customerName = customerName;
        this.itemName = itemName;
        this.price = price;
        this.status = status;
    }

    // Overloaded constructor - THIS usage #2
    public Order(String customerName, String itemName) {
        this(customerName, itemName, 2500.0, OrderStatus.PREPARING);
    }
    
    // METHOD OVERLOADING
    public double calculateTotal() {
        return price + (price * VAT_RATE);
    }

    public double calculateTotal(double tipPercent) {
        return price + (price * VAT_RATE) + (price * tipPercent / 100);
    }

    public double calculateTotal(double tipPercent, double discountAmount) {
        return price + (price * VAT_RATE) + (price * tipPercent / 100) - discountAmount;
    }

    // Getters
    public String getOrderNumber() { return orderNumber; }
    public String getCustomerName() { return customerName; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public OrderStatus getStatus() { return status; }

    @Override
    public String toString() {
        return "Order #" + orderNumber + " | Customer: " + customerName +
               " | Item: " + itemName + " | Price: " + price + " | Status: " + status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();

        System.out.println("=== Restaurant Order System ===");
        System.out.println("Type 'done' as customer name when finished adding orders.");

        while (true) {
            System.out.println("\n--- New Order ---");

            // customer name - type done to stop
            System.out.print("Customer name (or 'done' to finish): ");
            String customerName = scanner.nextLine().trim();
            if (customerName.equalsIgnoreCase("done")) break;

            // item name
            System.out.print("Item name (Type 'Special' for Daily Deal): ");
            String itemName = scanner.nextLine().trim();

            if (itemName.equalsIgnoreCase("Special")) {
                orders.add(new Order(customerName, "Daily Special Lunch"));
                System.out.println("Quick Order created: Daily Special Lunch for 2500.0 (Status: PREPARING)");
            } 
            else {
                double price = 0;
                while (true) {
                    System.out.print("Price: ");
                    try {
                        price = Double.parseDouble(scanner.nextLine().trim());
                        if (price >= 0) break;
                        System.out.println("Price cannot be negative.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price. Please enter a number.");
                    }
                }

            // status
            OrderStatus status = null;
            while (true) {
                System.out.print("Status (P=Pending / PR=Preparing / R=Ready / D=Delivered): ");
                String s = scanner.nextLine().trim().toUpperCase();
                if (s.equals("P"))  { status = OrderStatus.PENDING;   break; }
                if (s.equals("PR")) { status = OrderStatus.PREPARING; break; }
                if (s.equals("R"))  { status = OrderStatus.READY;     break; }
                if (s.equals("D"))  { status = OrderStatus.DELIVERED; break; }
                System.out.println("Invalid. Use P, PR, R or D.");
            }

            orders.add(new Order(customerName, itemName, price, status));
            System.out.println("Order added successfully!");
        }
    }

        if (orders.isEmpty()) {
            System.out.println("No orders were placed.");
            scanner.close();
            return;
        }

        // tip
        double tip = 0;
        while (true) {
            System.out.print("\nEnter tip percentage for all orders (0 for none): ");
            try {
                tip = Double.parseDouble(scanner.nextLine().trim());
                if (tip >= 0) break;
                System.out.println("Tip cannot be negative.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid tip. Please enter a number.");
            }
        }

        // discount
        double discount = 0;
        while (true) {
            System.out.print("Enter discount amount for all orders (0 for none): ");
            try {
                discount = Double.parseDouble(scanner.nextLine().trim());
                if (discount >= 0) break;
                System.out.println("Discount cannot be negative.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid discount. Please enter a number.");
            }
        }

        // summary
        System.out.println("\n=== Order Summary ===");
        for (Order order : orders) {
            System.out.println(order);
            System.out.printf("  Total (no tip):         %.2f%n", order.calculateTotal());
            System.out.printf("  Total (with tip):       %.2f%n", order.calculateTotal(tip));
            System.out.printf("  Total (tip + discount): %.2f%n", order.calculateTotal(tip, discount));
        }

        System.out.println("\nTotal orders placed today: " + Order.totalOrders);
        System.out.println("VAT rate applied: " + (VAT_RATE * 100) + "%");

        scanner.close();
    }
}
