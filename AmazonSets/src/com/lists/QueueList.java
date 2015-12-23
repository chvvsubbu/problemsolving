package com.lists;

public class QueueList {

	public node head,tail;
	public int size;
	
	public void enque(Object data){
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
	public Object deque(){
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1,2,3,4,5,6,7};
		QueueList q= new QueueList();

	}

}
