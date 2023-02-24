package com.mycompany.escaperoom;

/**
 * The date class
 * which shows the year,month and day of the reservation
 */
public class Date {

    private int Day;//The day chosen by the player
    private int Month;//The month chosen by the player
    private int Year;//The Year chosen by the player

    /**
     * Default Constructor
     */
    public Date() {
    }

    /**
     * Copy constructor
     * We gave the Constructor the values of the date .
     * @param obj of Date
     * @return Instance object
     */
    public Date(Date Date) {
        this.Day = Date.Day;
        this.Month = Date.Month;
        this.Year = Date.Year;
    }

    //the Gettr methods return the value of objects in the field.
    /**
     * getDay method 
     * return the day value
     * @Param
     * @return Day
     */
    public int getDay() {
        return Day;
    }

    /**
     * getMonth method 
     * return the Month value
     * @Param
     * @return Month
     */
    public int getMonth() {
        return Month;
    }

    /**
     * getYear method 
     * return the YEAR value
     * @Param
     * @return Year
     */
    public int getYear() {
        return Year;
    }

    // the Setter methods stores the value of objects in the field
    /**
     * setDay method 
     * stores a value in the Day field.
     * @param D
     */
    public void setDay(int D) {
        Day = D;
    }

    /**
     * setMonth method 
     * stores a value in the Month field.
     * @param M
     */
    public void setMonth(int M) {
        Month = M;
    }

    /**
     * setYear method
     * stores a value in the YEAR field.
     * @param Y
     */
    public void setYear(int Y) {
        Year = Y;
    }

    /**
     * toString method \
     * that returns the date information .
     * @Param
     * @return the day and month and year.
     */
    @Override
    public String toString() {
        return Day + "/" + Month + "/" + Year;
    }
} //End of Date class