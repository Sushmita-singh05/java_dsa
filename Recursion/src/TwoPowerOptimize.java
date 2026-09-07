public class TwoPowerOptimize {
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPow = power(a, n/2);
        int halfPowSq = halfPow * halfPow;
        if(n%2 != 0){
            halfPowSq = a * halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args){
        int a = 2;
        int n = 5;
        System.out.println(power(a,n));
    }
}
