import java.util.Scanner;
class Rectangle {
    int length;
    int breadth;
    Rectangle() {
        this.length = 10;
        this.breadth = 5;
    }
    Rectangle(int len, int bre) {
        this.length = len;
        this.breadth = bre;
    }
    void display() {
        System.out.println("Area: " + length * breadth);
    }
}
public class Constructor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        Rectangle r2 = new Rectangle(l, b);
        System.out.print("Default Rectangle Area: ");
        r1.display();
        System.out.print("Parameterized Rectangle Area: ");
        r2.display();
    }
}
