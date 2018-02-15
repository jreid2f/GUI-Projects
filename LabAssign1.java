import java.util.Random;



/**
 * Lab Assignment 1/Craps game
 * @author Joey Reidell
 * 1/25/16
 */
public class LabAssign1 {
    
    /* rollDice()
       What class to use for creating random numbers
       declare variables
       assign variables random values
       sum the value
       display the roll
       return sum
    */
    
    public static int rollDice(){
        int die1, die2, s;
        Random roll = new Random();
        die1 = roll.nextInt(6) + 1;
        die2 = roll.nextInt(6) + 1;
        s = die1 + die2;
        System.out.println(die1 + " + " + die2 + " = " + s);
        return s;
    }

   
    public static void main(String[] args) {
        int sum, point;
        
        sum = rollDice();
        
        if(sum == 7 || sum == 11){
            System.out.println("You win");
        }
        else if(sum == 2 || sum == 3 || sum == 12)
        {
            System.out.println("You lose");
        }
        else
        {
            System.out.println("The point is " + sum);
            point = sum;
            do{
                sum = rollDice();
                if(sum == point){
                    System.out.println("You win");
                    break;
                }
                else if(sum == 7){
                    System.out.println("You lose");
                    break;
                }
            
            
            }while(true);
        }
            
       
        
        
    }
    
    
    
}
