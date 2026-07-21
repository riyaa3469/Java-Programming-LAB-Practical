package Day4;

import java.util.Scanner;

public class DigitalWalletMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.print("Initial balance: Rs. ");
		double wallet_balance=sc.nextInt();
		
		System.out.println("DIGITAL WALLET");
		int choice;
		do {
			System.out.println("1.Add money");
			System.out.println("2.Make payment");
			System.out.println("3.View Balance");
			System.out.println("4.Exit");
			System.out.print("Choice:");
			choice=sc.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("Amount: ");
				int deposit=sc.nextInt();
				if(deposit<=0) {
					System.out.println("Invalid amount!.Amount should be positive");
				}
				else {
					
					wallet_balance+=deposit;
					System.out.println("Money added successfully");
					System.out.println("Current Balance: Rs. "+wallet_balance);
					
					
				}
				break;
			case 2:
				System.out.println("payment:");
				int payment = sc.nextInt();

                
                if (payment <= 0) {
                    System.out.println("Invalid amount! Payment must be positive.");
                } else if (payment > wallet_balance) {
                    System.out.println("Transaction failed! Insufficient balance.");
                } else {
                	wallet_balance -= payment;
                    System.out.println("Payment completed.");
                    System.out.printf("Current Balance: Rs. %.2f\n", wallet_balance);
                }
                break;

            case 3:
                System.out.printf("Current Balance: Rs. %.2f\n", wallet_balance);
                break;

            case 4:
                System.out.println("Thank you.");
                break;

            default:
                System.out.println("Invalid choice!.Select an option between 1 and 4.");
        }

    } while (choice != 4);

	}

}
