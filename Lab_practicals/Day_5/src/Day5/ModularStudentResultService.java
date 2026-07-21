package Day5;

import java.util.Scanner;

public class ModularStudentResultService {
		public static int calculateTotal(int marks1,int marks2,int marks3,int marks4,int marks5) {
			return marks1+marks2+marks3+marks4+marks5;
		}
		public static double calculatePercentage(int total,int max) {
			return (total*100)/max;
		}
		public static boolean isPassed(double per) {
			return (per>=45);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Marks: ");
			int marks1=sc.nextInt();
			int marks2=sc.nextInt();
			int marks3=sc.nextInt();
			int marks4=sc.nextInt();
			int marks5=sc.nextInt();
			System.out.println("STUDENT RESULT");
			int total=calculateTotal(marks1,marks2,marks3,marks4,marks5);
			System.out.println("Total: "+total);
			int max=500;
			double per=calculatePercentage(total,max);
			System.out.printf("Percentage: %.2f%%\n",per);
			boolean pass=isPassed(per);
			System.out.println("Status: "+(pass?"PASS":"FAIL"));
		}

	}


