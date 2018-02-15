
import java.util.Scanner;



/**
 * Lab Assignment 3
 * Classes & Strings
 * @author Joey Reidell
 * 2/23/16
 */
public class LabAssign3 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfEmployees = 0;
        do{
        System.out.print("How many new employees to enter --> ");
        if(scan.hasNextInt()){
            numberOfEmployees = scan.nextInt();
        }
        else{
            scan.nextLine();
        }
        }while(numberOfEmployees < 1);
         createEmployee(numberOfEmployees); 
    }
    
    private static void createEmployee(int num)
    {
        String name, date, code;
        int deptCode;
        int month, day, year;
        Employee object;
        Date hireDate;
        Scanner scan = new Scanner(System.in);
        Employee[] employee = new Employee[num];
        
        for(int i = 0; i < employee.length; i++){
        do{
            // prompts user for name
            System.out.print("Enter name of Employee #" + (i + 1) + "--> ");
            name = scan.nextLine();
            }while(!name.matches("[A-Z][a-z]*[a-zA-Z]+([ '-][a-zA-Z]+)*"));
           
            do{
                // prompts user for date
            System.out.print("Enter hire date in the format "
                    + "MM DD YYYY with spacing --> ");
            date = scan.nextLine();
            }while(!date.matches("[0-1][0-9][ ][0-3][0-9][ ]"
                    + "[2][0][0-9][0-9]"));
            /* 
            parses each number in the string and 
            assigns it to the Date constructor
            */
            month = Integer.parseInt(date.substring(0, 2));
            day = Integer.parseInt(date.substring(3, 5));
            year = Integer.parseInt(date.substring(6, 10));
            hireDate = new Date(month, day, year);
           do{
               // prompts the user for the department code
                System.out.print("Enter the department code in "
                        + "the format #### --> ");
                code = scan.nextLine();
            }while(!code.matches("[1-9][0-9][0-9][0]"));
           // parses the string code 
            deptCode = Integer.parseInt(code);
            // assigns name, hireDate, and deptCode to the employee constructor
            object = new Employee(name, hireDate, deptCode);
            employee[i] = object;
        }
        // displays the employees name, hire date, and department code
            for(int i = 0; i < employee.length; i++)
         {
              System.out.println(employee[i].toString());
         }
            System.out.println("---------------------");
            
            
    }
    
    
    
}
