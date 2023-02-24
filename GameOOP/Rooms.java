package com.mycompany.escaperoom;


/**
 * The abstract class Rooms is the parent class that contains all the variables and
 * methods inherited by the children.
 */
public abstract class Rooms implements Story{
    private int Price;//the price per person.
    private int Duration;// the Duration of the game at start.
    private String Level;//how difficult is the game, hard,medium,easy.
    private int Age;// the minimum age allowed to enter the game.
    private String Category;//Murder,Mystery,Adventure.
    private String Capacity;//the maximum number of players entering the room.

    /**
     * Default Constructor
     */
    public Rooms() {
    }

    /**
     * in the Constructor We create an object to store a value in.
     * @param Price
     * @param Duration
     * @param Capacity
     * @param Level
     * @param Age
     * @param Category
     */
    public Rooms(int Price, int Duration, String Capacity, String Level, int Age, String Category) {
        // we use this keyword to refers the object .
        this.Price = Price;
        this.Duration = Duration;
        this.Level = Level;
        this.Age = Age;
        this.Category = Category;
        this.Capacity = Capacity;
    }

    /**
     * abstract method that overridden in subclass
     *
     * @return
     */
    public abstract int Price();

    //the Gettr methods return the value of objects in the field 
    /**
     * the getPrice method return the Price value
     *
     * @return the price per person.
     */
    public int getPrice() {
        return (Price);
    }

    /**
     * the getDuration method return the Duration value
     *
     * @return Duration of the game at start.
     */
    public int getDuration() {
        return (Duration);
    }

    /**
     * the getCapacity method return the Capacity value
     *
     * @return maximum number of players entering the room.
     */
    public String getCapacity() {
        return (Capacity);
    }

    /**
     * the getLevel method return the Level value
     *
     * @return how difficult is the game
     */
    public String getLevel() {
        return (Level);
    }

    /**
     * the getAge method return the Age value
     *
     * @return the minimum age allowed to enter the game.
     */
    public int getAge() {
        return (Age);
    }

    /**
     * the getCategory method return the Category value
     *
     * @return Murder,Mystery,Adventure.
     */
    public String getCategory() {
        return (Category);
    }

// the Setter methods stores the value of objects in the field
    /**
     * the setRoomName method stores a value in the Price field
     *
     * @param Price the value to store in the variable Price
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

    /**
     * the setDuration method stores a value in the Duration field
     *
     * @param Duration the value to store in the variable Duration
     */
    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    /**
     * the setCapacity method stores a value in the Capacity field
     *
     * @param Capacity the value to store in the varible Capacity
     */
    public void setCapacity(String Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * the setLevel method stores a value in the Level field
     *
     * @param Level the value to store in the varible Level
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * the setAge method stores a value in the Age field
     *
     * @param Age the value to store in the variable Age
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * the setCategory method stores a value in the Category field
     *
     * @param Category the value to store in the variable Category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }
    
}//End of Rooms class
