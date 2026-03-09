import java.util.Scanner;

/**
* This program asks the user for a number and letter. It then converts the
* number from Farenheit to Celcius or vice versa. If a letter other than 
* F or C are entered, the user will be held in a while pit until a valid
* letter is provided.
* @author Jon Cesena
* @version v1.0
* @since 3/8/2026
*/

public class Temperature{
    public static void main (String[] args){
        
        int inputTemp;   
        double output;
        char inputUnit;
        
        Scanner keyboard = new Scanner(System.in);
        
        do{ ////create working program and then put in do-while
            
            System.out.print ("Enter a whole number, a space, and C or F (ie 100 F converts to Cels): ");
            inputTemp = keyboard.nextInt();
            inputUnit = keyboard.next().toUpperCase().charAt(0);
                
            while (!(inputUnit=='C'||inputUnit=='F')){
                System.out.print("Enter C to convert to F or vice versa: ");
                inputUnit = keyboard.next().toUpperCase().charAt(0);
            }// While pit for input validation
            
            
            if (inputUnit == 'F'){
                output = (double)(inputTemp - 32) * 5/9;
                System.out.printf("%d%c converted is: %.1fC\n", inputTemp, inputUnit, output);
            }
            else{
                output = (double)(inputTemp) * 9/5 + 32;
                System.out.printf("%d%c converted is: %.1fF\n", inputTemp, inputUnit, output);
            }
                
            System.out.print("Do you want to calculate another temperature? If so, enter yes, otherwise no: ");
            
        }while (keyboard.next().equalsIgnoreCase("yes"));
    }
}