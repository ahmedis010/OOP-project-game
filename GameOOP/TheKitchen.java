package com.mycompany.escaperoom;

/**
 *TheKitchen is a Rooms, so TheKitchen Class extends Rooms Class.
 *Level: Hard     
 */
public class TheKitchen extends Rooms{
    
    /**
     * Default Constructor
     */
    public TheKitchen() {

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
    public TheKitchen(int Price, int Duration, String Capacity, String Level, int Age, String Category) {
        super(170, 60, "2-8", "Hard", 15, "Murder");
    }

    /**
     * the story method is an interface that implement only in Subclass
     *
     * @return
     */
    @Override
    public String Story() {
        String t= new String("""
         The chef has lost his mind in the hotel kitchen!    
           Ate many guests & tore their bodies apart .
            Got insanely attached to a baby's corpse...
                                                                                      
                     Find the baby's corpse
                 & get it out of the kitchen.
            This is your mission to convict this maniac!
                                            
               Beware not to be his next dinner.
             You have 60 minutes to get the job done.
                         *Good luck*""");
        return t;
    }

    /**
     * the Price it is Override method that inherit from parent Class.
     *
     * @return
     */
    @Override
    public int Price() {
        return 170;
    }

    /**
     * the toString method that returns the information about the room.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Price: " + getPrice() + " Per Person\nDuration: " + getDuration() + " Min\nCapacity: " + getCapacity() + " Victims\nLevel: "
                + getLevel() + "\nAge: " + getAge() + "+ (or 12+ with Adult)\nCategory: " + getCategory();
    }
}//End of Thekitchen class