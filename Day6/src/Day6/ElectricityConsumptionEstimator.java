package Day6;

import java.util.Scanner;

public class ElectricityConsumptionEstimator {
			public static double calculateBill(int units) {
				return units*6.0;
			}
			public static double calculateBill(int units,double equipmentCharge) {
				return  (units*6.0)+equipmentCharge;
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.print("Consumer type: ");
				String type=sc.nextLine();
				
				System.out.print("Units: ");
				int units=sc.nextInt();
				
				System.out.print("Fixed equipment charge: ");
				double equipmentCharge=sc.nextDouble();
				
				System.out.println("ELECTRICITY ESTIMATE");
				System.out.println("Consumer type: "+type);
				if(type.equalsIgnoreCase("Laboratory")) {
					double bill=calculateBill(units);
					double total=calculateBill(units,equipmentCharge);
					System.out.printf("Energy Charge: Rs. %.2f\n",bill);
					System.out.printf("Equipment Charge: Rs. %.2f\n",equipmentCharge);
					System.out.printf("Total Cost: Rs. %.2f\n",total);
				}
				else {
					System.out.printf("Total Cost: Rs. %.2f\n",calculateBill(units));
				}
	}

}
