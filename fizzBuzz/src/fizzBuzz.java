import java.util.Scanner;
public class fizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 7 == 0){
            System.out.println("FizzBuzz");
        }
        else if(num % 3 == 0){
            System.out.println("Fizz");
        }
        else if(num % 7 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("Not valid syntax");
        }
    }
}
