package Day6;
import java.util.Scanner;
public class ElectricityConsumptionEstimator {
	public static double calculateBill(int units) {
        return units * 6.0;
    }
    public static double calculateBill(int units, double equipmentCharge) {
        return (units * 6.0) + equipmentCharge;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Consumer type:");
		        String type = sc.next();
		        System.out.println("Units:");
		        int units = sc.nextInt();
		        
		        System.out.println("Fixed equipment charge:");
	            double equipmentCharge = sc.nextDouble();

		        System.out.println("ELECTRICITY ESTIMATE");
		        System.out.println("Type: "+type);
		        
		        if (type.equalsIgnoreCase("Laboratory")) {
		        	
		            double energyCharge = units * 6.0; 
		            double total=calculateBill(units,equipmentCharge);
		            
		            System.out.printf("Energy Charge: Rs. %.2f\n",energyCharge);
		            System.out.printf("Equipment Charge: Rs. %.2f\n",equipmentCharge);
		            System.out.printf("Total Cost: Rs. %.2f\n",total);
		        } 
		        else {
		            System.out.printf("Total Cost: Rs. %.2f\n",calculateBill(units));
		        }
		    }	    
	}
