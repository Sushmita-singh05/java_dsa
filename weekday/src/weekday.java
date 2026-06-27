import java.util.Scanner;
public class weekday {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int day = sc.nextInt();
        if(day >= 1 && day <=5){
            System.out.println("Weekday");
        }
        else if(day == 6 || day == 7) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
