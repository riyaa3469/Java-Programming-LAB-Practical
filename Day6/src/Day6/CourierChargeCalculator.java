package Day6;

import java.util.Scanner;

public class CourierChargeCalculator {
		// TODO Auto-generated method stub
		public static double calculateCharge(double weight) {
			return weight*50.0;
		}
		public static double calculateCharge(double weight,double distance) {
			return (weight*50.0)+(distance*1.0);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Delivery type: ");
			int type=sc.nextInt();
			
			System.out.print("Weight: ");
			double weight=sc.nextDouble();
			
			System.out.print("Distance: ");
			String distanceinput=sc.next();
			distanceinput=distanceinput.replaceAll("[^0-9.]","");
			double distance=Double.parseDouble(distanceinput);
			
			System.out.println("COURIER CHARGE");
			if(type==1) {
				System.out.println("Delivery: Local");
				System.out.println("Weight: "+weight);
				double charge=calculateCharge(weight);
				System.out.printf("Charge: Rs. %.2f\n",charge);
			}
			else {
				System.out.println("Delivery: Outstation");
				System.out.println("Weight: "+weight+" kg");
				System.out.println("Distance: "+(int)distance+" km");
				double charge=calculateCharge(weight,distance);
				System.out.printf("Charge: Rs. %.2f\n",charge);
			}

	}

}
