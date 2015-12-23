package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		for(int i=0;i<=10;i++){
			al.add(i);
		}
		System.out.println(al);
		Iterator itr= al.iterator();
		while(itr.hasNext()){
			Integer it= (Integer) itr.next();
			if(it%2==0)
				System.out.println(it);
				else
					itr.remove();
		}
			System.out.println(al);
						

	}

}
