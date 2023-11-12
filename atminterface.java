import java.util.Scanner;

		class Account {
		    private double balance;

		    public Account(double initialBalance) {
		        this.balance = initialBalance;
		    }

		    public double getBalance() {
		        return balance;
		    }

		    public void deposit(double amt) {
		        if (amt > 0) {
		            balance += amt;
		            System.out.println("Deposit successful. New balance: " + balance);
		        } else {
		            System.out.println("Invalid amount for deposit.");
		        }
		    }

		    public void withdraw(double amt) {
		        if (amt > 0 && amt <= balance) {
		            balance=balance- amt;
		            System.out.println("Withdrawal successful. New balance: " + balance);
		        } else {
		            System.out.println("Insufficient Balance / Invalid amount for withdrawal");
		        }
		    }
		}

		class ATM {
		    private Account acc;
		    private Scanner scanner;

		    public ATM(Account acc) {
		        this.acc = acc;
		        this.scanner = new Scanner(System.in);
		    }

		    public void showMenu() {
		    	
		        
		        System.out.println("1. Check the Balance");
		        System.out.println("2. Deposit the amount");
		        System.out.println("3. Withdraw money");
		        System.out.println("4. Exit");
		        System.out.println("**********");
		    }

		    public void run() {
		        int choice;
		        do {
		            showMenu();
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();
		            switch (choice) {
		                case 1:
		                    checkBalance();
		                    break;
		                case 2:
		                    deposit();
		                    break;
		                case 3:
		                    withdraw();
		                    break;
		                case 4:
		                    System.out.println("**********Thankyou for using the ATM**********");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please select a valid option.");
		            }
		        } while (choice != 4);
		    }

		    private void checkBalance() {
		        System.out.println("Your current balance is: " + acc.getBalance());
		    }

		    private void deposit() {
		        System.out.print("Enter the amount to deposit: ");
		        double amt = scanner.nextDouble();
		        acc.deposit(amt);
		    }

		    private void withdraw() {
		        System.out.print("Enter the amount to withdraw: ");
		        double amt = scanner.nextDouble();
		        acc.withdraw(amt);
		    }
		}

		public class atminterface {

			public static void main(String[] args) 
{
				System.out.println("**********Welcome to the ATM**********");
				Scanner k =new Scanner (System.in);
				 System.out.print("Enter your  PIN: ");
			        int Entered_Pin = k.nextInt();
			
		        Account user_Account = new Account(10000.0); // Initial balance
		        ATM atmpin = new ATM(user_Account);
		        atmpin.run();
		    }
		
		}