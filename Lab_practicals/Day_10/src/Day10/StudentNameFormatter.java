package Day10;
import java.util.Scanner;
public class StudentNameFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

        System.out.print("First name: ");
        String first=sc.nextLine().trim();

        System.out.print("Middle name: ");
        String middle=sc.nextLine().trim();

        System.out.print("Last name: ");
        String last=sc.nextLine().trim();

  
        String cleanFirst=first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        String cleanMiddle=middle.substring(0, 1).toUpperCase() + middle.substring(1).toLowerCase();
        String cleanLast=last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        String formattedName=cleanFirst + " " + cleanMiddle + " " + cleanLast;
        
  
        String initialFormat=cleanFirst.charAt(0) + ". " + cleanMiddle.charAt(0) + ". " + cleanLast;

        System.out.println("Formatted Name: " +formattedName);
        System.out.println("Initial Format: " +initialFormat);
	}

}
