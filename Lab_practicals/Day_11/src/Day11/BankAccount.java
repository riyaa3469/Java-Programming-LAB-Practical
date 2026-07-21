package Day11;

public class BankAccount {
	int accountNo;
    String holderName;
    double balance;

    public void assign(int acc, String name, double initialBal) {
        accountNo = acc;
        holderName = name;
        balance = initialBal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void displayAccount() {
        System.out.println("ACCOUNT SUMMARY");
        System.out.println("Account Number: " + accountNo);
        System.out.println("Holder: " + holderName);
        System.out.printf("Final Balance: Rs. %.2f\n", balance);
}
}