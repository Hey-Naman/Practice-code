import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Till where do you want to print the series?: ");
        int endPoint = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        for(int i = 0; i < endPoint; i+=firstNumber){
            int next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;
            System.out.print(next + " ");
        }
    }
}