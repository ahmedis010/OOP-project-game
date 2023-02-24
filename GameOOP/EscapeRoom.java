package com.mycompany.escaperoom;

/**
 * Driver class (EscapeRoom)
 */

import java.util.ArrayList; //to creat a list
import java.util.InputMismatchException; //to import a file of exception (InputMismatch)
import java.util.Scanner; //to import scanner

public class EscapeRoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * creating objects by casting
         */
        Rooms j = new Jumanji(170, 60, "2-8", "Easy", 15, "Adventure");
        Rooms m = new heMummy(135, 60, "2-8", "Medium", 15, "Mystery");
        Rooms k = new TheKitchen(100, 60, "2-8", "Hard", 15, "Murder");

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE SECRET ESCAPE ROOM");
        System.out.println("Please choose the room number ");
        /**
         * a do-while loop that works only once or more and stops when the
         * variable (stop) ==false
         */
        char roomnum;
        boolean stop = false;
        do {
            System.out.print("-------------------------");

            /**
             * Display the rooms name to let the user choose one
             */
            System.out.println("\n|1.Jumanji|\n|2.The Mummy|\n|3.The Kitchen|");
            System.out.println("-------------------------");
            roomnum = input.nextLine().charAt(0);
            /**
             * switch case so the user could enter a number that will match the
             * wanted room
             */
            switch (roomnum) {

                /**
                 * Jumanji Room
                 */
                case '1':
                    System.out.println("                                        ***ROOM 1***                                            ");
                    System.out.println("                                       ***JUMANJI***                                            ");
                    System.out.println("***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ");
                    //We call the story method (j.Story()) to show the story of Room 1
                    System.out.println(" " + j.Story());
                    System.out.println("***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ");
                    //Call to string method to show the details of Room 1
                    System.out.println(" " + j.toString());
                    System.out.println("***   ***   ***   ***   ***   ***   ***  ");

                    stop = true;
                    break;

                /**
                 * The Mummy Room
                 */
                case '2':
                    System.out.println("                                   ***ROOM 2***                                  ");
                    System.out.println("                                 ***THE MUMMY***                                 ");
                    System.out.println("***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***");
                    //We call the story method (m.Story()) to show the story of Room 2
                    System.out.println(" " + m.Story());
                    System.out.println("***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***");
                    //Call to string method to show the details of Room 2
                    System.out.println(" " + m.toString());
                    System.out.println("***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***");

                    stop = true;
                    break;

                /**
                 * The Kitchen Room
                 */
                case '3':
                    System.out.println("                  ***ROOM 3***            ");
                    System.out.println("               ***THE KITCHEN***          ");
                    System.out.println("***   ***   ***   ***   ***   ***   ***   ");
                    //We call the story method (k.Story()) to show the story of Room 3
                    System.out.println(" " + k.Story());
                    System.out.println("***   ***   ***   ***   ***   ***   ***   ");
                    //Call to string method to show the details of Room 3
                    System.out.println(" " + k.toString());
                    System.out.println("***   ***   ***   ***   ***   ***   ***   ");

                    stop = true;
                    break;

                default:
                    System.out.println("You entered wrong number, Please try again");
                    break; //Will exit from switch

            } //End of the switch

        } while (stop == false);

        /**
         * entering some information
         */
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = in.next();
        System.out.print("Enter your phone number\n+966");
        int phoneNumber = in.nextInt();
        
        Booking b1 = new Booking();
        b1.setCustomerInfo(name, phoneNumber);
        User b1_user = b1.getCustomerInfo();
       
        /**
         * The user entered the wrong day and made another attempt to enter the
         * correct day
         */
        int DAY = 0;
        while (DAY < 1 || DAY > 31) {
            try {
                System.out.println("Enter the day");
                DAY = in.nextInt();
                if (DAY < 1 || DAY > 31) {
                    System.out.println(DAY + " is not betwen 1 and 31 day, Please try again");
                }

            } catch (InputMismatchException imex) {

                System.out.println("invilid input, Please try again");
                in.next();
            }
        }
        /**
         * The user entered the wrong month and made another attempt to enter
         * the correct month
         */
        int MONTH = 0;
        while (MONTH < 1 || MONTH > 12) {
            try {
                System.out.println("Enter the month ");
                MONTH = in.nextInt();
                if (MONTH < 1 || MONTH > 12) {
                    System.out.println(MONTH + " is not betwen 1 and 12 month, Please try again");
                }
            } catch (InputMismatchException imex) {

                System.out.println("invilid input, Please try again");
                in.next();
            }
        }

        /**
         * The user entered the wrong year and made another attempt to enter the
         * correct year
         */
        int YEAR = 0;
        while (YEAR < 2023 || YEAR > 2025) {
            try {
                System.out.println("Enter the year ");
                YEAR = in.nextInt();
                if (YEAR < 2023 || YEAR > 2025) {
                    System.out.println(YEAR + " is not between 2023 and 2025 year, Please try again");
                }
            } catch (InputMismatchException imex) {

                System.out.println("invilid input, Please try again");
                in.next();
            }
        }
        
        Booking b2=new Booking();
        b2.setDateInfo(DAY, MONTH, YEAR);
        Date b2_date=b2.getDateInfo();
        ArrayList<String> list = new ArrayList<String>();

        /**
         * If the user entered number players out of the allowed capacity, A
         * massage error will be Displayed
         */
        do {

            System.out.println("Enter the number of players:");
            int numOfPlayers = in.nextInt();
            if (numOfPlayers < 2 || numOfPlayers > 8) {
                System.out.println("The number you entered is out of the allowed capacity\nPlease try again");
                stop = false;
            } else {

                String coupon="";
                Booking booking = new Booking(b1_user, b2_date, numOfPlayers,list,coupon);
                for (int i = 0; i < numOfPlayers; i++) {
                    System.out.println("Enter name of player " + (i + 1)+":");
                    String a = input.nextLine();
                    list.add(a);
                    System.out.println(a);

                }
              
                System.out.println("***  ***  ***  ***  ***  ****  ***");
                System.out.println("***  ***     Booking details     ***   ***");

                /**
                 * To show the booking details
                 */
                System.out.print(booking);
               
           
                /**
                 * To calculate the Total price with or without a coupon
                 */
                System.out.println("\nDo you have a Coupon: ");
                String y= input.nextLine().toLowerCase();
                if(y.equals("yes")){
                    System.out.print("Enter Coupon: ");
                    coupon= input.nextLine();
                    booking.setCoupon(coupon);
                    booking.totalPriceAfterCoupon(roomnum);
                }
                else {
                    System.out.println("carry on with the original price ");
                
                
                System.out.println(" \nTotal price: ");
                booking.TotalPrice(roomnum);}
                System.out.println("***  ***  ***  ***  ***  ****  ***");
                stop = true;
            } //End of else

        } while (stop == false);
        //End of do

    } //End of the main class
} //End of EscapeRoom class