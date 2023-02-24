package com.mycompany.escaperoom;


/**
 * TheMummy is a Rooms, so TheMummy Class extends Rooms Class.
 * Level: Medium
 */
public class heMummy extends Rooms{
    
    /**
     * Default Constructor
     */
    public heMummy() {

    }

    /**
     * We gave the Constructor the values of the room.
     *
     * @param Price
     * @param Duration
     * @param Capacity
     * @param Level
     * @param Age
     * @param Category
     */
    public heMummy(int Price, int Duration, String Capacity, String Level, int Age, String Category) {
        super(135, 60, "2-8", "Medium", 15, "Mystery");

    }

    /**
     * the story method is an interface that implement only in Subclass
     *
     * @return 
     */
    @Override
    public String Story() {
        String t= new String("""
                       Room 2 has always been a cursed zone.
                     Mysteriously, anyone who enters this room
                  travels back in time and place to the year 1500 
                         where Pharaoh Amenhotep was buried!
                             
A former archaeologist tried to seek out the precious gem which was hidden in this tomb.
          Unluckily, he vanished! And no one has ever found a trace of him... 
                             
        You have 60 minutes to decode the ciphers and find the hidden treasure.
                        Beware not to awaken the mummy!""");
       return t;                                                                                                                                       
    }

    /**
     * the Price it is Override method that inherit from parent Class.
     *
     * @return
     */
    @Override
    public int Price() {
        return 135;
    }

    /**
     * the toString method that returns the information about the room.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Price: " + getPrice() + " Per Person\nDuration: " + getDuration() + " Min\nCapacity: " + getCapacity() + " Victims\nLevel: "
                + getLevel() + "\nAge: " + getAge() + "+(or 12+ with Adult)\nCategory: " + getCategory();
    }
}//End of theMummy class