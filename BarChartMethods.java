import java.util.Random;

/**
 * This program generates three random numbers, prints the numbers, 
 * then prints out a star for each hundred in the printed number.
 * @author Jon Cesena
 * @version v1.0
 * @since 3/9/2026
 */

public class BarChartMethods{
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

        ////stars
        System.out.print("Number 1: ");
        printStars(first);
        System.out.print("Number 2: ");
        printStars(second);
        System.out.print("Number 3: ");
        printStars(third);
    }////end main()

    /**
     * Accepts int input and prints stars
     * @param input - number of stars to print out
     */
    public static void printStars(int input){
        if (input<100)
            System.out.print( "<100 no stars");
        else{
            for (int i=1; i<=input/100;i++)
                System.out.print("*");
        }
        System.out.println("");
    }////end printStars()
}////end Grades