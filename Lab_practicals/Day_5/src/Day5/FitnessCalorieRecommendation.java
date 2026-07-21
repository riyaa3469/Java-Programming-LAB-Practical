package Day5;

import java.util.Scanner;

public class FitnessCalorieRecommendation {

		public static double calculateBMI(double weight,double height) {
			return weight/(height*height);
		}
		public static String getBMICategory(double bmi) {
			if(bmi<=18.5) {
				return "Underweight";
			}
			else if(bmi<=24.9) {
				return "Normal";
			}
			else {
				return "Overweight";
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Weight in kg: ");
			double weight=sc.nextDouble();
			System.out.print("Height in metres: ");
			double height=sc.nextDouble();
			
			double bmi=calculateBMI(weight,height);
			String category=getBMICategory(bmi);
			System.out.println("FITNESS REPORT");
			System.out.printf("BMI: %.2f\n",bmi);
			System.out.println("Category: "+category);
			System.out.println("Recommendation: Maintain regular exercise and balanced diet.");
		}
	}


