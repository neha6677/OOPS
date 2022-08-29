package corejava;

class Customer {
	int CustId, accountno;
	String custname, cust_address, cust_dob, cust_account_opening_date, Branch_Obj;

	Customer(){
		
	}
	public Customer(int CustId, int accountno, String custname) {
		this.accountno = accountno;
		this.custname = custname;
		this.CustId = CustId;
	}

}

class Branch extends Customer {
	int branch_id;
	String branch_name, branch_address;
	
	Branch() {
		
	}
	
	public Branch(int branch_id, String branch_name, String branch_address) {
		this.branch_address=branch_address;
		this.branch_id=branch_id;
		this.branch_name=branch_name;
		
	}
}

class Customer_Account_Statement extends Branch {
	int depositAmount, CustId;
	double amount, deposit_withdrawl;
	String deposit_date;

	public Customer_Account_Statement(int depositAmount, int CustId, double amount, double deposit_withdrawl,
			String deposit_date) {
		this.amount = amount;
		this.depositAmount = depositAmount;
		this.CustId = CustId;
		this.deposit_date = deposit_date;
		this.deposit_withdrawl = deposit_withdrawl;
	}

	// display current balance in account
	public static void displayBalance(double amount) {
		System.out.println("Current Balance : " + amount);
		System.out.println();
	}

	//withdrawing and update the balance
	public static double amountWithdrawing(double amount, int deposit_withdrawl) {
		System.out.println("Withdrawl Operation:");
		System.out.println("Withdrawing Amount : " + deposit_withdrawl);
		if (amount >= deposit_withdrawl) {
			amount = amount - deposit_withdrawl;
			System.out.println("Please collect your money and collect the card");
			displayBalance(amount);
		} else {
			System.out.println("Sorry! Insufficient Funds");
			System.out.println();
		}
		return amount;
	}
	
	// Deposit amount and update the balance
		public static double amountDepositing(double amount, double depositAmount) {
			System.out.println("Deposit Operation:");
			System.out.println("Depositing Amount : " + depositAmount);
			amount = amount + depositAmount;
			System.out.println("Your Money has been successfully deposited");
			displayBalance(amount);
			return amount;
		}
}

public class BankStatement{

	
	public static void main(String[] args) {

		int amount = 8000;
		int withdrawAmount = 4000;
		int depositAmount = 2000;

		
		// withdrawing amount
		//amount = (int) amountWithdrawing(amount, withdrawAmount);
		// depositing amount
		//amount = (int) amountDepositing(amount, depositAmount);
		
		// calling display balance
				//displayBalance(amount);
		
		//Customer c1 = new Customer(withdrawAmount, depositAmount, null);
		
		//Branch b1 = new Branch(depositAmount, null, null);
		
		Customer_Account_Statement cas = new 
				Customer_Account_Statement
				(depositAmount, amount, withdrawAmount, depositAmount, null);
		
		cas.displayBalance(depositAmount);
		cas.amountDepositing(withdrawAmount, depositAmount);
		cas.amountWithdrawing(withdrawAmount, depositAmount);
		

	}

}
