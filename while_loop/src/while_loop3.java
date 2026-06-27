import java.util.Scanner;
public class while_loop3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.print("Sum of given number is: "+sum);
    }
}
