package Day10;

import java.util.Scanner;

public class CollegeEmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
        System.out.print("Email: ");
        String email=sc.nextLine().trim();
        
        System.out.print("Required Domain: ");
        String domain=sc.nextLine().trim();

        int firstAt=email.indexOf('@');
        int lastAt=email.lastIndexOf('@');

        System.out.println("EMAIL VALIDATION");
        System.out.println("Email: " +email);

        if (firstAt>0 && firstAt==lastAt && email.endsWith(domain)) {
            System.out.println("Status: Valid college email");
        } else {
            System.out.println("Status: Invalid college email");
        }

	}

}
