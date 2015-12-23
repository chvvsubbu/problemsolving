package com.concurrency.chap1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=10;i++){
//			Caluclater calc = new Caluclater(i);
//			Thread t= new Thread(calc);
//			t.start();
//		}
		
		for(int i=1;i<=10;i++){
			CaluclaterThread calc = new CaluclaterThread(i);
			calc.start();
			
		}

	}

}
