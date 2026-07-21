package Day12;

public class EmployeeMain_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
        Employee e2 = new Employee("Amit", 45000);
        Employee e3 = new Employee(101, "Neha", "IT", 60000);
        e1.display(1);
        e2.display(2);
        e3.display(3);
	}

}
