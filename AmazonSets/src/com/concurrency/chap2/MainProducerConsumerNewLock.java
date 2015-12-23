package com.concurrency.chap2;

public class MainProducerConsumerNewLock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileMock mock = new FileMock(100, 10);
		Buffer buffer = new Buffer(20);
		ProducerNewLock producer = new ProducerNewLock(mock, buffer);
		Thread threadProducer = new Thread(producer, "Producer");
		ConsumerNewLock consumers[] = new ConsumerNewLock[3];
		Thread threadConsumers[] = new Thread[3];
		for (int i = 0; i < 3; i++) {
			consumers[i] = new ConsumerNewLock(buffer);
			threadConsumers[i] = new Thread(consumers[i], "Consumer " + i);
		}
		threadProducer.start();
		for (int i = 0; i < 3; i++) {
			threadConsumers[i].start();
		}

	}

}
