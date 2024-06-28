package com.kodnest.bsi;

import java.util.Scanner;

interface Account{
	void deposit(double amount);
	void withdraw(double amount);
}

class SavingsAccount implements Account{
	 private double balance; 	
	
	public SavingsAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. Balance: " + amount);
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
        if(balance < 0){
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
        else{
            System.out.println("Withdrawal successful. Balance: " + balance);
        }
	}	
}

public class BankingSystemInterface {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1=sc.nextDouble();
        double d2=sc.nextDouble();
        
        sc.close();
        SavingsAccount account = new SavingsAccount(0.0);
        double depositAmount =d1;
        double withdrawalAmount =d2;
        
        
        account.deposit(depositAmount);
        account.withdraw(withdrawalAmount);
    }
}