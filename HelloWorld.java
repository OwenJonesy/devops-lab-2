// this is my program
//ive changed it again
//This is another string
//Welcome!


import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of values
        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();
        
        // Initialize variables for sum and average
        double sum = 0;
        
        // Prompt the user to enter the values and calculate the sum
        for (int i = 1; i <= numValues; i++) {
            System.out.print("Enter value #" + i + ": ");
            double value = scanner.nextDouble();
            sum += value;
        }
        
        // Calculate the average
        double average = sum / numValues;
        
        // Display the result
        System.out.println("The average of the " + numValues + " values is: " + average);
        
        // Close the scanner
        scanner.close();
    }
}
