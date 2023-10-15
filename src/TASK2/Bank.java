package TASK2;
import java.util.Scanner;

public class Bank {
		String userName;
		String password;
		int balance = 100000;
		int transactions = 0;
		String transactionHistory = "";
	
		public void register() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter The Username:");
			userName = sc.nextLine();
			System.out.print("Enter The Password:");
			password = sc.nextLine();
			System.out.println("Registration Done....");
		}
		
		public boolean login() {
			boolean isLogin = false;
			Scanner sc = new Scanner(System.in);
			while ( !isLogin ) {
				System.out.print("Enter Your Username:");
				String Username = sc.nextLine();
				if ( Username.equals(userName) ) {
					while ( !isLogin ) {
						System.out.print("Enter Your Password:");
						String Password = sc.nextLine();
						if ( Password.equals(password) ) {
							System.out.println("Login Sucessfullyy....");
							System.out.println("\n-----------OPERATIONS---------");
							isLogin = true;
						}
						else {
							System.out.println("Incorrect Password");
						}
					}
				}
				else {
					System.out.println("Sorry Not found");
				}
			}
			return isLogin;
		}
		
		public void withdraw() {
			
			System.out.print("Enter amount for withdraw:");
			Scanner sc = new Scanner(System.in);
			int amount = sc.nextInt();
			try {
				
				if ( balance >= amount ) {
					transactions++;
					balance -= amount;
					System.out.println("\nWithdraw Successfully");
					String str = amount + ":Withdrawed\n";
					transactionHistory = transactionHistory.concat(str);
					
				}
				else {
					System.out.println("\nInsufficient Balance");
				}
				
			}
			catch ( Exception e) {
			}
		}
		
		public void deposit() {
			
			System.out.print("\nEnter amount to deposit:");
			Scanner sc = new Scanner(System.in);
			int amount = sc.nextInt();
			
			try {
				if ( amount <= 100000 ) {
					transactions++;
					balance += amount;
					System.out.println("\nSuccessfully Deposit...");
					String str = amount + ":deposited\n";
					transactionHistory = transactionHistory.concat(str);
				}
				else {
					System.out.println("\nLimit is 100000");
				}
				
			}
			catch ( Exception e) {
			}
		}
		
		public void transfer() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter Receipent's Name - ");
			String receipent = sc.nextLine();
			System.out.print("\nEnter amount to transfer - ");
			int amount = sc.nextInt();
			
			try {
				if ( balance >= amount ) {
					if ( amount <= 50000 ) {
						transactions++;
						balance -= amount;
						System.out.println("\nSuccessfully Transfer to " + receipent);
						String str = amount + ":transfered to " + receipent + "\n";
						transactionHistory = transactionHistory.concat(str);
					}
					else {
						System.out.println("\nLimit is 50000");
					}
				}
				else {
					System.out.println("\nInsufficient Balance");
				}
			}
			catch ( Exception e) {
			}
		}
		
		public void checkBalance() {
			System.out.println("\n" + balance + " Rs");
		}
		
		public void transHistory() {
			if ( transactions == 0 ) {
				System.out.println("\nEmpty");
			}
			else {
				System.out.println("\n" + transactionHistory);
			}
		}

}
