class Person {
    String name = "Sushmita";
    int age = 20;
    void displayPerson() {
        System.out.println("Hello");
    }
}
class Pupil extends Person {
    String course = "BTech";
    void displayStudent() {
        System.out.println("I'm Student");
    }
}
class Teacher extends Person {
    String subject = "Maths";
    void displayTeacher() {
        System.out.println("I'm a Teacher");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Pupil p = new Pupil();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.course);
        p.displayPerson();
        p.displayStudent();
        Teacher t = new Teacher();
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.subject);
        t.displayPerson();
        t.displayTeacher();
    }
}