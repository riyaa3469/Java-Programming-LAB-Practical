package Day3;

import java.util.Scanner;

public class CollegeAdmissionProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Name:");
		String name=sc.nextLine();   // we store name in string 
		System.out.print("Roll number:");
		int rollno=sc.nextInt();  //integers are stored in int variable
		sc.nextLine();
		System.out.print("Programme:");
		String programme=sc.nextLine();   //nextLine() is used to read an entire line of text
		System.out.print("Semester:");
		int sem=sc.nextInt();                //nextInt()is used to read an integer entered by user
		sc.nextLine();
		
		System.out.print("Email:");	
		String email=sc.nextLine();
		System.out.print("City:");
		String city=sc.nextLine();
		
		System.out.println("ADMISSION PROFILE");
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+rollno);
		System.out.println("Programme: "+programme);
		System.out.println("Semester: "+sem);
		System.out.println("Email: "+email);
		System.out.println("City: "+city);

	}

}
