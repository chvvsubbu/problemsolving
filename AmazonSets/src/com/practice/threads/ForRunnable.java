package com.practice.threads;

public class ForRunnable  implements Runnable{

	/**
	 * @param args
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			System.out.println("Runnable Running");
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
