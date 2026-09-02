class Person1{
    String name;
    Person1(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Name: "+name);
    }
}
class Student3 extends Person1{
    String course;
    Student3(String name,String course){
        super(name);
        this.course = course;
    }
    void display(){
        System.out.println("Course: "+course);
        super.display();
    }
}
public class Practice2 {
    public static void main(String[] args){
        Student3 s = new Student3("Sushmita","BTech");
        s.display();
    }
}
