package Day14;

public class VehicleAndParkingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("CH01AB1234", 1);
        Vehicle v2 = new Vehicle("CH02CD5678", 2);

        ParkingTicket t1 = new ParkingTicket(v1, 3);
        ParkingTicket t2 = new ParkingTicket(v2, 2);

        t1.printTicket(1);
        t2.printTicket(2);

        double totalRevenue = t1.fee + t2.fee;
        System.out.printf("Total Revenue: Rs. %.0f\n", totalRevenue);
		
	}
}
