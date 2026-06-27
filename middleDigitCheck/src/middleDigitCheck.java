import java.util.Scanner;
public class middleDigitCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit value: ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        if(b > a && b > c){
            System.out.println("Middle digit is largest");
        }
        else if(b < a && b < c){
            System.out.println("Middle digit is smallest");
        }
        else{
            System.out.println("Middle digit is neither smallest nor largest");
        }
    }
}
