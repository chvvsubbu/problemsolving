package com.lists;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	linked_list l;
	
	@Before
	public void setUp() {
		l = new linked_list();
		int [] A = {1,2,3,4,5,6};
		for(int i = 0; i < A.length; i++){
		l.insert(new Integer(A[i]));
		}
	}
	@Test
	public void reverseList() {
		System.out.println(l.toString());
		l.reverseList();
		System.out.println(l.toString());
	}
	

//	@Test
	public void printReverseRecursive() {
		l.printReverseRecursive(l.head);
		System.out.println(l.toString());
	}
}
