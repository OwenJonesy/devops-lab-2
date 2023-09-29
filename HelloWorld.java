@@ -1,29 +1,44 @@
import java.util.Scanner;

public class ComputeAverage {
public class AverageMinMaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of values
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid number of values.");
            return;
        }
        int numValues = scanner.nextInt();

        // Initialize variables for sum, average, smallest, and largest
        double sum = 0;
        double smallest = Double.MAX_VALUE;
        double largest = Double.MIN_VALUE;

        System.out.println("Enter the values one by one:");
        for (int i = 0; i < n; i++) {
            System.out.print("Value " + (i + 1) + ": ");
        // Prompt the user to enter the values and calculate the sum, smallest, and largest
        for (int i = 1; i <= numValues; i++) {
            System.out.print("Enter value #" + i + ": ");
            double value = scanner.nextDouble();
            sum += value;

            if (value < smallest) {
                smallest = value;
            }

            if (value > largest) {
                largest = value;
            }
        }

        double average = sum / n;
        System.out.println("The average of the " + n + " values is: " + average);
        // Calculate the average
        double average = sum / numValues;

        // Display the results
        System.out.println("The average of the " + numValues + " values is: " + average);
        System.out.println("The smallest value is: " + smallest);
        System.out.println("The largest value is: " + largest);

        // Close the scanner
        scanner.close();
        //
        //
    }
}

//by stephen
