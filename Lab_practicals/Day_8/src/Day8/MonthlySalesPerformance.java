package Day8;
import java.util.Scanner;
public class MonthlySalesPerformance {
		public static double monthly_sales(double[] sales,Scanner sc) {
			System.out.print("Monthly sales: ");
			for(int i=0;i<12;i++) {
				sales[i]=sc.nextDouble();
			}
			return 0;
		}


		public static double calculateTotal(double[] sales){
			double total=0;
			for(int i=0;i<12;i++) {
				total+=sales[i];
			}
			return total;
		}


		public static double calculateAverage(double[] sales){
			double total=0;
			for(int i=0;i<12;i++) {
				total+=sales[i];
			}
			return total/12;
		}


		public static int countTargetMonths(double[] sales,double target){
			int count=0;
			for(int i=0;i<12;i++) {
				if(sales[i]>target) {
					count++;
				}
			}
			return count;
		}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				double[]sales=new double[12];
				double montlysales=monthly_sales(sales,sc);
				System.out.print("Target: ");
				double target=sc.nextDouble();
				System.out.println("SALES PERFORMANCE");
				System.out.printf("Annual Sales: Rs. %.2f\n",calculateTotal(sales));
				System.out.printf("Average Monthly Sales: Rs. %.2f\n",calculateAverage(sales));
				System.out.println("Months Achieving Target: "+countTargetMonths(sales,target));	
			}
	}