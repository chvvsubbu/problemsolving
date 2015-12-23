package com.concurrency.chap2;

public class Bank implements Runnable {

	private Account account;

	public Bank(Account acc) {
		account = acc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {

			account.subtractAmount(1000);
		//	System.out.println("In Bank " + i + " balance is"+ account.getBalance());
		}

	}

}
