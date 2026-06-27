import java.util.Scanner;
public class evenOddCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Both the numbers are even");
        }
        else if(num1 % 2 != 0 && num2 % 2 != 0){
            System.out.println("Both the numbers are odd");
        }
        else{
            System.out.println("one numbers is even and another one is odd");
        }
    }
}
