package com.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Vector;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "M");
		l.add("N");
		System.out.println(l);
		System.out.println(l instanceof Cloneable);
		Vector v= new Vector();
		v.add("A");
		v.add(10);
		v.add("A");
		v.add(null);
		System.out.println(v);
		
		
		

	}

}
