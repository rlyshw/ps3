package practiceset3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAc = new Account(1122,20000);
		myAc.setAnnualInterestRate(4.5);
		try {
			myAc.withdraw(2500);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(
					"Not enough money to withdraw"+e.getAmount());
		}
		myAc.deposit(3000);
		System.out.println("Balance: "+myAc.getBalance()+"\n"+
				"Monthly Interest: "+myAc.getMonthlyInterestRate()+"\n"+
				"Date Created: "+myAc.getDateCreated().toString());
	}

}
