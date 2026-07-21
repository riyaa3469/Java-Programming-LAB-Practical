package Day12;

public class Employee {
	int id;
    String name;
    String department;
    double salary;
    Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.department = "General";
        this.salary = 0.0;
        System.out.println("Employee 1: Default record created");
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = "General";
    }
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display(int num) {
        if (num == 1) return; 
        System.out.printf("Employee %d: %s, %sRs. %.2f\n", num, name, 
            (department.equals("General") ? "" : department + ", "), salary);
}
}
