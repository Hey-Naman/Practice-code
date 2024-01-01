import java.util.*;

public class transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows in the array from user input
        System.out.print("Enter The Rows of array: ");
        int rowsOfArray = scanner.nextInt();

        // Get the number of columns in the array from user input
        System.out.print("Enter The columns of array: ");
        int colsOfArray = scanner.nextInt();

        // Create a 2D array to store the original matrix
        int[][] transposeArray = new int[rowsOfArray][colsOfArray];

        // Populate the original matrix by taking user input for each element
        for (int i = 0; i < rowsOfArray; i++) {
            for (int j = 0; j < colsOfArray; j++) {
                System.out.print("Enter The column " + j + " of row " + i + " : ");
                transposeArray[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < rowsOfArray; i++) {
            for (int j = 0; j < colsOfArray; j++) {
                System.out.print(transposeArray[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose the matrix and display the result
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < colsOfArray; i++) {
            for (int j = 0; j < rowsOfArray; j++) {
                System.out.print(transposeArray[j][i] + " ");
            }
            System.out.println();
        }
    }
}
