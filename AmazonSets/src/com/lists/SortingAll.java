package com.lists;

import java.util.concurrent.Exchanger;

public class SortingAll {

	/**
	 * @param args
	 */
	
	//swap two elements in array
	public static void swapElements(int[]a, int p1,int p2){
		int temp=a[p1];
		a[p1]=a[p2];
		a[p2]=temp;
	}
	//For printing Array
	public static void printArray(int[] p){
		if(p.length==0) return;
		for(int i=0;i<p.length;i++)
			System.out.print("  "+p[i]);
	}
	// Sort elements by using Insertionsort
	public static void insertionSort(int[] p){
		if(p.length <=1) return;
		int i,key;
		for(int j=1;j<p.length;j++){
			i=j-1;
			key=p[j];
			while(i>=0 && p[i]>key){
				p[i+1]=p[i];
				i--;
			}
			p[i+1]=key;
		}
	}
	
	//QuickSort main call
	public static void quickSort(int[]a, int p, int r){
		if(p<r){
			int q=partitionOfQuickSort(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a, q+1, r);
			
		}
	}
	public static int partitionOfQuickSort(int[]a, int p, int r){
		int  x=a[r];
		int i=p-1;
		int j=r+1;
		System.out.println("\n pivot element is:"+x);
		//System.out.println("i and j values are:  "+i+"  "+j);
		while (true){
			do{
				
				j=j-1;
				//System.out.println("j value and its array value is "+j+" "+ a[j]);
			}while(a[j]>x && j>p);
			
			do{
				i=i+1;
				//System.out.println("i value is "+i);
			}while(a[i]<x && i<r);
			
			if(i<j)
			{
				printArray(a);
				System.out.println();
				swapElements(a, i, j);
				printArray(a);
			}
			else return j;		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,4,6,8,9,7,2,5,1};
		printArray(a);
		System.out.println();
		//insertionSort(a);
		quickSort(a, 0, a.length-1);
		System.out.println();
		printArray(a);
	}

}
