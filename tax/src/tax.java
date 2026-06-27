import java.util.Scanner;
public class tax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the income: ");
        int income = sc.nextInt();
        if(age >= 18 && income >= 500000){
            System.out.println("Eligible for tax");
        }
        else{
            System.out.println("Not Eligible for tax");
        }
    }
}
