package Day11;

public class Student_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("STUDENT PROFILE");
		Student s1=new Student();
		s1.assignData(101,"Amit",72,85);
		Student s2=new Student();
		s2.assignData(102,"Neha",35,90);
		s1.displayProfile();
		s2.displayProfile();
	}

}
