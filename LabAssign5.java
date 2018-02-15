
import java.util.ArrayList;
import java.util.Collections;


/**
 * Lab Assignment 5-Abstracts and Interfaces
 * @author Joey Reidell
 * 3/16/16
 */
public class LabAssign5 {

    public static void main(String[] args) {
       // create two sailboats(7 arguments)
        ArrayList <Boat>fleet = new ArrayList<Boat>();
        fleet.add(new SailBoat("MO34561", 28, "Tartan", 2008, 
                4.11, 2, "Inboard Diesel"));
        fleet.add(new SailBoat("MO45678", 27, "S2 Yachts", 2004, 
                3.9, 4, "Outboard Gas"));
        
        // create two powerboats(6 arguments)
        fleet.add(new PowerBoat("MO67891", 30, "Bayliner", 2011,
                   2, "Gas"));
        fleet.add(new PowerBoat("MO78910", 27, "SlickCraft", 2015,
                   1, "Gas"));
        // Compariable interface enables the static sort() method
        Collections.sort(fleet);
        // get information about sailboats using tellAboutSelf method
        for(Boat e : fleet){
            System.out.println(e.tellAboutSelf());
        }
    }
    
}
