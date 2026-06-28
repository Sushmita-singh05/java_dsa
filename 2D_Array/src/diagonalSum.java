import java.util.Scanner;
public class diagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            sum = sum + matrix[i][i];
        }
        System.out.println("Primary Diagonal Sum: "+sum);
        for(int i=0; i<matrix.length; i++){
            sum = sum + matrix[i][rows-1-i];
        }
        System.out.println("Secondary Diagonal Sum: "+sum);
    }
}
