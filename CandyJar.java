/*
* Description: A Java program that calculates candies in a candy jar given amount sold
*/

import java.util.Scanner;

public class CandyJar {
    // Define constants
    private static final int TOTAL_CANDIES = 10;
    private static final int MAX_SOLD_CANDIES = 5;
    
    public static void main(String[] args) {
        int candiesLeft = TOTAL_CANDIES;
        int numSold;
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter number of candies sold
        System.out.print("Enter number of candies sold: ");
        numSold = sc.nextInt();
        
        // Check if input is valid
        if (numSold >= 1 && numSold <= MAX_SOLD_CANDIES) {
            System.out.println("Number of candies sold: " + numSold);
            candiesLeft = TOTAL_CANDIES - numSold;
            System.out.println("Number of candies left: " + candiesLeft);
        } else {
            // Display error message and prompt user to try again
            System.out.println("Invalid input. Please enter a value between 1 and " + MAX_SOLD_CANDIES + ".");
            System.out.println("Number of candies left: " + candiesLeft);
        }
        
        sc.close();
    }
}
