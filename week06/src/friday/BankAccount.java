package friday;

import java.io.Serializable;
import java.util.ArrayDeque;

public class BankAccount implements Serializable{

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private int age;
	private int uniqueNumber;
	private double balance;
	private double simpleInterest;
	private double complexInterest;
	private static int code = 0;
	private ArrayDeque<Double> history = new ArrayDeque<>();
	
	public BankAccount(){}

	public BankAccount(String firstName, String lastName, int age, double balance, double simpleInterest,
			double complexInterest) {
		init(firstName, lastName, age, balance, simpleInterest, complexInterest);
	}
	
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * this.firstName.hashCode();
		hash = 53 * this.lastName.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(!this.getClass().equals(obj.getClass())){
			return false;
		}
		BankAccount temp = (BankAccount)obj;
		return (temp.getUniqueNumber() == this.getUniqueNumber());
		
	}
	private void init(String firstName, String lastName, int age, double balance, double simpleInterest,
			double complexInterest) {
		if (firstName.matches("\\W") || lastName.matches("\\W")) {
			throw new IllegalArgumentException();
		} else {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		if (age <= 18) {
			throw new IllegalArgumentException();
		} else {
			this.age = age;
		}
		if (balance < 5) {
			throw new IllegalArgumentException();
		} else {
			this.balance = balance;
		}
		this.simpleInterest = simpleInterest;
		this.complexInterest = complexInterest;
		this.uniqueNumber = makeUniqueNumber();
	}

	private int makeUniqueNumber() {
		code++;
		return (int) firstName.charAt(0) + (int) lastName.charAt(0) + age + code;
	}

	public void addMoney(double moneyToAdd) {
		if (moneyToAdd < 0) {
			throw new IllegalArgumentException();
		} else {
			if (history.size() == 5) {
				history.remove();
			}
			this.balance += moneyToAdd;
			this.history.add(moneyToAdd);
		}
	}

	public void withdraw(double withdraw) {
		if (this.complexInterest > 0.01) {
			throw new NotAllowedOperationException();
		}
		if (this.balance == 5) {
			throw new NoMoneyException();
		}
		if (balance - withdraw < 5 || withdraw < 0) {
			throw new IllegalArgumentException();
		} else {
			if (history.size() == 5) {
				history.remove();
			}
			this.balance -= withdraw;
			this.history.add(-withdraw);
		}
	}

	public void transfer(BankAccount otherAccount, double money) {
		if (otherAccount == null) {
			throw new IllegalArgumentException();
		}
		if (this.complexInterest > 0.01) {
			throw new NotAllowedOperationException();
		}
		if (this.balance - money <= 5) {
			throw new NoMoneyException();
		}
		if (money < 0) {
			throw new IllegalArgumentException();
		}
		otherAccount.addMoney(money);
		this.withdraw(money);
		this.history.add(-money);
		otherAccount.history.add(money);
	}

	public void printHistory() {
		for (double item : history) {
			System.out.print(item + " ");
		}
	}

	public int getUniqueNumber() {
		return uniqueNumber;
	}
	public int getAge() {
		return age;
	}
	public double getSimpleInterest() {
		return simpleInterest;
	}
	public double getBalance() {
		return balance;
	}
	public double getComplexInterest() {
		return complexInterest;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
