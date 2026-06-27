import java.util.Scanner;
public class coordinates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0){
            System.out.println("Coordinates lies in first quadrant");
        }
        else if(x > 0 && y < 0){
            System.out.println("Coordinates lies in second quadrant");
        }
        else if(x < 0 && y < 0){
            System.out.println("Coordinates lies in third quadrant");
        }
        else{
            System.out.println("Coordinates lies in fourth quadrant");
        }
    }
}
