package Day2;
import java.util.Scanner;
public class EmployeeSalarySlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your basic salary:");
		double basicSalary=sc.nextDouble();
		double HRA=basicSalary*0.2;
		double DA=basicSalary*0.1;
		double PF=basicSalary*0.12;
		double grossSalary=basicSalary+HRA+DA;
		double netSalary=grossSalary-PF;
		System.out.println("SALARY SLIP");
		System.out.println("Basic Salary:Rs."+basicSalary);
		
		System.out.println("HRA(20%):Rs."+HRA);
		System.out.println("DA(10%):Rs."+DA);
		System.out.println("PF(12%):Rs."+PF);
		System.out.println("Gross Salary:Rs."+grossSalary);
		System.out.println("Net Salary:Rs."+netSalary);
	}

}
