package Day6;
import java.util.Scanner;
public class CourierChargeCalculator {
	public static double calculateCharge(double weight) {
        return weight * 50.0; 
    }
    public static double calculateCharge(double weight, double distance) {
        return (weight * 50.0) + (distance * 1.0); 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Delivery type:");
		        int type = sc.nextInt();
		        System.out.print("Weight:");
		        double weight = sc.nextDouble();
		        
		        System.out.println("COURIER CHARGE");
		        if (type == 1) {
		            System.out.println("Delivery: Local");
		            System.out.printf("Charge: Rs. %.2f\n", calculateCharge(weight));
		        } 
		        if (type == 2) {
		        	System.out.print("Distance:");
		            int distance = sc.nextInt();
		            System.out.println("Delivery: Outstation");
		            System.out.println("Weight: " + weight + " kg");
		            System.out.println("Distance: " + distance + " km");
		            System.out.printf("Charge: Rs. %.2f\n", calculateCharge(weight, distance));
		        }
		    }
	}
