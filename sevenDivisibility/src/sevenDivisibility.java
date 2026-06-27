import java.util.Scanner;
public class sevenDivisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 7 == 0 && num % 10 == 7){
            System.out.println("Number ends with 7 and also divisible by 7");
        }
        else if(num % 7 == 0){
            System.out.println("Number is divisible by 7");
        }
        else if(num % 10 == 7){
            System.out.println("Number ends with 7");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
