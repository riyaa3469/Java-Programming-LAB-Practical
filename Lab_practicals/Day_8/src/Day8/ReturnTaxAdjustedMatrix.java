package Day8;
import java.util.Scanner;
public class ReturnTaxAdjustedMatrix {
		public static double[] addTax(double[] prices,double taxRate) {
			double[] taxedPrices=new double[prices.length];
			for(int i=0;i<prices.length;i++){
				taxedPrices[i]=prices[i]+(prices[i]*taxRate/100);
			}
			return taxedPrices;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Number of items: ");
			int no_of_items=sc.nextInt();
			double[] original_prices=new double[no_of_items];
			System.out.print("Prices: ");
			for(int i=0;i<no_of_items;i++){
				original_prices[i]=sc.nextDouble();
			}
			System.out.print("GST percentage: ");
			double gst=sc.nextDouble();
			double[] adjustedPrices=addTax(original_prices,gst);
			System.out.print("ORIGINAL PRICES: ");
			for(int i=0;i<original_prices.length;i++) {
				System.out.printf("%.2f ",original_prices[i]);
			}
			
			System.out.printf("\nGST-ADJUSTED PRICES: ");
			for(int i=0;i<adjustedPrices.length;i++) {
				
				System.out.printf("%.2f ",adjustedPrices[i]);
			}
	}

}
