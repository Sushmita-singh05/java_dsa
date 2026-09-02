interface Student1{
    int age = 20;   //public,static,final
    void study();   //public,abstract
}
class Sushmita implements Student1{
    public void study(){
        System.out.println("Sushmita is studying Java");
    }
}
public class Interface2 {
    public static void main(String[] args){
        Sushmita s = new Sushmita();
        System.out.println("Age: "+Student1.age);
        s.study();
    }
}
