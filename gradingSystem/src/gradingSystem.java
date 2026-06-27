/*import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("A grade is obtained");
        }
        else if(marks >= 70){
            System.out.println("B+ grade is obtained");
        }
        else if(marks >= 60){
            System.out.println("B grade is obtained");
        }
        else if(marks >= 45){
            System.out.println("C grade is obtained");
        }
        else {
            System.out.println("Fail");
        }
    }
}*/

import java.util.Scanner;
public class gradingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        int grade = marks / 10;
        switch(grade) {
            case 10:
                System.out.println("Outstanding");
                break;
            case 9:
                System.out.println("A+ grade is obtained");
                break;
            case 8:
                System.out.println("A grade is obtained");
                break;
            case 7:
                System.out.println("B+ grade is obtained");
                break;
            case 6:
                System.out.println("B grade is obtained");
                break;
            case 5:
            case 4:
                System.out.println("C grade is obtained");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
