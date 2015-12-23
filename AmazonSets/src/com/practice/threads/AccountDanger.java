package com.practice.threads;

public class AccountDanger implements Runnable {

	/**
	 * @param args
	 */
	private Account acc= new Account();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDanger r=new AccountDanger();
		Thread one= new Thread(r);
		Thread two= new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();
	}
	
	@Override
	public void run() {

		for(int x=0;x<5;x++){
			makeWithdrawal(10);
			if(acc.getBalance() <0)
				System.out.println("Account is overDrawn");
		}
		
	}
	private synchronized void makeWithdrawal(int amt)  {
		if(acc.getBalance() > amt){
			System.out.println(Thread.currentThread().getName() +" is going to withdraw");
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {}
			acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName() +" completes the withdraw");
		}else{
			System.out.println("Not enough in account for"+Thread.currentThread().getName()+" to withdra" +acc.getBalance());
		}
		
	}

}
