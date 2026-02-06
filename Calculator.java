import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        // create Scanner to read user input
        Scanner input = new Scanner(System.in);
        
        // ask user to enter two whole numbers
        System.out.print("Enter the first whole number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second whole number: ");
        int num2 = input.nextInt();
        
        // add the numbers
        int sum = num1 + num2;
       
        // print the result
        System.out.println("The sum is: " + sum);
    }
}
