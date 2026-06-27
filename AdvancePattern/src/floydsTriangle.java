import java.util.Scanner;
public class floydsTriangle {
    public static void pyramid(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        pyramid(rows);
    }
}
