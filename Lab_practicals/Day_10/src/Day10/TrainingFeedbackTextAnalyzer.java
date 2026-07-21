package Day10;

import java.util.Scanner;

public class TrainingFeedbackTextAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
        
        System.out.print("Feedback: ");
        String feedback=sc.nextLine().toLowerCase();

        int vowels=0, consonants=0, digits=0, spaces=0, symbols=0;

        for (int i=0; i<feedback.length();i++) {
            char ch = feedback.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowels++;
            } else if (ch>='a' && ch<='z') {
                consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                symbols++;
            }
        }

        System.out.println("TEXT ANALYSIS");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other Symbols: " + symbols);
	}

}
