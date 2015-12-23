package com.concurrency.chap1;

public class CaluclaterThread extends Thread {

private int number;
	
	public CaluclaterThread (int num){
		number=num;
	}
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(),number,i,number*i);
		}
	}
}
