package com.concurrency.chap1;

public class MainFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadFactory factory = new MyThreadFactory("MyThreadFactory");
		TaskMyThreadFactory task = new TaskMyThreadFactory();
		System.out.printf("Starting the Threads\n");
		Thread thread;
		for (int i = 0; i < 10; i++) {
			thread = factory.newThread(task);
			thread.start();
		}
		System.out.printf("Factory stats:\n");
		System.out.printf("%s\n", factory.getStats());

	}

}
