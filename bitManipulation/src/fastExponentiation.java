import java.util.Scanner;
public class fastExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int n = sc.nextInt();
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1)
                ans = ans * a;
            a = a * a;
            n = n >> 1;
        }
        System.out.println("Answer = " + ans);
    }
}
