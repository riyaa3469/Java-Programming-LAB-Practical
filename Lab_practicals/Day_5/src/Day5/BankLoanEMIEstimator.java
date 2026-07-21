package Day5;

import java.util.Scanner;

public class BankLoanEMIEstimator {

		public static double calculateInterest(double principal, double rate, int years) {
	        return (principal * rate * years) / 100.0;
	    }

	    public static double calculateTotalPayable(double principal, double interest) {
	        return principal + interest;
	    }

	    public static double calculateMonthlyInstallment(double totalPayable, int m) {
	        return totalPayable / m;
	    }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Principal amount: ");
			 double principal = sc.nextDouble();
			 System.out.print("Annual interest rate: ");
		        double rate = sc.nextDouble();
		        System.out.print("Loan period in years: ");
		        int years = sc.nextInt();
		        System.out.print("Number of months: ");
		        int months = sc.nextInt();

		        double interest = calculateInterest(principal, rate, years);
		        double totalPayable = calculateTotalPayable(principal, interest);
		        double emi = calculateMonthlyInstallment(totalPayable, months);

		        System.out.println("LOAN ESTIMATE");
		        System.out.printf("Simple Interest: Rs. %.2f\n", interest);
		        System.out.printf("Total Payable: Rs. %.2f\n", totalPayable);
		        System.out.printf("Monthly Instalment: Rs. %.2f\n", emi);
	}

}
