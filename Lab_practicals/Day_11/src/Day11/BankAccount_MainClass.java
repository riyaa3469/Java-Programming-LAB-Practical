package Day11;

public class BankAccount_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
        account.assign(1001, "Riya", 5000);
        account.deposit(1500);
        account.withdraw(2000);
        account.displayAccount();
	}

}
