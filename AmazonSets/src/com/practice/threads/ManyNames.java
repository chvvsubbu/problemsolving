package com.practice.threads;

public class ManyNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRunnable nr=new NameRunnable();
		Thread one =new Thread(nr);
		Thread two =new Thread(nr);
		Thread three =new Thread(nr);
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		//one.start();
		two.start();
		three.start();
		one.run();

	}

}
