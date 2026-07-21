package Day1;

public class SystemInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SYSTEM INFORMATION");
		System.out.println("Java Version:"+System.getProperty("java.version"));
		System.out.println("Operating System:"+System.getProperty("os.name"));
		System.out.println("User Name:"+System.getProperty("user.name"));
		System.out.println("Architecture:"+System.getProperty("os.arch"));
		System.out.println("Working Directory:"+System.getProperty("user.dir"));
	}

}
