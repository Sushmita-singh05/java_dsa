import java.util.Scanner;
public class temperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();
        if (temp < 15) {
            System.out.println("Cold");
        }
        else if (temp >= 15 && temp <= 30) {
            System.out.println("Warm");
        }
        else {
            System.out.println("Hot");
        }
    }
}
