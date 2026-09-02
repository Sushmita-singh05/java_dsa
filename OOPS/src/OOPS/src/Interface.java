interface Animal3{
    void sound();
}
class Cat implements Animal3{
    public void sound(){
        System.out.println("Cat Meows");
    }
}
public class Interface {
    public static void main(String[] args){
        Cat c = new Cat();
        c.sound();
    }
}
