package com.concurrency.chap2;

public class ProducerNewLock implements Runnable {

	private FileMock mock;
	private Buffer buffer;
	public ProducerNewLock (FileMock mock, Buffer buffer){
		this.mock=mock;
		this.buffer=buffer;
		}
	
	@Override
	public void run() {
	buffer.setPendingLines(true);
	while (mock.hasMoreLines()){
	String line=mock.getLine();
	buffer.insert(line);
	}
	buffer.setPendingLines(false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
