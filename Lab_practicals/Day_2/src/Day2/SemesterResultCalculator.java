package Day2;
import java.util.Scanner;

public class SemesterResultCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter first subject marks:");
		int first_subject=sc.nextInt();
		
//		System.out.println("Enter second subject marks:");
		int second_subject=sc.nextInt();
		
//		System.out.println("Enter third subject marks:");
		int third_subject=sc.nextInt();
		
//		System.out.println("Enter fourth subject marks:");
		int fourth_subject=sc.nextInt();
		
//		System.out.println("Enter fifth subject marks:");
		int fifth_subject=sc.nextInt();
		
		int total=first_subject+second_subject+third_subject+fourth_subject+fifth_subject;
		
		
		double percentage=(total*100.0)/500;
		
		Boolean exp=percentage>=40;
		System.out.println("SEMESTER RESULT");
		System.out.println("Total Marks:"+total+"/500");
		System.out.println("Percentage:"+percentage+"%");
		if(exp) {
			
			System.out.println("Result:PASS");
		}
		else {
			
			System.out.println("Result:FAIL");
			
		}

	}

}
