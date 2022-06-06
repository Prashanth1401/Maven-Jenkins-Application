package com.jenkins.banking;

public class BankingOperations {
	private double balance=10000;
	
	public void withDraw(double amout) {
		 this.balance = this.balance - amout; 
	}
	
  //dev-bug-12
	public void displayBalance() {
		System.out.println("current balance is::"+balance);
  }
  
	//Bug-11
	public void deposite(double amount) {
		this.balance = this.balance + amount;
	}

}
