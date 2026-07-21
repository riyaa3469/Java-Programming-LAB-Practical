package Day9;
import java.util.Scanner;
public class HostelElectricityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        int[][] matrix = new int[4][7];
		        int totalHostelConsumption = 0;

		        System.out.println("Units for 4 rooms over 7 days:");
		        for (int i = 0; i < 4; i++) {           
		            for (int j = 0; j < 7; j++) {
		                matrix[i][j] = scanner.nextInt();
		            }
		        }

		        System.out.println("CONSUMPTION REPORT");
		        for (int i = 0; i < 4; i++) {
		            int roomTotal = 0;
		            for (int j = 0; j < 7; j++) {
		                roomTotal += matrix[i][j];
		            }
		            totalHostelConsumption += roomTotal;
		            System.out.println("Room " + (i + 1) + " Weekly Units: " + roomTotal);
		        }
		        
		        System.out.println("Total Hostel Consumption: " + totalHostelConsumption + " units");
		    }
		
	}


