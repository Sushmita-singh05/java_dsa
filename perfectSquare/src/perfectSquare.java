import java.util.Scanner;
public class perfectSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        while(num > 0){
            num = num - i;
            i = i + 2;
        }
        if(num == 0){
            System.out.println("Given number is perfect square");
        }
        else{
            System.out.println("Given number is not a perfect square");
        }
    }
}
