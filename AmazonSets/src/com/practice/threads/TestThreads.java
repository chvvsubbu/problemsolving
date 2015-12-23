package com.practice.threads;

public class TestThreads {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyRunnable r= new MyRunnable();
//		Thread  foo= new Thread(r);
//		Thread  bar= new Thread(r);
//		Thread  bat= new Thread(r);
		ForRunnable r= new ForRunnable();
		Thread  t= new Thread(r);
		t.start();

	}

}
