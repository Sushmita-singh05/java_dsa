import java.util.Scanner;
public class integer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        if(num >= 0 && num <= 9){
            System.out.println("Single-digit number");
        }
        else if(num >= 10 && num <= 99){
            System.out.println("Double-digit number");
        }
        else{
            System.out.println("Multi-digit number");
        }
    }
}
