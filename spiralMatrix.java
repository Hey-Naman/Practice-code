import java.util.*;

public class spiralMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Rows of array: ");
        int rowsOfArray = scanner.nextInt();
        System.out.print("Enter The columns of array: ");
        int colsOfArray = scanner.nextInt();
        int[][] spiralArray = new int[rowsOfArray][colsOfArray];
        for(int i=0;i<rowsOfArray;i++){
            for(int j=0;j<colsOfArray;j++){
                System.out.print("Enter The column "+j+" of row "+i+" : ");
                spiralArray[i][j] = scanner.nextInt();
            }
        }
        int rowStart = 0;
        int rowEnd = rowsOfArray-1;
        int columnStart = 0;
        int columnEnd = colsOfArray-1;


        //while (rowStart<=rowEnd && columnStart<=columnEnd) {

            for(int j = columnStart; j<=columnEnd; j++){
                System.out.print(spiralArray[rowStart][j] + " ");
            }
            rowStart++;
            for(int i = rowStart; i<=rowEnd; i++){
                System.out.println(spiralArray[i][columnStart]);
            }
            
       // }

    }
}