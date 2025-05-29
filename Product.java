public class Product {

    String name;
    double price;
    char size; //s, m, l
    String category; //frappe, coffee, tea 
    int sugar; //25, 50, 75
    String topping; //chocolate, caramel, vanilla
    int loyalPointsPrice;

    // Constructor TO ADD product to menu
    public Product(String name, double price, char size, String category) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.category = category;
    }
    // Constructor TO ADD product to order
    public Product(String name, double price, char size, String category, int sugar, String topping) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.category = category;
        this.sugar = sugar;
        this.topping = topping;
    }


}
