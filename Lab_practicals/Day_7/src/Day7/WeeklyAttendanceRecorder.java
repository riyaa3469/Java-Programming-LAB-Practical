package Day7;
import java.util.Scanner;
public class WeeklyAttendanceRecorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] attend=new int[7];
		int i;
		System.out.print("Attendance for 7 days: ");
		for(i=0;i<7;i++) {
			attend[i]=sc.nextInt();
			while(attend[i]!=0 && attend[i]!=1) {
				System.out.println("Invalid Input!.Fill either 0 or 1.");
				attend[i]=sc.nextInt();
			}
		}
	int present=0;
	
	for(i=0;i<7;i++) {
			if(attend[i]==1) {
			present++;
		}
				}
	
	
	int absent=7-present;
		double attendance=(present*100)/7.0;
	
	System.out.println("WEEKLY ATTENDANCE");
	System.out.println("Present Days: "+present);
	System.out.println("Absent Days: "+absent);
	System.out.printf("Attendance: %.2f%%\n",attendance);

}
}