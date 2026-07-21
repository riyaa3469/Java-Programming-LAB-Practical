package Day7;
import java.util.Scanner;
public class DailyExpenseTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double[]expenses=new double[7];
		System.out.println("Expenses:");
		for(int i=0;i<7;i++) {
			expenses[i]=sc.nextInt();
		}
		System.out.println("Daily budget limit: ");
		int budget_limit=sc.nextInt();
		double total=0;
		int count=0;
		for(int i=0;i<7;i++) {
			total+=expenses[i];
			if(budget_limit<expenses[i]) {
				count++;
			}
		}
		double average=total/7.0;
		System.out.println("EXPENSE REPORT");
		System.out.printf("Total Spending: Rs. %.2f\n",total);
		System.out.printf("Average Daily Spending: Rs. %.2f\n",average);
		System.out.println("Days Above Budget: "+count);

	}

}
