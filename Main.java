import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // get user input
            System.out.print("Enter a number: ");

            // Calculations
            double number = 0;
            double result = 0;

            try {
                number = scanner.nextInt();
                result = 100 / number;
            }
            catch (Exception e) {
                number = scanner.nextDouble();
                result = 100 / number;
            }
            

            // Prints Outcome
            System.out.println("100 / " + number + " = " + result);
        }
        // Catches
        catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }
        catch (Exception e) {
            System.out.println("You Have to enter a number");
        }
        scanner.close();
    }
}