package com.practice.threads;

public class NameRunnable implements Runnable {

	/**
	 * @param args
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int x = 1; x <= 100; x++) {
			//System.out.println("Run by :"+Thread.currentThread().getName()+ " ,X is "+x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
