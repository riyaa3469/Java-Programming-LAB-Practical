package Day2;

import java.util.Scanner;

public class OnlineOrderBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Item price:");
		int price=sc.nextInt();
		System.out.print("Quantity:");
		int quant=sc.nextInt();
		System.out.print("Delivery Charge:");
		double charge=sc.nextInt();
		System.out.print("Discount percentage:");
		double dis=sc.nextInt();
		
		double subtotal=price*quant;
		double discount=subtotal*dis/100;
		double finalamount=subtotal-discount+charge;
		System.out.println("ORDER BILL");
		System.out.printf("Subtotal: Rs. %.2f%n",subtotal);
		System.out.printf("Discount: Rs. %.2f%n ",discount);
		System.out.printf("Delivery Charge: Rs. %.2f%n",charge);
		System.out.printf("Final Payable Amount: Rs. %.2f%n",finalamount);

	}

}
