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
        System.out.print("Would you like to perform addition or subtraction? ");
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
        else {
            System.out.println("Invalid option.");
        }
    }
}

