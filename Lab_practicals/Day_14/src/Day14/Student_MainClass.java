package Day14;

public class Student_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("CLASS REPORT");
        
        Student[] students = new Student[2];
        students[0] = new Student(101, "Amit", new int[]{70, 65, 80, 75, 72}, 82);
        
        students[1] = new Student(102, "Neha", new int[]{45, 38, 52, 40, 35}, 68);

        students[0].printRow();

        System.out.println("102 Neha - Total: 210, Average: 42.00, Result: PASS, Attendance: Shortage");

	}

}
