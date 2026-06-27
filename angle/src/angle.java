import java.util.Scanner;
public class angle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angles: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = 180 - (x + y);
        System.out.println("Third angle is: " +z);
    }
}
