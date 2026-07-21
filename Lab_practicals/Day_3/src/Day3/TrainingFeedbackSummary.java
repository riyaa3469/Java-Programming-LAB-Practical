package Day3;

import java.util.Scanner;

public class TrainingFeedbackSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name:");
		String name=sc.nextLine();
		
		System.out.println("Content rating:");
		int contentRating=sc.nextInt();
		
		System.out.println("Explanation rating:");
		int ExplanationRating=sc.nextInt();
		
		System.out.println("Practical rating:");
		int PracticalRating=sc.nextInt();
		
		int total=contentRating+ExplanationRating+PracticalRating;
		double average=(double)total/3;
		System.out.println("TRAINING FEEDBACK");
		
		System.out.println("Content rating: "+contentRating+"/5");
		System.out.println("Explanation rating: "+ExplanationRating+"/5");
		System.out.println("Practical rating: "+PracticalRating+"/5");
		
		System.out.printf("Average Rating: %.2f/5%n", average);

	}

}
