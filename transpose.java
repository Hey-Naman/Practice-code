import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter The Rows of array: ");
        int rowsOfArray = scanner.nextInt();
        System.out.print("Enter The columns of array: "); 
        int colsOfArray = scanner.nextInt();
        int[][] transposeArray = new int[rowsOfArray][colsOfArray]; 
        for (int i = 0; i < rowsOfArray; i++) {
            for (int j = 0; j < colsOfArray; j++) {
                System.out.print("Enter The column " + j + " of row " + i + " : ");
                transposeArray[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rowsOfArray; i++) {
            for (int j = 0; j < colsOfArray; j++) {
                System.out.print(transposeArray[j][i] + " ");
            }
            System.out.println();
        }

    }

    }
