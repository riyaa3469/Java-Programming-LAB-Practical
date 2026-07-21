package Day8;
import java.util.Scanner;
public class ClassAttendanceAnalysis {
		public static double readAttendance(double[] values,Scanner sc) {
			System.out.print("Attendance: ");
			for(int i=0;i<values.length;i++) {
				values[i]=sc.nextDouble();
			}
			return 0;
		}
		
		public static double calculateAverage(double[] values) {
			double sum=0;
			for(int i=0;i<values.length;i++) {
				sum+=values[i];
			}
			
			return sum/values.length;
		}
		public static int countShortage(double[] values,double limit) {
			int count=0;
			for(int i=0;i<values.length;i++) {
				if(values[i]<limit) {
					count++;
				}
			}
			return count;
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Number of students: ");
			int n=sc.nextInt();
			double[] values=new double[n];
			double read=readAttendance(values,sc);
			double avg=calculateAverage(values);
			int shortcount=countShortage(values,75.0);
			System.out.println("CLASS ATTENDANCE");
			System.out.printf("Class Average: %.2f%%\n",avg);
			System.out.println("Students Below 75%: "+shortcount);
	}
}
