package com.concurrency.chap1;

public class Calculater implements Runnable {
	
	private int number;
	
	public Calculater (int num){
		number=num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(),number,i,number*i);
			if(Thread.currentThread().getName().equalsIgnoreCase("Thread-8") && i==7){
				System.out.println("Tick Tick");
				System.exit(1);
			}
		}
		
	}

}
