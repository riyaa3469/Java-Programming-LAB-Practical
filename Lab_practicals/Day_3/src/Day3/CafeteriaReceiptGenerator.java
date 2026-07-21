package Day3;

import java.util.Scanner;

public class CafeteriaReceiptGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Item name:");
		String item=sc.nextLine();
		
		
		System.out.print("Unit price:");
		double unit_price=sc.nextDouble();
		
		System.out.print("Quantity:");
		int quant=sc.nextInt();
		
		System.out.print("GST rate:");
		double gst=sc.nextDouble();
		
		double subtotal=unit_price*quant;
		double Gst=(subtotal*gst)/100;
		double grandtotal=Gst+subtotal;
		
		System.out.println("CAFETERIA RECEIPT");
		System.out.println("Item :"+item);
		System.out.printf("Subtotal: Rs.%.2f%n",subtotal);
		System.out.printf("GST: Rs.%.2f%n",Gst);
		System.out.printf("Grand Total: Rs.%.2f%n",grandtotal);

	}

}
