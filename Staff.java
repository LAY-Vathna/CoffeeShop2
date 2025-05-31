import java.sql.Date;
import java.util.ArrayList;

public class Staff {
    int staffID;
    String fullName;
    String position; //barista, cashier, manager
    double salary;
    String phoneNumber;
    String email;
    String shift; //morning, afternoon, night
    int experince;
    Date startDate;
    char gender; 
    char cerficationSkill; //yes, no
    String idNumber;
    Date birthDate;
    int age;
    String address;
    String password;

    static ArrayList<Staff> staffList = new ArrayList<Staff>();

    //constructor to add staff
    public Staff(String fullName, String position, double salary, String phoneNumber, String email, String shift,
            int experince, Date startDate, char gender, char cerficationSkill, String idNumber, Date birthDate, int age,
            String address, String password) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.shift = shift;
        this.experince = experince;
        this.startDate = startDate;
        this.gender = gender;
        this.cerficationSkill = cerficationSkill;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.age = age;
        this.address = address;
        this.password = password;
    }
    //constructor to login
    public Staff(String email, String password) {
        this.email = email;
        this.password = password;
      
    }

    void addProductToMenu(Product newProduct)
    {
        
    }
    static void register(Staff newStaff)
    {
        staffList.add(newStaff);
    }
    static void login(Staff loginStaff)
    {
        for(int i=0; i<staffList.size();i++)
        {
            System.out.println(staffList.get(i).email);
            System.out.println(staffList.get(i).password);
            if(staffList.get(i).email.equals(loginStaff.email) && staffList.get(i).password.equals(loginStaff.password))
            {
                System.out.println("login successful");
                return;
            }
        }

        System.out.println("Login failed. Please check your email and password.");
    }
}
