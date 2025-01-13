package task6program;

public class Account {
	private int balance;
	
	public Account (int balance) {
		this.balance=balance;
	}
	public void withDraw(int amount) {
		if (amount<=balance) {
			balance-=amount;
			System.out.println("Amount Withdrawed Successfully:"+ amount);
		}
		else {
			System.out.println("Insuffience balance");
		}
	}
	public void deposite(int amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Amount deposited:"+ amount);
		}
		else {
			System.out.println("Enter positive amount");
		}
		
	}
	public void checkBalance() {
		System.out.println("Current balance "+balance);
	}

	public static void main(String[] args) {
		//object for the methods created
		Account objAcc=new Account(1500);
		//Withdraw the amount
		objAcc.withDraw(300);
		//Deposite the amount
		objAcc.deposite(200);
		//Checks the current balance
		objAcc.checkBalance();
		
	}

}
