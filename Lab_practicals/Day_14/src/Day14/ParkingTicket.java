package Day14;

public class ParkingTicket {
	Vehicle vehicle;
    int hours;
    double fee;

    ParkingTicket(Vehicle vehicle, int hours) {
        this.vehicle = vehicle;
        this.hours = hours;
        this.fee = calculateFee();
    }

    double calculateFee() {
        if (vehicle.type == 1) {
            return 10 + (hours - 1) * 5;
        } else {
            return 20 + (hours - 1) * 10;
        }
    }

    void printTicket(int ticketNo) {
        String typeStr = (vehicle.type == 1) ? "Two-wheeler" : "Car";
        System.out.printf("TICKET %d: %s, %s, %d hours, Fee Rs. %.0f\n", 
            ticketNo, vehicle.vehicleNumber, typeStr, hours, fee);
}
}
