import java.util.Scanner;

public class FractionDecimalConverter {
    public static void main(String[] args) {
        int numerator, denominator;5
        double decimalValue;

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the numerator and denominator
        System.out.print("Enter the numerator of the fraction: ");
        numerator = scanner.nextInt();

        System.out.print("Enter the denominator of the fraction: ");
        denominator = scanner.nextInt();

        // Check if the denominator is zero
        if (denominator == 0) {
            System.out.println("Error: Denominator cannot be zero.");
        } else {
            // Calculate the decimal value of the fraction
            decimalValue = (double) numerator / denominator;

            // Print the decimal equivalent of the fraction
            System.out.println("Decimal equivalent: " + decimalValue);
        }

        scanner.close();
    }
}