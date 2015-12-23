package com.lists;

import java.util.Stack;

public class BinaryTree {

	public node root;
	private int size;
	private static node prev;

	public int getSize() {
		return size;
	}

	public node constructTree(int[] a, int low, int high) {
		if (high < low)
			return null;
		int mid = (high + low) / 2;
		node n = new node(a[mid]);
		size++;
		n.left = constructTree(a, low, mid - 1);
		n.right = constructTree(a, mid + 1, high);
		return n;
	}

	public void constructTree(int[] a) {
		this.root = constructTree(a, 0, a.length - 1);
	}

	private boolean isEmpty() {
		
		if (root != null)
			return true;
		else
			return false;
	}

	public void printInorderRecursive(node root)
	{
		if (root == null)
			return;
		printInorderRecursive(root.left);
		System.out.print("  " + root.data);
		printInorderRecursive(root.right);

	}

	public void printInorderIterative(node root)
	{
		if (root == null)
			return;
		Stack<node> st = new Stack<node>();
		node temp = root;
		while (!st.isEmpty() || temp != null) 
		{
			if (temp != null) {
				st.push(temp);
				temp = temp.left;
				continue;
			}
			temp = st.pop();
			System.out.print(" " + temp.data);
			temp = temp.right;
		}
	}

	public void printPreorderRecursive(node root) {
		if (root == null)
			return;
		System.out.print(" " + root.data);
		printPreorderRecursive(root.left);
		printPreorderRecursive(root.right);

	}

	public void printPreorderIterative(node root) {
		if (root == null)
			return;
		Stack<node> st = new Stack<node>();
		node temp = root;
		while (!st.isEmpty() || temp != null) {
			if (temp != null) {
				System.out.print(" " + temp.data);
				st.push(temp);
				temp = temp.left;
				continue;
			}
			temp = st.pop();
			temp = temp.right;
		}
	}

	public void printPostorderRecursive(node root) {
		if (root == null)
			return;
		printPostorderRecursive(root.left);
		printPostorderRecursive(root.right);
		System.out.print(" " + root.data);

	}
	
	public void printPostorderIterativeUse2Stacks(node root)
	{
		Stack<node> st1 = new Stack<node>();
		Stack<node> st2 = new Stack<node>();
		if(root == null) return;
		node temp;
		st1.push(root);
		while(!st1.isEmpty())
		{
			temp=st1.pop();
			st2.push(temp);
			if(temp.left != null) st1.push(temp.left);
			if(temp.right != null) st1.push(temp.right);
		}
		System.out.println();
		while(!st2.isEmpty())
		{
			System.out.print(" "+st2.pop().data);
			
		}		
	}

	public void printPostorderIterative(node root) {
		if (root == null)
			return;
		node temp = root;
		Stack<node> st = new Stack<node>();
		while (!st.isEmpty() || temp != null) {
			if (temp != null) {
				st.push(temp);
				temp = temp.left;
				continue;
			}
			
			if (st.peek().right == null) {
				temp = st.pop();
				System.out.print(" " + temp.data);
				if (temp == st.peek().right) {
					System.out.print(" " + st.peek().data);
					st.pop();
				}
			} else {
				if (!st.isEmpty())
					temp = st.peek().right;
				else
					temp = null;
			}

		}

	}

	public void printLevelOrder(node root) {
//		Stack<node> st1 = new Stack<node>();
//		Stack<node> st2 = new Stack<node>();
		
		//st1.push(root);
//		node temp;
//		while ((!st1.isEmpty()) || (!st2.isEmpty())) {
//			while (!st1.isEmpty()) {
//				temp = st1.pop();
//				System.out.print(" " + temp.data);
//				if (temp.right != null)
//					st2.push(temp.right);
//				if (temp.left != null)
//					st2.push(temp.left);
//			}
//			System.out.println();
//			while (!st2.isEmpty()) {
//				temp = st2.pop();
//				System.out.print(" " + temp.data);
//				if (temp.left != null)
//					st1.push(temp.left);
//				if (temp.right != null)
//					st1.push(temp.right);
//
//			}
//
//			System.out.println();
//
//		}
		
		QueueUseStack qs= new QueueUseStack();
		qs.enqueue(root);
		node temp;
		while(!qs.isEmpty()){
			temp=qs.dequeue();
			System.out.print(" "+temp.data);
			if(temp.left != null) qs.enqueue(temp.left);
			if(temp.right != null) qs.enqueue(temp.right);
		}

	}

	public void printLevelOrderUsingQueue(node root) {
		QueueUseStack q1 = new QueueUseStack();
		node temp;
		q1.enqueue(root);
		q1.enqueue(new node(9999));
		while (!q1.isEmpty()) {
			temp = q1.dequeue();
			if ((Integer) temp.data != 9999) {
				System.out.print(" " + temp.data);
				if (temp.left != null)
					q1.enqueue(temp.left);
				if (temp.right != null)
					q1.enqueue(temp.right);
			}
			if ((Integer) temp.data == 9999) {
				if (q1.isEmpty())
					return;
				else {
					System.out.println();
					q1.enqueue(new node(9999));
				}

			}

		}

	}

	private static node ddl;

	public void convertInorderDLL(node root) {
		if (root == null)
			return;
		convertInorderDLL(root.left);
		// System.out.print(" " + root.data);
		root.prev = prev;
		if (prev != null) {
			prev.next = root;
		} else
			ddl = root;
		prev = root;
		convertInorderDLL(root.right);

	}

	@SuppressWarnings("unused")
	public static boolean isidenticalTrees(node n1, node n2) {
		if (n1 == null || n2 == null)
			return true;
		if (n1 != null || n2 != null)
			return false;
		if (n1 != null && n2 != null) {
			System.out.println(" n1 data " + n1.data + " n2 data " + n2.data);
			return ((n1.data == n2.data) && isidenticalTrees(n1.left, n2.left) && (isidenticalTrees(
					n1.right, n2.right)));
		}
		return false;

	}

	int maxElement = Integer.MIN_VALUE;

	public int maxValue(node root) {
		if (root == null)
			return maxElement;
		QueueUseStack q1 = new QueueUseStack();
		q1.enqueue(root);
		node temp;
		while (!q1.isEmpty()) {
			temp = q1.dequeue();
			if ((Integer) temp.data > maxElement)
				maxElement = (Integer) temp.data;
			if (temp.left != null)
				q1.enqueue(temp.left);
			if (temp.right != null)
				q1.enqueue(temp.right);
		}

		return maxElement;
	}

	int minElement = Integer.MAX_VALUE;

	public int minValue(node root) {
		if (root == null)
			return minElement;
		QueueUseStack q1 = new QueueUseStack();
		q1.enqueue(root);
		node temp;
		while (!q1.isEmpty()) {
			temp = q1.dequeue();
			if ((Integer) temp.data < minElement)
				minElement = (Integer) temp.data;
			if (temp.left != null)
				q1.enqueue(temp.left);
			if (temp.right != null)
				q1.enqueue(temp.right);
		}
		return minElement;
	}
	
	public boolean searchElementBTRecurssion(node root, int searchValue)
	{
		boolean temp;
		if(root==null ) return false;
		if((Integer)root.data==searchValue) return true;
		temp=searchElementBTRecurssion(root.left,searchValue);
		if (temp == true) return true;
		else return searchElementBTRecurssion(root.right,searchValue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt1 = new BinaryTree();
		BinaryTree bt2 = new BinaryTree();
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// int[] B = { 1, 2, 3, 4, 5, 6, 7, 8 };
		bt1.constructTree(A);
		bt1.printPostorderIterative(bt1.root);
		// bt2.constructTree(B);
		// bt1.printLevelOrderUsingQueue(bt1.root);
		// bt1.printInorderRecursive(bt1.root);
		// bt1.printPostorderRecursive(bt1.root);
		// System.out.println("Max element in tree is: " +
		// bt1.maxValue(bt1.root));
		// System.out.println("Min element in tree is: " +
		// bt1.minValue(bt1.root));
		// bt2.printLevelOrder(bt1.root);

		// boolean check = isidenticalTrees(bt1.root, bt2.root);
		// if (check == true)
		// System.out.println("yes both trees are identical");
		// else {
		// System.out.println("Not identical");
		// }
		// System.out.println("Printing inorer ");
		// bt.printInorder(bt.root);
		// System.out.println("\nPrinting preorder ");
		// bt.printPreorder(bt.root);
		// System.out.println("\nPrinting postorder ");
		// bt.printPostorder(bt.root);
		// System.out.println("\nPrinting Levelorder ");
		// bt.printLevelOrder(bt.root);
		// bt1.convertInorderDLL(bt.root);
		// node p=dd;
		// System.out.println();
		// while(ddl!=null){
		// System.out.print(" "+ddl.data);
		// ddl=ddl.next;
		// }
		Stack<Integer> st= new  Stack<Integer>();
	}

}
