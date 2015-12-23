package com.concurrency.chap1;

public class CaluclaterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++){
			Calculater calculator=new Calculater(i);
			Thread thread=new Thread(calculator);
			thread.start();
			}

	}

}
