package com.concurrency.chap1;

public class MainMyThreadFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadFactory factory = new MyThreadFactory("MyThreadFactory");
		TaskMyThreadFactory task = new TaskMyThreadFactory();
		Thread thread;
		System.out.printf("Starting the Threads\n");
		for (int i = 0; i < 10; i++) {
			thread = factory.newThread(task);
			thread.start();
		}
		System.out.printf("Factory stats:\n");
		System.out.printf("%s\n",factory.getStats());

	}

}
