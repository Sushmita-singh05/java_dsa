import java.util.Scanner;
public class functionOverloading {
    public static int sum(int num1,int num2){
        return num1 + num2;
    }
    public static int sum(int num1,int num2,int num3){
        return num1 + num2 + num3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        int result = sum(a,b);
        int result1 = sum(a,b,c);
        System.out.println("Sum of two number is: "+result);
        System.out.print("Sum of three number is: "+result1);
    }
}
