package com.concurrency.chap1;

import java.util.concurrent.TimeUnit;

public class MainFileSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSearch searcher=new FileSearch("C:\\","autoexec.bat");
		Thread thread=new Thread(searcher);
		thread.start();
		try {
			TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			thread.interrupt();
		

	}

}
