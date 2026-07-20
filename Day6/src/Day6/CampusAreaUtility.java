package Day6;

import java.util.Scanner;

public class CampusAreaUtility {
		
			public static double area(double side) {
				return side *side;
			}
			public static double area(double length,double width) {
				return length*width;
			}
			public static double area(int radius) {
				return 3.14*radius*radius;
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.print("Choice: ");
				String choice=sc.nextLine();
				
				
				if(choice.equalsIgnoreCase("square")) {
					
					System.out.println("side: ");
					double side=sc.nextDouble();
					double area1=area(side);
					System.out.println("AREA RESULT");
					System.out.println("Shape:"+choice);
					System.out.printf("Area: %.2f square units\n",area1);
				}
				else if(choice.equalsIgnoreCase("rectangle")) {
					System.out.println("Length: ");
					double length=sc.nextDouble();
					System.out.println("Width: ");
					double width=sc.nextDouble();
					double area2=area(length,width);
					System.out.println("AREA RESULT");
					System.out.println("Shape:"+choice);
					System.out.printf("Area: %.2f square units\n",area2);
				}
				else if(choice.equalsIgnoreCase("circle")) {
					System.out.println("Radius: ");
					int radius=sc.nextInt();
					double area3=area(radius);
					System.out.println("AREA RESULT");
					System.out.println("Shape:"+choice);
					System.out.printf("Area: %.2f square units\n",area3);
				}

	}

}
