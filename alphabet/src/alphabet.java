import java.util.Scanner;
public class alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch <= 'm'){
            System.out.println("Given character lies between 'a' and 'm'" );
        }
        else{
            System.out.println("Given character lies between 'n' and 'z'" );
        }
    }
}
