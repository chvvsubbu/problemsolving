package com.lists;

public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-1,-2,-3};
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum = sum^i;
		}
		int i=-1,j=-2;
		int sum1= a[1]^a[2]^a[0];
		sum1 = sum1^(-2)^(-3);
		
		System.out.println("sum1 is "+ sum1);
		
		
		

	}

}
