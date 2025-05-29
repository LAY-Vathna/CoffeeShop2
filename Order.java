import java.security.Timestamp;

public class Order {
    int orderId;
    int orderNumber;
    String[] productName;
    String customerName;
    String staffName;
    Timestamp orderTime;
    int[] quantity;
    char[] size;
    int[] subtotalPrice;
    double totalPrice;
    public Order(int orderId, int orderNumber, String[] productName, String customerName, String staffName,
            Timestamp orderTime, int[] quantity, char[] size, int[] subtotalPrice, double totalPrice) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.customerName = customerName;
        this.staffName = staffName;
        this.orderTime = orderTime;
        this.quantity = quantity;
        this.size = size;
        this.subtotalPrice = subtotalPrice;
        this.totalPrice = totalPrice;
    }
    
}
