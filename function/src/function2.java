import java.util.Scanner;
public class function2 {
    public static void multiply(int num1, int num2){
        int multiplication = num1*num2;
        System.out.println("Multiplication of 2 number is: "+multiplication);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        multiply(a,b);
    }
}
