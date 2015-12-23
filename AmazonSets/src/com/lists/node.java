package com.lists;

public class node {

	public Object data;
	public node next;
	public node prev;
	public node left;
	public node right;
	public node(Object data){
		this.data=data;
	}
	public node(int i){
		this.data=new Integer(i);
	}
	public node(char c){
		this.data=new Character(c);
	}
	public node getLeft() {
		return left;
	}
	public node getRight() {
		return right;
	}
	public void setLeft(node left) {
		this.left = left;
	}
	public void setRight(node right) {
		this.right = right;
	}
	public String toString(){
		return data.toString();
	}
}
