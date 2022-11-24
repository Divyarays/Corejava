package OOP;

public class TestAccount {
	public static void main(String[] args) {
		double d = 1442.88;
		Account a = new Account();
		a.setNumber("7697659807");
		a.setAccountType("Saving");
		a.setBalance(d);
		System.out.println(a.getBalance());
		a.deposite(20000);
		System.out.println(a.getBalance());
		a.withdrawal(200);
		System.out.println(a.getBalance());
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		a.paybill(1200);
		System.out.println(a.getBalance());
		a.FundTransection(200);
		System.out.println(a.getBalance()+" Transection Successful");
		

	}
}
