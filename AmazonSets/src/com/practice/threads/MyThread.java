package com.practice.threads;

public class MyThread extends Thread  {

	public void run(){
		System.out.println("Job running in MyThread");
	}
	public void run(String s){
		System.out.println("String in run is "+s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t2= new MyThread();
		//t2.run();
		t2.run("Fuck");
		t2.start();

	}

}
