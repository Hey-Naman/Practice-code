import java.util.*;

public class spiralMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input

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

        // Itrate using while loop until the condition is meet!

        while (rowStart<=rowEnd && columnStart<=columnEnd) {

            //Traverse in the row till rowEnd and we will increase the rowStart by 1;

            for(int j = columnStart; j<=columnEnd; j++){
                System.out.print(spiralArray[rowStart][j] + " ");
            }
            rowStart++; 
            
            //Traverse in the column till colEnd and will decrease the colend by 1;

            for(int i = rowStart; i<=rowEnd; i++){
                System.out.print(spiralArray[i][columnEnd] + " ");
            }
            columnEnd--;

            //Traverse in the row till rowstart and will decrease the rowEnd by 1;

            for(int j = columnEnd; j>=columnStart; j--){
                System.out.print(spiralArray[rowEnd][j] + " ");
            }
            rowEnd--;

            //Traverse in the column till columnStart and will increase the columnStart by 1;

            for(int i = rowEnd; i>=rowStart; i--){
                System.out.print(spiralArray[i][columnStart] + " ");
            }
            columnStart++;

            


       }

    }
}