package com.concurrency.chap1;

public class PrimeGenerator extends Thread {

	@Override
	public void run() {
		long number = 1L;
		while (true) {
			System.out.println("Inside while");
			if (isPrime(number)) {
				System.out.printf("Number %d is prine", number);
			}
			if (isInterrupted()) {
				System.out.printf("The Prime Generator has been Interrupted");
				System.out.println(System.currentTimeMillis());
				return;
			}
			number++;
		}

	}

	private boolean isPrime(long number) {
		// TODO Auto-generated method stub
		if (number <= 2) {
			return true;
		}
		for (long i = 2; i < number; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
