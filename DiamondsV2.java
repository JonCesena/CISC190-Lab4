import java.util.Scanner;

/**
 * This program gets a number from a user and uses for loops to 
 * makes a diamond shape with a maximum width of the given number. 
 * If an even number is entered, the program adds one to convert
 * it to an odd number first.
 * @author Jon Cesena
 * @version v1.0
 * @since 3/9/2026
 */

public class DiamondsV2{
    public static void main (String args[]){
        
        int width, line, spaces, stars;
        Scanner keyboard = new Scanner(System.in);
        
        // Get max width input
        System.out.print("Enter max width for diamond: ");
        width = keyboard.nextInt();
        
        //test to see if width is even (width%2==0).  If true increment width by 1.  Ensures width is an odd number
        if (width%2==0)
            width++;
        
        ////top half section
        for (line=1,spaces=width/2;line<=width/2+1;line++,spaces--){
            for (int i=1;i<=spaces;i++){ //this is for spaces
                System.out.print(" ");
            }
            for (stars=1;stars<=line*2-1;stars++){  //this is for stars
                System.out.print("*");
            }
            System.out.println("");  //this gets to next line
        }

        ////bottom half
        for (line=width/2,spaces=1;line>0;line--,spaces++){  //lines start one less than largest line in top half, go down, based on width
            for (int i=1;i<=spaces;i++){ //this is for spaces
                System.out.print(" ");
            }
            for (stars=1;stars<=line*2-1;stars++){  //this is for stars
                System.out.print("*");
            }
            System.out.println("");  //this gets to next line
        }
    }  ////end main()
} ////end class