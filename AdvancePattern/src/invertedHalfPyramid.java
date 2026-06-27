import java.util.Scanner;
public class invertedHalfPyramid {
    public static void pyramid(int n){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        pyramid(row);
    }
}
