//Getter and Setter
class Employee {
    private int id;
    private String name;
    private double salary;
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}
public class getSet{
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Sushmita");
        emp.setSalary(70000);
        System.out.println("Employee ID: "+emp.getId());
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("Employee Salary: "+emp.getSalary());
    }
}
