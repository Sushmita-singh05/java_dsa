import java.util.Scanner;
public class characterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = ch;   // char → ASCII convert
        if (ascii >= 65 && ascii <= 90) {
            System.out.println("Uppercase letter");
        }
        else if (ascii >= 97 && ascii <= 122) {
            System.out.println("Lowercase letter");
        }
        else if (ascii >= 48 && ascii <= 57) {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special character");
        }
        System.out.println("ASCII : " + ascii);
    }
}
