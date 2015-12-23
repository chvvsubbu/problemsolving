package com.concurrency.chap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;

public class MainCaluclater {

	private static void writeThreadInfo(PrintWriter pw, Thread thread, State state) {
		pw.printf("Main : Id %d - %s\n",thread.getId(),thread.getName());
		pw.printf("Main : Priority: %d\n",thread.getPriority());
		pw.printf("Main : Old State: %s\n",state);
		pw.printf("Main : New State: %s\n",thread.getState());
		pw.printf("Main : ************************************\n");
		System.out.println("writeThreadInfo");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] threads = new Thread[10];
		Thread.State[] status = new Thread.State[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new Calculater(i));
			if (i % 2 == 0) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			} else {
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}
			threads[i].setName("Thread " + i);
		}
		File file = new File(".\\log.txt");
		 FileWriter fw=null;
		 PrintWriter pw = null;
		 try {
		 fw = new FileWriter(file);
		 pw = new PrintWriter(fw);
		 } catch (IOException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }	

		for (int i = 0; i < 10; i++) {
			pw.println("Main : Status of Thread " + i + " : "+ threads[i].getState());
			status[i] = threads[i].getState();
		}
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		// Until the ten threads ends
		boolean finish = false;
		while (!finish) {
			for (int i = 0; i < 10; i++) {
				if (status[i] != threads[i].getState()) {
					writeThreadInfo(pw, threads[i], status[i]);
					status[i] = threads[i].getState();
				}
			}
			finish = true;
			for (int i = 0; i < 10; i++) {
				finish = finish && (threads[i].getState() == State.TERMINATED);
			}
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.close();
	}
}
