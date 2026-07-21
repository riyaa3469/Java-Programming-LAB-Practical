package Day1;

import java.util.Scanner;

public class JVMJourney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Student Name:");
		String name=sc.nextLine();
		
		System.out.println("JVM EXECUTION JOURNEY");
		System.out.println("Student:"+name);
		System.out.println("1\\.Java Source Code(.java)");
		System.out.println("2\\.Java Compiler (javac)");
		System.out.println("3\\.Bytecode(.class)");
		System.out.println("4\\.Class Loader");
		System.out.println("5\\.JVM Execution Engine");
		System.out.println("6\\.Machine Output");

	}

}
