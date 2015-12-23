package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		v.add("A");
		v.add(10);
		v.add("A");
		v.add(null);
//		System.out.println(v);
//		System.out.println(v.size());
		Enumeration e= v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}

	}

}
