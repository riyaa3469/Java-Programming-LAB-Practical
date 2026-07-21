package Day14;

public class Student {
	int rollNo;
    String name;
    int[] marks;
    int attendance;

    Student(int rollNo, String name, int[] marks, int attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    int calculateTotal() {
        int total = 0;
        for (int m : marks) total += m;
        return total;
    }

    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    String getResult() {
        for (int m : marks) {
            if (m < 40) return "FAIL";
        }
        return "PASS";
    }

    String getAttendanceStatus() {
        return (attendance >= 75) ? "Satisfactory" : "Shortage";
    }

    void printRow() {
        System.out.printf("%d %s - Total: %d, Average: %.2f, Result: %s, Attendance: %s\n", 
            rollNo, name, calculateTotal(), calculateAverage(), getResult(), getAttendanceStatus());
}
}
