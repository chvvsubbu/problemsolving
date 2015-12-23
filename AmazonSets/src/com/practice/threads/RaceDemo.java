package com.practice.threads;

public class RaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racer racer= new Racer();
//		Thread s1 = new Thread(racer, "s1");
//		Thread s2 = new Thread(racer, "s2");
//		Thread s3 = new Thread(racer, "s3");
//		Thread s4 = new Thread(racer, "s4");
//		Thread s5 = new Thread(racer, "s5");
		Thread tortoiseThread = new Thread(racer, "Tortoise");
		Thread hareThread = new Thread(racer, "Hare");
		tortoiseThread.start();
		hareThread.start();
//        s1.start();
//        s2.start();
//        s3.start();
//        s4.start();
//        s5.start();
	}

}
