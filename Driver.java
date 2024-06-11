import java.util.Scanner;
import java.text.*;

public class Driver {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter the buying price per share
        System.out.println("Enter your price per share that you are buying at: ");
        double buyingPrice = scan.nextDouble();
        
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        // Infinite loop to process daily closing prices
        while (true) {
            System.out.println("Enter the closing price for day " + day + ". Enter any negative value to leave: ");
            closingPrice = scan.nextDouble();
            
            // Break the loop if a negative closing price is entered
            if (closingPrice < 0.0) break;

            double earnings = closingPrice - buyingPrice;

            // Determine if earnings are positive, negative, or zero
            if (earnings > 0.0) {
                System.out.println("After day " + day + ", you earned " + df.format(earnings) + " per share.");
            } else if (earnings < 0.0) {
                System.out.println("After day " + day + ", you lost " + df.format(-earnings) + " per share.");
            } else {
                System.out.println("After day " + day + ", you have no earnings per share.");
            }

            day += 1;
        }

        // Close the Scanner object
        scan.close();
    }
}
