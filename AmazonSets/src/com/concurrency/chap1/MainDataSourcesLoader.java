package com.concurrency.chap1;

import java.util.Date;

public class MainDataSourcesLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSourcesLoader dsLoader = new DataSourcesLoader();
		Thread thread1 = new Thread(dsLoader, "DataSourceThread");
		NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
		Thread thread2 = new Thread(ncLoader,"NetworkConnectionLoader");
		thread1.start();
		thread2.start();

//		try {
//			thread1.join();
//			thread2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.printf("Main: Configuration has been Ended:%s\n",new Date());

	}

}
