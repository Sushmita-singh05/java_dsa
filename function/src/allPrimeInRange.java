import java.util.Scanner;
public class allPrimeInRange {
    public static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("All the prime numbers in given range are: ");
        primesInRange(num);
    }
}