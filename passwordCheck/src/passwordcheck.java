import java.util.Scanner;
public class passwordcheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String pass = sc.nextLine();
        boolean digit = false;
        for(int i = 0; i < pass.length(); i++){
            char ch = pass.charAt(i);
            if(Character.isDigit(ch)){
                digit = true;
                break;
            }
        }
        if (pass.length() >= 8 && digit) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}