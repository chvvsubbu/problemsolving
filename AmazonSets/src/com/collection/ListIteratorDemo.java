package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l= new LinkedList<>();
		l.add("Balakrishna");
		l.add("Venky");
		l.add("Chiru");
		l.add("Nag");
		System.out.println(l);
		ListIterator ltr= l.listIterator();
		while(ltr.hasNext()){
			String s= (String) ltr.next();
			if(s.equals("Venky")){
				ltr.remove();
			}else if(s.equals("Nag")){
				ltr.add("Chaitu");
			}else if(s.equals("Chiru")){
				ltr.set("Charan");
			}
		}
		System.out.println(l);

	}

}
