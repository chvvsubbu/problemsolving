package com.lists;

public class StackList {

	public node head,tail;
	public int size;
	
	public void push(Object data){
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
	
	public Object pop(){
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
	public Object getTop(){
		Object data=null;
		//if(head==null)
		if(size==0)
			return data;
		
		return head.data;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1,2,3,4,5,6,7};
		StackList s=new StackList();
		for(int i = 0; i < A.length; i++){
			s.push(new Integer(A[i]));
			}
	    System.out.println(s.toString());
	    System.out.println(s.size);
	    s.pop();
	    
	    System.out.println(s.getTop());
	    System.out.println(s.getTop());
	    s.pop();
	    System.out.println(s.toString());

	}

}
