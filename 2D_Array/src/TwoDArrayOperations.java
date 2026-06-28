import java.util.Scanner;
public class TwoDArrayOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter array elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(("2D Array: "));
        for(int i=0; i<rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at position(" + i + "," + j + ")");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Element not found.");
        }
        System.out.print("\nEnter row index to update: ");
        int r = sc.nextInt();
        System.out.print("Enter column index to update: ");
        int c = sc.nextInt();
        System.out.print("Enter new value: ");
        int value = sc.nextInt();
        arr[r][c] = value;
        System.out.println("\nUpdated 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
