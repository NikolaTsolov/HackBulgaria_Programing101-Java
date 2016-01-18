package friday;

import java.util.Scanner;

import friday.Bank;

import friday.BankAccount;

public class CommandLineInterface {
	private static BankAccount account;

	public static void createBankAccount(String firstName, String lastName, int age, double balance,
			double simpleInterest, double complexInterest) {
		account = new BankAccount(firstName, lastName, age, balance, simpleInterest, complexInterest);
	}

	public static void showHistory() {
		account.printHistory();
	}

	public static void main(String[] args) {
		String command = "";
		Scanner sc = new Scanner(System.in);
		while (!command.equals("exit")) {
			System.out.println("Enter command: ");
			command = sc.nextLine();
			if (command.equals("create_bank_account")) {
				System.out.println("Enter valid first name: ");
				String name = sc.nextLine();
				System.out.println("Enter valid last name: ");
				String lastName = sc.nextLine();
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				System.out.println("Enter your initial balance: ");
				int initBalance = sc.nextInt();
				System.out.println("Enter the initial simple interest: ");
				double initialSimpleInterest = sc.nextDouble();
				System.out.println("Enter the initial Complex interest");
				double initialComplexInterest = sc.nextDouble();
				createBankAccount(name, lastName, age, initBalance, initialSimpleInterest, initialComplexInterest);
				System.out.println("Welcome.Your account was successfully made.");
			}
			if (command.equals("show_history")) {
				showHistory();
			}
			if (command.equals("add_money")) {
				System.out.println("How much money do you want to add to your bank account ?");
				System.out.println("Amount: ");
				double moneyToAdd = sc.nextDouble();
				account.addMoney(moneyToAdd);
			}
			if (command.equals("withdraw_money")) {
				System.out.println("How much money do you want to withdraw from your bank account ?");
				System.out.println("Amount: ");
				double mouneyToWithdraw = sc.nextDouble();
				account.withdraw(mouneyToWithdraw);
			}
			if (command.equals("transfer_money")) {
				System.out.println("Enter the unique number of the sender bank account:");
				System.out.println("Sender: ");
				int senderUniqueNumber = sc.nextInt();
				System.out.println("Amount of money to transfer: ");
				double moneyToSend = sc.nextDouble();
				System.out.println("Enter the unique number of the receiver bank account:");
				System.out.println("Reciever: ");
				int recieverUniqueNumber = sc.nextInt();
				Bank.makeTransfer(senderUniqueNumber, recieverUniqueNumber, moneyToSend);

			}
			if (command.equals("calculate_amount")) {
				System.out.println("Enter bank account's number: ");
				int bankAccountNumber = sc.nextInt();
				System.out.println("Number of mounts: ");
				int numberOfMounts = sc.nextInt();
				System.out.println("Amount of money after " + numberOfMounts);
				System.out.println(Bank.calculateAmount(bankAccountNumber, numberOfMounts));
			}
			if(command.equals("show_accounts")){
				
				try{
					Bank.readFromFile();
				}catch(ClassNotFoundException e){
					e.printStackTrace();
				}
			}
		}
		Bank.writeToFile(account);
		sc.close();
	}

}
