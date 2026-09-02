class Student2{
    int age;
    String name;
    Student2(){
        this(20);
    }
    Student2(int age){
        this(age,"Sushmita");
    }
    Student2(int age, String name){
        this.age = age;
        this.name = name;
    }
    void display(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
}
public class Practice1 {
    public static void main(String[] args){
    Student2 s = new Student2();
    s.display();
    }
}
