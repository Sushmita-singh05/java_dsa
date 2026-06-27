import java.util.Scanner;
public class medianNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int median;
        if ((a > b && a < c) || (a > c && a < b)) {
            median = a;
        }
        else if ((b > a && b < c) || (b > c && b < a)) {
            median = b;
        }
        else {
            median = c;
        }
        System.out.println("Median value is: " + median);
    }
}
