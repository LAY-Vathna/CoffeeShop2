package objects;
import java.sql.Date;
import java.util.LinkedList;

import authenticationInterface.Authentication;

public class Staff implements Authentication {
    private int staffID;
    private String fullName;
    private String position; //barista, cashier, manager
    private double salary;
    private String phoneNumber;
    private String email;
    private String shift; //morning, afternoon, night
    private int experince;
    private Date startDate;
    private char gender; 
    private char cerficationSkill; //yes, no
    private String idNumber;
    private Date birthDate;
    private int age;
    private String address;
    private String password;

    private static LinkedList<Staff> staffList = new LinkedList<Staff>();

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

    



    @Override
    public boolean login() {
        System.out.println("Login as staff");
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean signUp() {
        System.out.println("Sign up as staff");
        // TODO Auto-generated method stub
        return false;
    }
    // static void register(Staff newStaff)
    // {
    //     staffList.add(newStaff);
    // }
    // static void login(Staff loginStaff)
    // {
    //     for(int i=0; i<staffList.size();i++)
    //     {
    //         System.out.println(staffList.get(i).email);
    //         System.out.println(staffList.get(i).password);
    //         if(staffList.get(i).email.equals(loginStaff.email) && staffList.get(i).password.equals(loginStaff.password))
    //         {
    //             System.out.println("login successful");
    //             return;
    //         }
    //     }

    //     System.out.println("Login failed. Please check your email and password.");
    // }

    public static LinkedList<Staff> getStaffList()
    {
        //now u can control how they can access stafflist
        return staffList;
    }
}
