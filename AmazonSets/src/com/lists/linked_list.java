package com.lists;

public class linked_list {

	public node head;
	public node tail;
	private int size;
	
	public void insert(Object data){
		node n=new node(data);
		n.next=head;
		head=n;
		if(tail==null)
			tail=n;
		size++;
		
	}
	public void insertAtEnd(Object data){
		insertAfter(tail,data);
		
	}
	public void insertAfter(node after, Object data) {
		// TODO Auto-generated method stub
		node n=new node(data);
		if(size==0){
			head=tail=n;
		}
		else{
			n.next=after.next;
			after.next=n;
			if(after==tail)
				tail=n;	
		}
		size++;
	}
	public Object remove(){
		Object data=null;
		if(head==null)
			return data;
		else{
			if(size==1){
				data=head.data;
				head=tail=null;
				size--;
				return data;
			}else{
				data=head.data;
				head=head.next;
				size--;
				return data;
			}
		}
		
	}
	public Object removeAfter(node n)
	{
		Object data=null;
		if(n==null || n.next==null) return data;
		data=n.next.data;
		n.next=n.next.next;
		size--;
		return data;
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
	
	public void reverseList(){
		if(size<=1) return;
		node prev=null;
		node current=this.head;
		node next;
		while(current!= null)
		{
			next=current.next;
			current.next=prev;
			if(prev==null) tail=current;
			prev=current;
			current=next;
		}
		this.head=prev;
	}
	public void printReverseRecursive(node head) {
		if(head== null ) return;
		printReverseRecursive(head.next);
		System.out.print("   "+head.data);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1,2,3,4,5,6};
		linked_list l = new linked_list();
		
		for(int i = 0; i < A.length; i++){
		l.insert(new Integer(A[i]));
		}
		System.out.println(l.toString());
		//System.out.println(l.nthnode(1).data);
		//System.out.println(l.middleNode().data);
		//System.out.println("nthnodefromEnd"+l.nthnodefromEnd(6).data);
		//l.deletelist(l.head);
		l.printReverseRecursive(l.head);
		
//	for(int i = 0; i < A.length; i++){
//		l.remove();
//		System.out.println(l);
//		}
//		l = new linked_list();
//		for(int i = 0; i < A.length; i++){
//		l.insertAtEnd(new Integer(A[i]));
//		}
//		System.out.println(l);
//		l.removeAfter(l.search(3));
//		System.out.println(l);
//		l.removeAfter(l.search(1));
//		System.out.println(l);
//		l.reverseList();
//		l.printReverseRecursive(l.head);
//		System.out.println(l.toString());
//		System.out.println("head is"+l.head.data+ " tail is "+l.tail.data);

	}
	public node middleNode() {
		if(head == null ) return null;
		if(head.next == null) return head;
		node slow,fast;
		slow=head; fast=head.next;
		while(fast!= null && fast.next != null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	private node nthnode(int index) {
		if(size <index || index<0) return null;
		node temp=head;
		for(int i=1;i<index; temp=temp.next,i ++);
		return temp;
	}
}
