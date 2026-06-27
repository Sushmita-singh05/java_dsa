import java.util.Scanner;
public class charCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("Given character is a letter.");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println("Given character is a digit.");
        }
        else{
            System.out.println("Invalid character");
        }
    }
}
