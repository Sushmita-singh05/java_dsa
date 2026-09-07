import java.util.Scanner;
public class Sum {
    public static int number(int n){
        if(n == 1){
            return 1;
        }
        return n + number(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = number(n);
        System.out.println("Sum of natural number: "+result);
    }
}
