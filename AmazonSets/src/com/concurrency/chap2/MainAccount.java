package com.concurrency.chap2;

public class MainAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setBalance(1000);

		Company company = new Company(account);
		Thread companyThread = new Thread(company);

		Bank bank = new Bank(account);
		Thread bankThread = new Thread(bank);

		System.out.printf("Account : Initial Balance: %f\n",account.getBalance());
		
		bankThread.start();
		companyThread.start();
		
		try {
			companyThread.join();
			bankThread.join();
			System.out.printf("Account : Final Balance: %f\n",account.getBalance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("after join");
		
		//System.out.printf("Account : Final Balance: %f\n",account.getBalance());

	}
}
