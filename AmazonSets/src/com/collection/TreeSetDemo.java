package com.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet h = new TreeSet(new Mycomperator());
		/*h.add("A");
		h.add("a");
		h.add("B");
		h.add("Z");
		h.add("L");*/
		//h.add(new Integer(10));
		//h.add(null);
		//h.add("A");
		h.add(10);
		h.add(0);
		h.add(15);
		h.add(20);
		h.add(20);
		System.out.println(h);

	}

}
