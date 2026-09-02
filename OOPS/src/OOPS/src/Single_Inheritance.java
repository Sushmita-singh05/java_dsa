class Vehicle{
    String brand = "Toyota";
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Cars extends Vehicle{
    String model = "Fortuner";
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Vehicle: "+model);
    }
}
public class Single_Inheritance {
    public static void main(String[] args){
        Cars c = new Cars();
        c.start();
        c.display();
    }
}
