package Day4;

import java.util.Scanner;

public class UniversityParkingFeeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Vehicle Type(1-2)");
		System.out.println("1.Two-wheeler");
		System.out.println("2.Car");
		
		System.out.print("Vehicle type: ");
		int type=sc.nextInt();
		
		System.out.print("Parking hours:");
		int parking_hours=sc.nextInt();
		
		if(parking_hours<1 || parking_hours>12) {
			System.out.println("Invalid hours! It mus be between 1-12");
			
		}
		System.out.println("");
		System.out.println("PARKING FEE");
		int hour=0;
		if(type==1) {
			System.out.println("Vehicle: Two-wheeler");
			System.out.println("Hours: "+parking_hours);
			hour=(parking_hours-1)*5+10;
			System.out.println("Fee: Rs. "+hour);
		}
		if(type==2) {
			System.out.println("Vehicle: Car");
			System.out.println("Hours: "+parking_hours);
			hour=(parking_hours-1)*10+20;
			System.out.println("Fee: Rs. "+hour);
		}

	}

}
