import java.sql.Date;

public class Staff {
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

    void addProduct()
    {
        System.out.println("Add product to menu");	
    }
    
}
