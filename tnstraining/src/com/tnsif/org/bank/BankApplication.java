package com.tnsif.org.bank;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank=new Bankimplementation();
		Account account=new Account(3425,"Durga",4000,bank);
		bank.deposite(account,6000);
		bank.withdraw(account, 3000);
		System.out.println(account);
	}

}
