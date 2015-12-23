package com.lists;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	public BinaryTree bt1;
	
	@Before
	public void setUp() {
		 bt1 = new BinaryTree();
		int [] A = {1,2,3,4,5,6,7,8};
		bt1.constructTree(A);
		
	}

	//@Test
	public void printInorderRecursive() {
		System.out.println("Strint Printing in Inorder=====>");
		bt1.printInorderRecursive(bt1.root);
		System.out.println("\nSize of tree is: "+bt1.getSize());
		System.out.println("\n End Printing in Inorder=====>");
		
		
	}
	
//	@Test
	public void printPosrorderIterate2Stacks() {
		System.out.println(" printPosrorderIterate2Stacks Starts=====>");
		bt1.printPostorderIterativeUse2Stacks(bt1.root);
		System.out.println("\nSize of tree is: "+bt1.getSize());
		System.out.println("  printPosrorderIterate2Stacks Ends=====>");
		
		
	}
	
	//@Test
	public void printLevelOrder() {
		System.out.println(" Printing  printLevelOrder Starts=====>");
		bt1.printLevelOrder(bt1.root);
		System.out.println("\nSize of tree is: "+bt1.getSize());
		System.out.println("\nPrinting  printLevelOrder Ends=====>");
		
		
	}
	
	//@Test
	public void printMaximumValue() {
		System.out.println(" Printing  MaxElement Starts=====>");
		
		System.out.println("\nMax element in tree is: "+bt1.maxValue(bt1.root));
		System.out.println("\nPrinting  MaxElement Ends=====>");
		
		
	}
	
	@Test
	public void searchElementBTRecurssion() {
		System.out.println(" Printing  searchElementBTRecurssion Starts=====>");
		
		System.out.println("\nGiven element present or not: "+bt1.searchElementBTRecurssion(bt1.root,7));
		System.out.println("\nPrinting  searchElementBTRecurssion Ends=====>");
		
		
	}
	

}
