package com.mycompany.escaperoom;

import java.util.ArrayList;

/**
 * The booking class 
 * which shows the reservation details
 */
public class Booking {
    
    private User Customer;//A object that holds user information.
    private Date Date;//An object that holds date information.
    private int NumberOfPlayers;//The number of players entered by the user.
    private ArrayList<String> list;
    private String Coupon;
    
    /**
     * Default Constructor
     */
    public Booking() {
     Customer = new User();
     Date = new Date();
    }

    /**
     * Constructor
     * create_instance
     * @param Customer
     * @param Date
     * @param NumberOfPlayers
     * @param list
     * @param Coupon
     * @return Instance object
     */
    public Booking(User Customer, Date Date, int NumberOfPlayers , ArrayList<String> list, String Coupon) {
        this.Customer = Customer;
        this.Date = Date;
        this. NumberOfPlayers = NumberOfPlayers;
        this.list = list;
        this.Coupon = Coupon;    
    }
    
    //The Getter methods return the value of objects in the field
    
    /**
     * Deep Copy getCustomer method returns the Customer value that inherent in
     * the user class.
     *
     * @return newUTab 2 I'm here that what's up what's up 
     */
    public User getCustomerInfo() {
        User newU = new User();
        newU.setName(Customer.getName());
        newU.setPhoneNumber(Customer.getPhoneNumber());
        return (newU);
    }
    
    
    /**
     * Deep Copy
     * getDate method return the Date value that inherent in the Date class
     * @return newD
     */
    public Date getDateInfo() {
        Date newD = new Date();
        newD.setDay(Date.getDay());
        newD.setMonth(Date.getMonth());
        newD.setYear(Date.getYear());
        return(newD);
    }
    
     /**
     * getNumberOfPlayers method 
     * return the NumberOfPlayers value
     * @Param
     * @return NumberOfPlayers
     */
    public int getNumberOfPlayers() {
        return NumberOfPlayers;
    }

    /** 
     * get List method
     * returns the list value 
     * @Param
     * @return list
     */
    public ArrayList<String> getList(){
         return list;
    }
    
    /**
     * getCoupon method 
     * return the Coupon value 
     * @Param
     * @return Coupon
     */
    public String getCoupon(){
        return Coupon;
    }

    //the Setter methods stores the value of objects in the field
    /**
     * setCustomerInfo method 
     * stores a value in the user field
     * @Param N
     * @param P
     */
    public void setCustomerInfo(String N, int P) {
        Customer.setName(N);
        Customer.setPhoneNumber(P);
    }

    /**
     * setDateInfo method 
     * stores a value in the Date field
     * @Param D
     * @param M
     * @Param Y
     */
    public void setDateInfo(int D, int M, int Y) {
        Date.setDay(D);
        Date.setMonth(M);
        Date.setYear(Y);
        
    }

    /**
     * setNumberOfPlayers method 
     * stores a value in the NumberOfPlayers field
     * @param NumberOfPlayers
     */
    public void setNumberOfPlayers(int NumberOfPlayers) {
        this.NumberOfPlayers = NumberOfPlayers;
    }

    /**
     * setlist
     * @param array list of String
     */
    public void setlist( ArrayList<String> list){
        this.list=list;
    }
    
    /**
     * setCoupon method
     * stores a value in the Coupon field
     * @param Coupon
     * @return Coupon
     */
    public void setCoupon(String Coupon){
        this.Coupon = Coupon;
    }
    
    /**
     * (total Price After Coupon) method
     * that takes the original price and returns the price with a coupon used 
     * @param numOfR
     */
    public void totalPriceAfterCoupon(char numOfR){
        Rooms[] arr = {new Jumanji(), new heMummy(), new TheKitchen()};
        int price = arr[0].Price();
        int price1 = arr[1].Price();
        int price2 = arr[2].Price();
        
        if(Coupon.equals("OOP")){
          switch(numOfR){
            case '1': 
                
                System.out.print("Total price after coupon is: ");
                System.out.println( (price*getNumberOfPlayers()) - (price * 0.20 * getNumberOfPlayers()));
                break;
            
            case '2':
                System.out.print("Total price after coupon is: ");
                System.out.println( (price1*getNumberOfPlayers()) - (price1 * 0.20 * getNumberOfPlayers()));
                break;
            
            case '3':
                System.out.print("Total price after coupon is: ");
                System.out.println( (price2*getNumberOfPlayers()) - (price2 * 0.20 * getNumberOfPlayers()));
                break;
   
          }
        }
        else if(Coupon!=("OOP")){
          System.out.println( "Sorry invilid cobone");  
        }
        
    }

    /**
     * (Total Price) is a method that passes the child classes to an array of type parent 
     * to calculate the total price 
     * @param numOfR 
     */
    public void TotalPrice(char numOfR) {
        Rooms[] arr = {new Jumanji(), new heMummy(), new TheKitchen()};
        int price = arr[0].Price();
        int price1 = arr[1].Price();
        int price2 = arr[2].Price();

        switch (numOfR) {
            case '1':
                System.out.println(price * getNumberOfPlayers());
                break;

            case '2':
                System.out.println(price1 * getNumberOfPlayers());
                break;

            case '3':
                System.out.println(price2 * getNumberOfPlayers());
                break;
                
            default:
            System.out.println( "Sorry invilid number");  
            break;
                
        } //End of switch

    } //End of TotalPrice method

    /**
     * toString method 
     * that returns the information about the user .
     * @Param
     * @return Customer Info, Date Info, Number of players and Players names.
     */
    @Override
    public String toString() {
        return getCustomerInfo() + "\nDate: " + getDateInfo() + " \nNumber of players: " + getNumberOfPlayers()+"\nplayers names"+getList();
    }

} //End of Booking class
