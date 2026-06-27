import java.util.Scanner;
public class multipleCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%b == 0 || b%a == 0){
            System.out.println("Given numbers are multiple of each other");
        }
        else{
            System.out.println("Given numbers are not multiple of each other");
        }
    }
}
