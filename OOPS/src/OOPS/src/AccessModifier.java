//public
//class Students {
//    public String name = "Sushmita";
//    public void display() {
//        System.out.println("Name: " + name);
//    }
//}
//public class AccessModifier {
//    public static void main(String[] args) {
//        Students s1 = new Students();
//        System.out.println(s1.name);
//        s1.display();
//    }
//}

//private
//class Students {
//    private int marks = 90;
//    void showMarks() {
//        System.out.println("Marks = " + marks);
//    }
//}
//public class AccessModifier {
//    public static void main(String[] args) {
//        Students s1 = new Students();
//        s1.showMarks();
//        // System.out.println(s1.marks);
//    }
//}

//Default
//class Students {
//    int age = 20;
//    void display() {
//        System.out.println(age);
//    }
//}
//public class AccessModifier {
//    public static void main(String[] args) {
//        Students s1 = new Students();
//        System.out.println(s1.age);
//        s1.display();
//    }
//}

//Protected
class Students {
    protected int rollNo = 101;
}
class CollegeStudent extends Students {
    void display() {
        System.out.println(rollNo);
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();
        s.display();
    }
}