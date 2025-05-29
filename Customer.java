import java.util.Date;

public class Customer {
    String fullName;
    Date birthDate;
    int age;
    char gender; //M, F
    String phoneNumber; //verification 
    String address; //delivering
    String preference;
    int loyalPoints = 0;
    Date registrationDate;
    public Customer(String fullName, char gender, String phoneNumber) {
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.registrationDate = new Date(System.currentTimeMillis());
    }
}
