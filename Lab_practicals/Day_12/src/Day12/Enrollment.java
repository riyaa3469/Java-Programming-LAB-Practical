package Day12;

public class Enrollment {
	String enrollmentId;
    String learnerName;
    String courseName;
    double fee;
    String paymentStatus;

    Enrollment(String id, String name, String course, double fee, String status) {
        this.enrollmentId = id;
        this.learnerName = name;
        this.courseName = course;
        this.fee = fee;
        this.paymentStatus = status;
    }
    Enrollment(String id, String name, String course, double fee) {
        this(id, name, course, fee, "Pending");
    }

    void display() {
        System.out.println("ENROLLMENT RECORD");
        System.out.println("ID: " + enrollmentId);
        System.out.println("Learner: " + learnerName);
        System.out.println("Course: " + courseName);
        System.out.printf("Fee: Rs. %.2f\n", fee);
        System.out.println("Payment Status: " + paymentStatus);
}
}

