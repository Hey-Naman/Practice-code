import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Till where do you want to print the series?: ");
        int endPoint = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        
        System.out.print(firstNumber + " " + secondNumber + " ");  // Print the initial two numbers
        while (secondNumber + firstNumber <= endPoint && endPoint>1) {
            int next = firstNumber + secondNumber;
            System.out.print(next + " ");
            firstNumber = secondNumber;
            secondNumber = next;
        }
    }
}
