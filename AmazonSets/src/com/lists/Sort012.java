package com.lists;

public class Sort012 {

	/**
	 * @param args
	 */
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
	}
	public static void DutchNationalFlag(int[] a){
		int negative=0,current=0,positive=a.length-1;
		while(current <=positive && (current<a.length)){
			if(a[current]<0){
				a[negative]= a[current]+a[negative]-(a[current]=a[negative]);
				negative++;current++;
			}
			else if(a[current] >0){
				a[positive]= a[current]+a[positive]-(a[current]=a[positive]);
				positive--;
			}else if(a[current]==0){
				current++;
			}
			printArray(a);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]={0,1,2,0,0,2,2,1,0,1,1,0,2};
		int a[]={-2,3,5,0,-3,7,-1};
		printArray(a);
		System.out.println();
		DutchNationalFlag(a);
/*		int first=0,current=0,twos=a.length-1;
		while(current <=twos &&(current<a.length)){
			if(a[current] ==0){
				a[current]= a[first]+a[current]-(a[first]=a[current]);
				first++;current++;
			}
			else if(a[current] ==2){
				a[current]= a[twos]+a[current]-(a[twos]=a[current]);
				twos--;
			}
				else if(a[current] ==1){
					current++;
				}
				
		}*/
		printArray(a);
		
		

	}

}
