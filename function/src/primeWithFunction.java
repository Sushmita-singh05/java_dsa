import java.util.Scanner;
public class primeWithFunction {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i=2; i<=n-1; i++){
           if(n % i == 0){
               isPrime = false;
               break;
           }
        }
        return isPrime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean result = isPrime(num);
        System.out.print(result);
    }
}
