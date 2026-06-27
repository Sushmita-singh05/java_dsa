import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i = n ; i >= 1 ; i--){
            for(int j=1 ; j<=i ; j++){
                char ch = (char)('A' + j-1);
                if((i+j)%2 == 0){
                    System.out.print(ch + " ");
                }
                else{
                    System.out.print(Character.toLowerCase(ch)+ " ");
                }
            }
            System.out.println(" ");
        }
    }
}
