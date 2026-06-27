import java.util.HashMap;
import java.util.Map;
class Main {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "Rahul");
        employees.put(102, "Aman");
        employees.put(103, "Priya");
        System.out.println("Employee List: ");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }
        System.out.println("\nEmployee 102: " + employees.get(102));
        System.out.println("Contains ID 101? " + employees.containsKey(101));
        System.out.println("Contains Priya? " + employees.containsValue("Priya"));
        System.out.println("Total Employees: " + employees.size());

        employees.put(102, "Aman Sharma");
        System.out.println("\nAfter Update:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        employees.remove(103);
        System.out.println("\nAfter Removal:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        System.out.println("\nIs Empty? " + employees.isEmpty());

        System.out.println("\nEmployee IDs: ");
        for (Integer id : employees.keySet()) {
            System.out.println(id);
        }
    }
}
