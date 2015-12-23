package com.concurrency.chap1;

import java.io.File;

public class FileSearch implements Runnable {

	private String initPath;
	private String fileName;

	public FileSearch(String initPath, String fileName) {
		this.initPath = initPath;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		File file = new File(initPath);
		if(file.isDirectory()){
			try {
				directoryProcess(file);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void directoryProcess(File file) throws InterruptedException {
		File list[] = file.listFiles();
		if(list != null){
			for(int i=0;i<list.length;i++){
				if(list[i].isDirectory()){
					directoryProcess(list[i]);
				}
				else{
					fileProcess(list[i]);
				}
			}
		}
		if(Thread.interrupted()){
			throw new InterruptedException();
		}
		
		
	}

	private void fileProcess(File file) throws InterruptedException  {
		// TODO Auto-generated method stub
		if (file.getName().equals(fileName)) {
			System.out.printf("%s : %s\n",Thread.currentThread().getName() ,file.getAbsolutePath());
			}
		if (Thread.interrupted()) {
			throw new InterruptedException();
			}
		
	}


}
