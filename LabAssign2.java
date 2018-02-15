

import java.util.Arrays;
import java.util.Scanner;



/**
 * Lab Assignment 2-Arrays
 * @author Joey Reidell
 * 2/3/16
 */
public class LabAssign2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count;
        String card;
        long number;
        
        do{
        System.out.print("Enter a credit card number as a long integer --> ");
        card = input.next();
        }while(!isWholeNumber(card));   
        number = Long.parseLong(card);
        count = getSize(number);
        if(count < 13 || count > 16){
            System.out.println(card + " is invalid");
        }
        else{
                int[] cardNum = new int[count];
                for(int i = cardNum.length - 1; i >= 0; i--)
                {
                    cardNum[i] = (int)(number % 10);
                    number /= 10;
                }
                
                if(cardNum[0] == 4 || cardNum[0] == 5 
                        || cardNum[0] == 6 
                        || cardNum[0] == 3 && cardNum[1] == 7){
                 if(isValid(cardNum) == true)
                {
                    System.out.println(card + " is valid");
                }
                else{
                    System.out.println(card + " is invalid");
                }
                }
                else{
                    System.out.println(card + " is invalid");
                }
            }
            
    }
         
        
    
    public static boolean isWholeNumber(String s){
        
        for(int i = 0; i < s.length(); i++)
        {
            if(!Character.isDigit(s.charAt(i)))
                return false;
                
        }
        return true;
    }
    public static int getSize(long d){
        int numberOfDigits = 0;
        
        while(d != 0){
            d = d / 10;
            numberOfDigits++;
        }
        
        return numberOfDigits;
    }
    
    public static int singleDigit(int number)
    {
        if(number <= 9)
        {
            return number;
        }
        else
        {
            int digit1 = (int)(number % 10);
            int digit2 = number / 10;
            return digit1 + digit2;
        }
    }
    
    public static int sumOfOdd(int[] number)
    {
        int sum = 0;
        for(int i = 1; i < number.length; i += 2)
        {
               sum += ((int)number[i] % 10);
               number[i] = number[i] / 10;
            
        }
        
        return sum;
    }
    
    public static int sumOfDoubles(int[] number)
    {
        int sum = 0;
        for(int i = 0; i < number.length; i += 2)
        {
            sum += singleDigit(((int)number[i] % 10) * 2); 
            number[i] = number[i] / 10;
           
        }
        
        return sum;
    }
    
    
    public static boolean isValid(int[] array)
    {
        int total = sumOfOdd(array) + sumOfDoubles(array);
        
        if(total % 10 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
    
}
