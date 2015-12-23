package com.concurrency.chap1;

public class MainTaskMyThreadGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
		TaskMyThreadGroup task = new TaskMyThreadGroup();
		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(threadGroup, task);
			t.start();
		}

	}

}
