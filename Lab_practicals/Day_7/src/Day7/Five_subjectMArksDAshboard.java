package Day7;
import java.util.Scanner;
public class Five_subjectMArksDAshboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] marks=new int[5];
		int i;
		System.out.print("Marks: ");
		for(i=0;i<5;i++) {
			marks[i]=sc.nextInt();
			if(marks[i]<0 || marks[i]>100) {
				System.out.println("Invalid Input!.Please enter numbers between 1-100");
				return;
			}
			
				
			
		}
		int total=0;
		int passed=0;
		for(i=0;i<5;i++) {
			total+=marks[i];
			if(marks[i]>=40) {
				passed++;
			}
		}
		int failed=5-passed;
		double average=(total*100)/500.0;
		System.out.println("MARKS DASHBOARD");
		System.out.println("Total: "+total);
		System.out.printf("Average: %.2f\n",average);
		System.out.println("Passed subjects: "+passed);
		System.out.println("Failed subjects: "+failed);
	}
	}
