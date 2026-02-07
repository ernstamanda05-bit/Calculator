import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask user for two floating point numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // ask user which operation to perform
        System.out.print("Would you like to perform addition, subtraction, multiplication, or division? ");
        String choice = input.next();

        // perform operation based on user choice
        if (choice.equalsIgnoreCase("addition")) {
            System.out.println("You chose addition.");
            System.out.println("Result: " + (num1 + num2));
        } 
        else if (choice.equalsIgnoreCase("subtraction")) {
            System.out.println("You chose subtraction.");
            System.out.println("Result: " + (num1 - num2));
        } 
        else if (choice.equalsIgnoreCase("multiplication")) {
            System.out.println("You chose multiplication.");
            System.out.println("Result: " + (num1 * num2));
        } 
        else if (choice.equalsIgnoreCase("division")) {
            System.out.println("You chose division.");

            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                System.out.println("Result: " + (num1 / num2));
            }
        } 
        else {
            System.out.println("Invalid option.");
        }
    }
}
