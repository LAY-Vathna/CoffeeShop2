package objects;
import java.util.Date;

import authenticationInterface.Authentication;

public class Customer implements Authentication {
    private int customerID;
    public String fullName;
    private Date birthDate;
    private int age;
    private char gender; //M, F
    private String phoneNumber; //verification 
    private String address; //delivering
    private String preference;
    private String password;
    private int loyalPoints = 0;
    public Date registrationDate;
    
    public String getPhoneNumber(String password)
    {
        if(password.equals(this.password))
        {
            return this.phoneNumber;
        }else{
            System.out.println("Wrong password");
            return null;
        }
    }
    public void setPhoneNumber(String newPhoneNumber, String password)
    {
        if(password.equals(this.password))
        {
            this.phoneNumber = newPhoneNumber;
            System.out.println("change successful");
        }else{
            System.out.println("Wrong password");
        }
    }
    
    @Override
    public boolean login() {
        // TODO Auto-generated method stub
        System.out.println("Login as customer");
        return false;
    }
    @Override
    public boolean signUp() {
        System.out.println("Sign up as customer");
        // TODO Auto-generated method stub
        return false;
    }


    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public int getAge() {
        //get current date - getbirthdate()
        return 2;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPreference() {
        return preference;
    }
    public void setPreference(String preference) {
        this.preference = preference;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getLoyalPoints() {
        return loyalPoints;
    }
    public void setLoyalPoints(int loyalPoints) {
        this.loyalPoints = loyalPoints;
    }
    public Date getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    public Customer(String fullName, char gender, String phoneNumber) {
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.registrationDate = new Date(System.currentTimeMillis());
    }
}
