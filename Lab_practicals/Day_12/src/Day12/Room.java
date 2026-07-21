package Day12;

public class Room {
	int roomNumber;
    String roomType;
    double dailyRate;
    boolean isAvailable;

    Room(int roomNumber, String roomType, double dailyRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        this.isAvailable = true;
    }
    

    void bookRoom(int days) {
        if (isAvailable) {
            isAvailable = false;
            double totalAmount = dailyRate * days;
            System.out.println("BOOKING DETAILS");
            System.out.println("Room: " + roomNumber + " - " + roomType);
            System.out.println("Days: " + days);
            System.out.printf("Total Amount: Rs. %.2f\n", totalAmount);
            System.out.println("Status: Booked");
        }
    }
}
