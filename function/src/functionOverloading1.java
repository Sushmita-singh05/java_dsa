import java.util.Scanner;
public class functionOverloading1 {
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static float sum(float num1, float num2){
        return num1 + num2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        int result_i = sum(a,b);
        float result_f = sum(a,b);
        System.out.println("Sum of two integer number is: "+result_i);
        System.out.print("Sum of two float number is: "+result_f);
    }
}
