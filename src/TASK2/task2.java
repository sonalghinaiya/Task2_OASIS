//TASK2:ATM
//SONAL GHINAIYA
package TASK2;
import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		
		System.out.println("\n-----WELCOME TO ATM SYSTEM-----\n");
		System.out.println("1.Register \n2.Exit");
		System.out.println("-----------REGISTER------------");
		System.out.print("Enter Your Choice:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		if ( choice == 1 ) 
		{
			Bank b = new Bank();
			b.register();
			
			while(true) 
			{
				System.out.println("\n-------------LOGIN--------------");
				System.out.println("1.Login \n2.Exit");
				System.out.print("Enter Your Choice:");
				int ch =sc.nextInt();
				if ( ch == 1 ) 
				{
					if (b.login())
					{
						boolean isFinished = false;
						while (!isFinished) {
							System.out.println("\n1.Withdraw \n2.Deposit \n3.Transfer \n4.Check Balance \n5.Transaction History \n6.Exit");
							System.out.print("\nEnter Your Choice:");
							int c =sc.nextInt();
							switch(c) 
							{
								case 1:
									b.withdraw();
									break;
									
								case 2:
									b.deposit();
									break;
									
								case 3:
									b.transfer();
									break;
									
								case 4:
									b.checkBalance();
									break;
									
								case 5:
									b.transHistory();
									break;
									
								case 6:
									isFinished = true;
									break;
								
								default:
									System.out.print("Please Enter Valid Choice...");
							}
						}
					}
			}
				else if(choice!=1 || choice!=2)
				{
					System.out.print("Please Enter Valid Choice...\n");
				}
				
				else {
					System.exit(0);
				}
				
				
			}
		}
		else if(choice!=1 || choice!=2)
		{
			System.out.print("Please Enter Valid Choice....");
		}

		else {
			System.exit(0);
		}
				
		
		
	}
}