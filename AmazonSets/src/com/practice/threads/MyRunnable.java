package com.practice.threads;

public class MyRunnable implements Runnable{

	/**
	 * @param args
	 */
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Implements job in MyRunnable");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r= new MyRunnable();
		Thread t= new Thread(r);

	}

}
