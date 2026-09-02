import java.util.Scanner;
class Verify{
    String name;
    int age;
    Verify(String n, int a){
        name = n;
        age = a;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Constructor1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        Verify student = new Verify(name,age);
    }
}
