import java.util.Scanner;
public class distinctDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();
        int a = num/100;   // first digit
        int b = (num / 10) % 10;   // middle digit
        int c = num % 10;   // last digit
        if(a != b && b != c && c != a){
            System.out.println("All digits are distinct");
        }
        else{
            System.out.println("All digits are not distinct");
        }
    }
}
