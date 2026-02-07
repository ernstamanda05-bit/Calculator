import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask user for two whole numbers
        System.out.print("Enter the first whole number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second whole number: ");
        int num2 = input.nextInt();

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
                double result = (double) num1 / num2;
                System.out.println("Result: " + result);
            }
        } 
        else {
            System.out.println("Invalid option.");
        }
    }
}
