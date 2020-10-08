/*
 * Programmer:
 * Date:
 * Purpose: 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareRoot {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for the diameter
        System.err.print("Enter a number to square root: ");
        double radicand = input.nextDouble();
        //int loopGo = 0;

        // Check that the input is not negative
        while (radicand <= 0) {
        	
        	//System.out.println("Hi");
        	System.err.println("Invalid input!");
        	System.err.print("Enter a number to square root: ");
            radicand = input.nextDouble();
        	//loopGo = loopGo +1;
        	
        	
        	 if (radicand < 0) {
                 System.err.println("Invalid input!");
                //loopGo = loopGo - 1;
                 
                 
             }
        	 
        	
        }

        // Calculate the circumference
        double root = Math.sqrt(radicand);

        // Create a decimal formatter
        DecimalFormat formatter = new DecimalFormat("#,###.##");

        // Print the results
        System.out.println("The square root of " + formatter.format(radicand) + 
                " is " + formatter.format(root) + ".");
    }
}
