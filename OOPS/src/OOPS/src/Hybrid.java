interface Sports {
    void play();
}
class People {
    void displayPerson() {
        System.out.println("I am a person");
    }
}
class Stud extends People {
    void study() {
        System.out.println("Student is studying");
    }
}
class CollegeStudents extends Stud implements Sports {
    void attendClass() {
        System.out.println("Student is attending class");
    }
    public void play() {
        System.out.println("Student is playing football");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        CollegeStudents cs = new CollegeStudents();
        cs.displayPerson();
        cs.study();
        cs.attendClass();
        cs.play();
    }
}
