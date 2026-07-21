package Day11;

public class Student {
	int rollno;
	String name;
	int marks;
	int attendance;
	public void assignData(int r,String n,int m,int a) {
		rollno=r;
		name=n;
		marks=m;
		attendance=a;
	}
	public String calculateResult() {
		if(marks>=40) {
			return "PASS";
		}
		else {
			return "FAIL";
		}
	}
	
	public void displayProfile() {
		System.out.println(rollno+" - "+name+" - "+"Marks: "+marks+" - "+"Attendance: "+attendance+"%"+" - "+calculateResult());
	}
}
