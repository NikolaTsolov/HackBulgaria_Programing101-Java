package friday;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class Bank {

	private static HashSet<BankAccount> allBankAccaounts;

	public static void makeTransfer(int senderUniqueNumber, int recieverUniquqNumber, double moneyToTransfer) {
		BankAccount sender = new BankAccount();
		BankAccount receiver = new BankAccount();
		for (BankAccount item : allBankAccaounts) {
			if (item.getUniqueNumber() == senderUniqueNumber) {
				sender = item;
			}
			if (item.getUniqueNumber() == recieverUniquqNumber) {
				receiver = item;
			}
		}
		if (sender == null || receiver == null) {
			throw new NotExistingBankAccountException("Not existing bank account !!! ");
		}
		sender.transfer(receiver, moneyToTransfer);
	}

	public static double calculateAmount(int bankAccountNumber, int numberOfMounts) {
		double curentAccountBalance = 0.0;
		double curentAccountSimpleInterest = 0.0;
		double curentAccountComplexInteres = 0.0;
		int yearsCounter = 0;
		double result = 0.0;
		for (BankAccount item : allBankAccaounts) {
			if (item.getUniqueNumber() == bankAccountNumber) {
				curentAccountBalance = item.getBalance();
				curentAccountSimpleInterest = item.getSimpleInterest();
				curentAccountComplexInteres = item.getComplexInterest();
			}
		}
		if (curentAccountBalance == 0.0) {
			throw new NotExistingBankAccountException("Not existing account");
		}
		if (numberOfMounts < 12) {
			result = curentAccountBalance * curentAccountSimpleInterest * numberOfMounts;
		}
		if (numberOfMounts > 12) {
			if (numberOfMounts % 12 == 0) {
				result = curentAccountBalance * curentAccountComplexInteres * (numberOfMounts / 12);
			} else {
				while (numberOfMounts - 12 > 12) {
					numberOfMounts -= 12;
					yearsCounter++;
				}
				result = ((curentAccountBalance * curentAccountComplexInteres) * yearsCounter)
						+ (curentAccountBalance * curentAccountSimpleInterest * numberOfMounts);
			}
		}

		return result;
	}

	public static void writeToFile(BankAccount objectToWrite) {

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("/home/ivan/javaHackBulgaria/Week06/bankAccounts/bankAccounts.txt", true))) {
			oos.writeObject(objectToWrite);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFromFile() throws ClassNotFoundException {

		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("/home/ivan/javaHackBulgaria/Week06/bankAccounts/bankAccounts.txt"))) {
			BankAccount obj = (BankAccount) ois.readObject();
			System.out.println(obj.getFirstName());
			System.out.println(obj.getLastName());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
