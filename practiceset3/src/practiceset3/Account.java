package practiceset3;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Account() {
		this.dateCreated = new Date();
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return this.annualInterestRate/12;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount>this.getBalance()){
			throw new InsufficientFundsException(amount);
		}
		this.setBalance(this.getBalance()-amount);
	}
	
	public void deposit(double amount){
		this.setBalance(this.getBalance()+amount);
	}
}
