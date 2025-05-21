package com.constructor;

public class BankAccount {
	public double currentBalance;
	public String customerName;
	public String address;
	public BankAccount(double balance,String name,String add) {
		currentBalance=balance;
		customerName=name;
		address=add;
		System.out.println();
	}
	public BankAccount() {
		currentBalance=0;
		customerName="NA";
		address="NA";
	}
	public void deposit(double amount) {
		if(amount>0) {
			currentBalance=currentBalance+amount;
			System.out.println("Current Balance: "+currentBalance);
		}
		else {
			System.out.println("Invalid amount. Deposit Failed");
		}
			
	}
	public void withdrawal(double amount) {
		if(amount<0)
			System.out.println("Invalid amount. Withdrawal failed");
		else if(amount>currentBalance)
			System.out.println("Insufficient funds.Withdrawal failed" );
		else
			System.out.println("Deducted the amount");
	}
	public void updateAddress(String newAddress) {
		address=newAddress;
		System.out.println("Address updated successfully : "+newAddress);
	}
	public void updateCustomerName(String newCustomerName) {
		customerName=newCustomerName;
		System.out.println("Customer name updated successfully : "+newCustomerName);
	}
	public static void main(String[] args) {
		BankAccount ba=new BankAccount(25000.0,"Pujitha","Kurnool");
		ba.deposit(-200.0);
		ba.withdrawal(5000.0);
		ba.withdrawal(27000.0);
		ba.updateCustomerName("Paladi Pujitha");
		ba.updateAddress("Hyderabad");
		
	}	
}