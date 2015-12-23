package com.practice.threads;

public class NameThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRunnable nr= new NameRunnable();
		Thread t= new Thread(nr);
		t.setName("Fed");
		t.start();

	}

}
