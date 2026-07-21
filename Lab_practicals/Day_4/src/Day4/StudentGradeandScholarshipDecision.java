package Day4;

import java.util.Scanner;

public class StudentGradeandScholarshipDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Percentage: ");
		int per=sc.nextInt();
		
		if(per<0 || per>100) {
			System.out.println("ACADEMIC DECISION");
			System.out.println("Validation: Invalid input!.Fill right one");
			return ;
		}
		System.out.print("Attendance: ");
		int attendance=sc.nextInt();
		String grade;
		if(per>=85) {
			grade="A";
		}
		else if(per>=75) {
			grade="B";
		}
		else if(per>=60) {
			grade="C";
		}
		else if(per>=40) {
			grade="D";
		}
		else{
			grade="F";
		}
		
		String status;
		if(per>=85 && attendance>=90) {
			status="Eligible";
		}
		else {
			status="Not Eligible";
		}
		System.out.println("ACADEMIC DECISION");
		System.out.println("Grade:"+grade);
		System.out.println("Scholarship: "+status);
		System.out.println("Validation: Input accepted");

	}

}
