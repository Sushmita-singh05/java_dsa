import java.util.Scanner;
public class dayGreeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour (0-23) : ");
        int hour = sc.nextInt();
        if(hour >= 0 && hour < 12){
            System.out.println("Good Morning");
        }
        else if(hour < 17){
            System.out.println("Good Afternoon");
        }
        else if(hour < 20){
            System.out.println("Good Evening");
        }
        else if(hour <= 23){
            System.out.println("Good Night");
        }
        else{
            System.out.println("Invalid hour");
        }
    }
}
