class Animalss{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dogs extends Animalss{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Method_Overriding {
    public static void main(String[] args){
        Animalss a = new Dogs();
        a.sound();
    }
}
