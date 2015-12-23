package com.lists;

import java.util.Stack;

public class QueueUseStack {

	Stack<node > s1;
	Stack<node > s2;
	int lastOperation;
	public QueueUseStack(){
		s1= new Stack<node>();
		s2=new Stack<node>();
		lastOperation=0;
		
	}
	public void enqueue(node T){
		if(lastOperation ==0 ){
			s1.push(T);
		}
		else{
			node temp;
			while(!s2.isEmpty()){
				temp=s2.pop();
				s1.push(temp);
				
			}
			s1.push(T);
			lastOperation=0;
		}
	}
	public node dequeue(){
		node temp=null;
		if(lastOperation==1){
			if(! s2.isEmpty()){
				return s2.pop();
			}else{
				return temp;
			}
		}else{
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			lastOperation=1;
			if(! s2.isEmpty()){
				return s2.pop();
			}else{
				
				return temp;
			}
		}
		
	}
	public String toString(){
		String value=null;
		if(s1.isEmpty() && s2.isEmpty() ) return value;
		if(lastOperation ==1){
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}
			lastOperation=0;
			
		}
		return s1.toString();
		
		
	}
	public boolean isEmpty(){
		if(s1.isEmpty() && s2.isEmpty() ) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<node> st= new Stack<node>();
		QueueUseStack q1= new QueueUseStack();
		for(int i=1;i<=6;i++){
			q1.enqueue(new node(i));
		}
		System.out.println(q1.toString());
		q1.dequeue();
		q1.enqueue(new node(7));
		q1.dequeue();
		q1.enqueue(new node(8));
		q1.enqueue(new node(9));
		System.out.println(q1.toString());
		
		
		

	}

}
