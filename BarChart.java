import java.util.Random;

/**
 * This program generates three random numbers, prints the numbers, 
 * then prints out a star for each hundred in the printed number.
 * @author Jon Cesena
 * @version v1.0
 * @since 3/9/2026
 */

public class BarChart{
    public static void main (String[] args){
        //vars section
        int first, second, third;

        //generate and assign random numbers section
        Random generator = new Random();
        first = generator.nextInt(1000);
        second = generator.nextInt(1000);
        third = generator.nextInt(1000);

        //Print out numbers
        System.out.println("Number 1 is: " + first);
        System.out.println("Number 2 is: " + second);
        System.out.println("Number 3 is: " + third);

        System.out.println("");

        //Bar Chart Section
        System.out.println("NUMBER BAR CHART");

        //first stars
        System.out.println("Number 1: ");
        if (first<100)
            System.out.println( "<100 no stars");
        else{
            for (int i=1; i<=first/100;i++)
                System.out.print("*");
        }
        System.out.println("");

        //second stars
        System.out.println("Number 2: ");
        if (second<100)
            System.out.println( "<100 no stars");
        else{
            for (int i=1; i<=second/100;i++)
                System.out.print("*");
        }
        System.out.println("");
        
        //third stars
        System.out.println("Number 3: ");
        if (third<100)
            System.out.println( "<100 no stars");
        else{
            for (int i=1; i<=third/100;i++)
                System.out.print("*");
        }
        System.out.println("");
    }
}