package com.lists;

public class dllinked_list {
	
	public node head;
	public node tail;
	private int size;
	public void insert(Object data){
		node n=new node(data);
		if(head==null)
			head=tail=n;
		else
		{
			n.next=head;
			head.prev=n;
			head=n;
		}
		size++;
	}

	public void insertAtEnd(Object data){
		insertAfter(tail,data);
	}
	
	public void insertAfter(node after, Object data)
	{
		node n=new node(data);
		if(size==0){
			head=tail=n;
		}
		else
		{  node temp=after.next;
			n.next=temp;
			after.next=n;
			n.prev=after;
			if(temp !=null)
				temp.prev=n;	
		}
		size++;
	}
	
	public Object remove(){
		Object data=null;
		//if(head==null)
		if(size==0)
			return data;
		node temp=head;
		head=head.next;
		if(temp.next == null)
			tail=null;
		size--;
		return temp.data;
	}
	
	public Object removeAfter(node n)
	{
		Object data=null;
		if(n==null || n.next== null)
			return data;
	    node temp=n.next;
	    n.next=temp.next;
	    if(temp.next !=null)
	    	temp.next.prev=n;
	    size --;
	    return temp.data;
		
	}
	
	public node search(Object data) {
		node loop=head;
		for(int i=0;i<size;i++)
		{
			if (loop.data.equals(data)) return loop;
			loop=loop.next;
		}
		
		return loop;
	}
	public String printReverse(){
		if(size==0) return "";
		String s="";
		node temp=this.tail;
		for(int i=0;i<size;i++){
			s=s+temp.data;
			if(i<(size-1)) s=s+"--->";
			temp=temp.prev;
		}
		return s;
	}
	
	public void reverseList()
	{
		if(size<=1) return;
		node prev=null;
		node current=this.head;
		node next;
		while(current!= null)
		{
			next=current.next;
			current.next=prev;
			if(prev!=null) prev.prev=current;
			if(prev==null) tail=current;
			prev=current;
			current=next;
		}
		this.head=prev;
		
	}
	
	public String toString(){
		if(size==0) return null;
		String s="";
		node temp=this.head;
		for(int i=0;i<size;i++){
			s=s+temp.data;
			if(i<(size-1)) s=s+"--->";
			temp=temp.next;
		}
		return s;
	}
	public void printReverseRecursive(node head) {
		if(head== null ) return;
		printReverseRecursive(head.next);
		System.out.println(head.data);
	}
	
	public static void main(String[] args) {
		
		int [] A = {1,2,3,4,5,6,7};
		dllinked_list dl=new dllinked_list();
		Object temp=0;
		for(int i = 0; i < A.length; i++){
			dl.insert(new Integer(A[i]));
		}
		System.out.println(dl.toString());
//		for(int i = 0; i < A.length; i++)
//		{
//			temp=dl.remove();
//			System.out.println(dl);
//		}
//		for(int i = 0; i < A.length; i++){
//			dl.insert(new Integer(A[i]));
//		}
		dl.removeAfter(dl.search(7));
//		System.out.println(dl);
//		//System.out.println(dl.printReverse());
//		dl.reverseList();
//		System.out.println("After reverse:"+dl);
		System.out.println(dl);
		dl.printReverseRecursive(dl.head);
		//System.out.println(dl.printReverse());
		//System.out.println("head is"+dl.head.data+ " tail is "+dl.tail.data);
	}

}
