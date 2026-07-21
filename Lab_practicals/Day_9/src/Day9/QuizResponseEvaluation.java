package Day9;
import java.util.Scanner;
public class QuizResponseEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);
		        char[] answerKey = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B'};
		        char[] studentResponses = new char[10];

		        System.out.print("Student responses:");
		        for (int i = 0; i < 10; i++) {
		
		            studentResponses[i] = scanner.next().toUpperCase().charAt(0);
		        }
		        System.out.println("Use X for unattempted.");

		        int correct = 0;
		        int incorrect = 0;
		        int unattempted = 0;

		        for (int i = 0; i < 10; i++) {
		            if (studentResponses[i] == 'X') {
		                unattempted++;
		            } else if (studentResponses[i] == answerKey[i]) {
		                correct++;
		            } else {
		                incorrect++;
		            }
		        }

		        System.out.println("QUIZ RESULT");
		        System.out.println("Correct Answers: " + correct);
		        System.out.println("Incorrect Answers: " + incorrect);
		        System.out.println("Unattempted: " + unattempted);
		    }
	
	}


