package com.practice.threads;

public class Account {

	private int balance=50;
	public int getBalance()
	{
		return balance;
	}
	public void withdraw(int amount){
		balance = balance-amount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
