import java.util.Scanner;
public class oddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a bit: ");
        int bit = sc.nextInt();
        if((bit & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
