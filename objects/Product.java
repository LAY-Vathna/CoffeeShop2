package objects;
import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    int productID;
    String name;
    double price;
    char size; //s, m, l
    String category; //frappe, coffee, tea 
    int sugar; //25, 50, 75
    String topping; //chocolate, caramel, vanilla
    int loyalPointsPrice;
    public static ArrayList<Product> menu = new ArrayList<Product>();
    ArrayList<Integer> ordernumberList = new ArrayList<Integer>();
    

    private Product() {
        // Default constructor
    }

    public Product(int productID, String name, double price, char size, String category, int sugar, String topping,
            int loyalPointsPrice) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.size = size;
        this.category = category;
        this.sugar = sugar;
        this.topping = topping;
        this.loyalPointsPrice = loyalPointsPrice;
    }



    public static void addProductToMenu() {
        
        Scanner sc = new java.util.Scanner(System.in);

        Product newProduct = new Product();
        System.out.println("Insert product to menu:");
        System.out.print("Enter product name: ");
        newProduct.name = sc.nextLine();
        System.out.print("Enter product price: ");
        newProduct.price = sc.nextDouble();
        System.out.print("Enter product size (s, m, l): ");
        newProduct.size = sc.next().charAt(0);
        System.out.print("Enter product category (frappe, coffee, tea): ");
        newProduct.category = sc.next();

        // Add the new product to the menu
        menu.add(newProduct);

    }


}
