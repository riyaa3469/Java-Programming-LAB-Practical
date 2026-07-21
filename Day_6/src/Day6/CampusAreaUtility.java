package Day6;
import java.util.Scanner;
public class CampusAreaUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        System.out.println("AREA RESULT");
        if (choice.equalsIgnoreCase("Rectangle")) {
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            System.out.println("Shape: Rectangle");
            System.out.printf("Area: %.2f square units\n", area(length, width));
        } else if (choice.equalsIgnoreCase("Square")) {
            double side = sc.nextDouble();
            System.out.println("Shape: Square");
            System.out.printf("Area: %.2f square units\n", area(side));
        }
    }
    public static double area(double side) {
        return side * side;
    }
    public static double area(double length, double width) {
        return length * width;
    }
	}
