import java.util.Scanner;

public class totalLength {

    public static void main(String[] args) {
                // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Strings would you like to use: ");
        
        // Validate user input for the size of the array
        int sizeOfArray = 0;
        while (true) {
            try {
                sizeOfArray = Integer.parseInt(scanner.next());
                break; // Break the loop if the input is a valid integer
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
                System.out.print("How many Strings would you like to use: ");
            }
        }

        String[] stringArray = new String[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            int n = i + 1;
            System.out.print("Enter String number " + n + ": ");
            // Use scanner.nextLine() for multi-word strings
            stringArray[i] = scanner.nextLine();
        }

        int totalLength = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            totalLength += stringArray[i].length();
        }
        System.out.print("Combined Length of all the strings is: " + totalLength);
    }
}