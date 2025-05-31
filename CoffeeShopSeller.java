import java.util.Scanner;

public class CoffeeShopSeller {
    public static void main(String[] args) {
        Staff s1 = new Staff("123@gmail.com", "123");
        Staff s2 = new Staff("234@gmail.com", "234");

        Staff.register(s1);
        Staff.register(s2);

        Scanner sc = new Scanner(System.in);
        String email, password;  
        System.out.print("Enter email: ");
        email = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();
        Staff.login(new Staff(email, password));



        // //after login
        // int choice; 
        // do {
        //     System.out.println("Welcome to the Coffee Shop Management System!");
        //     System.out.println("1. insert product to menu");
        //     System.out.println("2. view menu");
        //     System.out.println("3. exit");
        //     System.out.print("Your choice: ");
        //     choice = sc.nextInt();
        //     switch (choice) {
        //         case 1:
        //             break;
        //         case 2:
        //                 // View menu
        //             break;
        //         case 3:
        //             sc.close();
        //             System.out.println("Thank you for using the Coffee Shop Management System. Goodbye!");
        //             System.exit(0);
        //         default:
        //             System.out.println("please choose from 1 to 3 only");
        //             break;
        //     }

        // } while (true);
    }
}
