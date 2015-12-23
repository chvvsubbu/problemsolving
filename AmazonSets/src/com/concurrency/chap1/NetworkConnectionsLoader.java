package com.concurrency.chap1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NetworkConnectionsLoader implements Runnable {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("Beginning NetworkConnectionsLoader loading: %s\n", new Date());
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Ending NetworkConnectionsLoader loading:%s\n", new Date());
		
	}

}
