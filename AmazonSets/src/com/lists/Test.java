package com.lists;

public class Test {

	public static boolean isPalindrome(int a[]){
		int low=0,high=a.length-1;
		while(low<=high){
			if(a[low] != a[high])
				return false;
			low++;
			high--;
		
		}		
		return true;
	}
	public static void pritnFibonachiSeries(int n){
		int a=1,b=1;
		if(n <=0) return;
		int loop=1,temp;
		while(loop<=n){
			if(loop==1 || loop==2){
				System.out.print("  1");
				loop++;
				continue;
			}
			temp=a+b;
			System.out.print("  "+temp);
			a=b;
			b=temp;	
			loop++;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a={1,2,3,3,3,1};
		System.out.println("Inside main");
//		if(Test.isPalindrome(a) )
//			System.out.println("Given number is palindrome");
//		else
//			System.out.println("Given number is not palindrome");
		pritnFibonachiSeries(10);
		
	}

}
