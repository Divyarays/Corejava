package OOP;

public class Account {
	private String number;
	private String AccountType;
	private double Balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public void deposite(int i) {
		setBalance(getBalance() + i);
	}

	public void withdrawal(int j) {
		setBalance(getBalance() - j);
	}
	public void paybill(int k) {
		setBalance(getBalance()-k);
	}
	public void FundTransection(int l) {
		setBalance(getBalance()-l);
	}

}
