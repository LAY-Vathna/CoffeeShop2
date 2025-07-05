package objects;
import java.security.Timestamp;

public class Order {
    private int orderID;
    String customerID;
    String staffID;
    int orderNumber;
    int[] productID;
    Timestamp orderTime;
    int[] quantity;
    int[] subtotalPrice;
    double totalPrice;
    public Order(int orderID, String customerID, String staffID, int orderNumber, int[] productID, Timestamp orderTime,
            int[] quantity, int[] subtotalPrice, double totalPrice) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.staffID = staffID;
        this.orderNumber = orderNumber;
        this.productID = productID;
        this.orderTime = orderTime;
        this.quantity = quantity;
        this.subtotalPrice = subtotalPrice;
        this.totalPrice = totalPrice;
    }
   
    
    
}
