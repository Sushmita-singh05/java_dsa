import java.util.Scanner;
public class function4 {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1 ; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int binomial(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bn = fact_n/(fact_r * fact_nmr);
        return bn;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int result = binomial(n,r);
        System.out.println("Binomial coefficient is: "+result);
    }
}
