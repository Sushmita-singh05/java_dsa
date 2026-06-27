import java.util.Scanner;
public class positiveSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        if(a > 0 && b > 0 ){
            if(sum < 100){
                System.out.println("Both number are positive and sum is less than 100");
            }
            else{
                System.out.println("Both number are positive but sum is not less than 100");
            }
        }
    }
}
