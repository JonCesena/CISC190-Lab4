import java.util.Scanner;

/**
 * This program gets a word from user to test for palindromes. Halts on the word quit.
 * Then tests if each word is a palindrom or not.
 * @author Jon Cesena
 * @version v1.0
 * @since 3/8/2026
 */

public class ReverseWord{
    public static void main (String[] args){

        String word, remaining, combined, flipped;
        char firstLetter;

        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.print("Enter words to test for palindromes, ensure last word is quit.");

            word = keyboard.next().toLowerCase();

            while(!word.equals("quit")){
                firstLetter = word.charAt(0);
                remaining = word.substring(1);
                combined = remaining + firstLetter;
                flipped = "";

                // For loop to flip combined
                for(int i = combined.length() -1; i >= 0; i--)
                    flipped += combined.charAt(i);

                // Test word vs flipped
                if(word.equals(flipped))
                    System.out.println(word + " works.");
                else
                    System.out.println(word + " does not work.");

                // Get the next word
                word = keyboard.next().toLowerCase();

            }

            System.out.print("Do you want to process a new list? Enter yes, otherwise no: ");

        }while (keyboard.next().equalsIgnoreCase("yes"));
    }
}