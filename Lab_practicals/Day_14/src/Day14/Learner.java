package Day14;

public class Learner {
	String id;
    String name;
    double courseFee;
    double amountPaid;
    int[] attendance;

    Learner(String id, String name, double courseFee, double amountPaid, int[] attendance) {
        this.id = id;
        this.name = name;
        this.courseFee = courseFee;
        this.amountPaid = amountPaid;
        this.attendance = attendance;
    }

    double calculatePendingFee() {
        return courseFee - amountPaid;
    }

    double calculateAttendancePercentage() {
        int presentCount = 0;
        for (int day : attendance) {
            if (day == 1) presentCount++;
        }
        return (presentCount / (double) attendance.length) * 100;
    }

    String isCertificateEligible() {
        if (calculatePendingFee() > 0) {
            return "Not Eligible (fee pending)";
        }
        return "Eligible";
    }

    void displayReport() {
        System.out.println("LEARNER REPORT");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Pending Fee: Rs. %.2f\n", calculatePendingFee());
        System.out.printf("Attendance: %.2f%%\n", calculateAttendancePercentage());
        System.out.println("Certificate Eligibility: " + isCertificateEligible());
}
}
