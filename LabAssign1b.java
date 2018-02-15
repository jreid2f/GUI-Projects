
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;


/**
 * Lab Assignment 1b/ Craps Game
 * @author Joey Reidell
 * 1/25/16
 */
public class LabAssign1b {
    public static int rollDice(){
        int die1, die2, s;
        Random roll = new Random();
        die1 = roll.nextInt(6) + 1;
        die2 = roll.nextInt(6) + 1;
        s = die1 + die2;
        System.out.println(die1 + " + " + die2 + " = " + s);
        return s;
    }
    
    public static boolean determineOutcome(int dice){
        int point;
        
        if(dice == 7 || dice == 11){
            System.out.println("You win");
            return true;
            
        }
        else if(dice == 2 || dice == 3 || dice == 12)
        {
            System.out.println("You lose");
            return false;
        }
        else
        {
            System.out.println("The point is " + dice);
            point = dice;
            do{
                dice = rollDice();
                if(dice == point){
                    System.out.println("You win");
                    return true;
                    
                }
                else if(dice == 7){
                    System.out.println("You lose");
                    return false;
                }
            
            
            }while(true);
        }
        
    }

   
    public static void main(String[] args) {
        int sum, numOfTimes, wins = 0;
        double winPercent;
        DecimalFormat df = new DecimalFormat("#,##0");
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("How many games do you want to play? --> ");
        numOfTimes = keyboard.nextInt();
        
        for(int i = 0; i < numOfTimes; i++)
        {   
            sum = rollDice();
            if(determineOutcome(sum))
            {
                wins++;
            }
        
        }
        
        System.out.println("You won " + wins + " games");
        
        winPercent = ((wins * 100) / numOfTimes);
        
        System.out.println("Your winning percentage is " + 
                df.format(winPercent) + "%");
                
          
    }
    
}
