package com.mycompany.escaperoom;

/**
 *Jumanji is a Rooms, so Jumanji Class extends Rooms Class.
 * Level: Easy                                         
 */
public class Jumanji extends Rooms {
    
    /**
     * Default Constructor
     */
    public Jumanji() {
      
    }
    
    /**
     *We gave the Constructor the values of the room .
     * @param Price
     * @param Duration
     * @param Capacity
     * @param Level
     * @param Age
     * @param Category
     */
    public Jumanji(int Price, int Duration, String Capacity, String Level, int Age, String Category) {
       super(100, 60, "2-8" , "Easy", 15, "Adventure");
    }
   
    /**
     *the story method is an interface that implement only in Subclass
     * @return
     */
    @Override
    public String Story() {
        String t= new String("""
            During a long road trip, your vehicle breaks down at a deserted village.
             You walk down the street and find an old dark hotel welcoming guests. 
                             
  Unfortunately, you check into room 1! It seems that this room has not been inhabited for a long time.
            A mysterious board game in the middle of the room catches your attention!
                     You walk closer, pick up the dice and throw it back...
                             
             Suddenly, you and your friends are pulled into the magical jungle world!
         You are forced to continue playing, solve the puzzles, and reach the finish line.
       Otherwise, you will be trapped in the forest forever... Hurry, you have 60 minutes!""");
        return t; 
    }

    /**
     *the Price it is Override method that inherit from parent Class.
     * @return
     */
    @Override
    public int Price() {
      return 100;
    }

    /**
     *the toString method that returns the information about the room.
     * @return
     */
    @Override
    public String toString() {
    return "Price: "+getPrice()+" Per Person\nDuration: "+getDuration()+" Min\nCapacity: "+getCapacity()+" Victims\nLevel: "
         +getLevel()+"\nAge: "+getAge()+"+ (or 12+ with Adult)\nCategory: " +getCategory();
    }  
}//End of Jumanji class