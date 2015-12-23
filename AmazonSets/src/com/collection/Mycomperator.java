package com.collection;

import java.util.Comparator;

public class Mycomperator implements Comparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int t1,t2;
		t1= (Integer)o1;
		t2= (Integer)o2;
		if(t1 >t2) return -1;
		else if(t1< t2) return 1;
		else return 0;
	}

}
