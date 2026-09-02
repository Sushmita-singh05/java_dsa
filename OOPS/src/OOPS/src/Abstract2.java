abstract class Animal2{
    Animal2(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}
class Dog2 extends Animal2{
    Dog2(){
        System.out.println("Dog constructor");
    }
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Abstract2 {
    public static void main(String[] args){
        Dog2 d = new Dog2();
        d.sound();
    }
}