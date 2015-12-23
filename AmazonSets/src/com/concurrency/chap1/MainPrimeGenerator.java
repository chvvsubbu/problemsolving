package com.concurrency.chap1;

public class MainPrimeGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread task= new PrimeGenerator();
		System.out.println("Before start");
		System.out.println(System.currentTimeMillis());
		task.start();
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		task.interrupt();

	}

}
