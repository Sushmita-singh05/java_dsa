import java.util.Scanner;
class Car {
    String brand;
    String model;
    double price;
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        Car c = new Car(brand, model, price);
        c.display();
    }
}
