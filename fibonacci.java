import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the endpoint of the Fibonacci series
        System.out.print("Till where do you want to print the series?: ");
        int endPoint = scanner.nextInt();
        
        // Initialize the first two numbers of the Fibonacci sequence
        int firstNumber = 0;
        int secondNumber = 1;
        
        // Print the initial two numbers of the Fibonacci sequence
        System.out.print(firstNumber + " " + secondNumber + " ");

        // Continue printing Fibonacci numbers until reaching or exceeding the endpoint
        while (secondNumber + firstNumber <= endPoint && endPoint > 1) {
            // Calculate the next number in the Fibonacci sequence
            int next = firstNumber + secondNumber;
            
            // Print the next number in the Fibonacci sequence
            System.out.print(next + " ");
            
            // Update the values for the next iteration
            firstNumber = secondNumber;
            secondNumber = next;
        }
    }
}
