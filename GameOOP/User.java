package com.mycompany.escaperoom;

/**
 * The User class 
 * which shows the user details.
 */
public class User {

    private String Name;//the name of the Customer.
    private int PhoneNumber;//PhoneNumber of Customer.

    /**
     * Default Constructor
     */
    public User() {
    }

    /**
     * Copy constructor
     * We gave the Constructor the values of the user.
     * @param obj of User
     */
    public User(User Customer) {
        this.Name = Customer.Name;
        this.PhoneNumber = Customer.PhoneNumber;
    }

    //the Gettr methods return the value of objects in the field
    /**
     * getName method 
     * return the Name value
     * @Param
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * getPhoneNumber method 
     * return the PhoneNumber value
     * @param 
     * @return PhoneNumber
     */
    public int getPhoneNumber() {
        return PhoneNumber;
    }

    //the Setter methods stores the value of objects in the field.
    /**
     * setName method 
     * stores a value in the Name field.
     * @param N
     */
    public void setName(String N) {
        Name = N;
    }

    /**
     * setPhoneNumber method 
     * stores a value in the PhoneNumber field.
     * @param P
     */
    public void setPhoneNumber(int P) {
        PhoneNumber = P;
    }

    /**
     * toString method
     * that returns the information about the user .
     * @param 
     * @return Customer name and Phone Number.
     */
    @Override
    public String toString() {
        return "Customer name: " + Name + "\nPhone Number: " + PhoneNumber;

    }
} //End of user class
