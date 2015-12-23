package Set97;

import java.util.Scanner;

public class MaxElementArray {

	private int inputArray[];
	
	public int[] getInputArray() {
		return inputArray;
	}

	public void setInputArray(int[] inputArray) {
		this.inputArray = inputArray;
	}
	
	public int maxElementofArray(){
		int mid,low=0;
		mid=low;
		int[] tempArray=getInputArray();
		int high= getInputArray().length-1;
		while(low<high){
			mid=(high+low)/2;
			System.out.println("low is:"+low+" mid is "+mid +" high is: "+high);
			if((tempArray[mid]>=tempArray[mid+1])&& (tempArray[mid]>=tempArray[mid-1]) )
				return tempArray[mid];
			if(tempArray[mid]<tempArray[mid+1] ) low=mid+1;
			else high=mid-1;
		}
		return tempArray[mid];
	}
	
	public int numberofPolesVisible(int standingPosition){
		
		int size=getInputArray().length;
		if( standingPosition >=size) return 0;
		int currentMax;
		
		
		return 0;
	}

	public static void main(String[] args) {
		
		MaxElementArray maxArry= new MaxElementArray();
		System.out.println("enter array size and followed by elements");
		int size, arayTest[],maxElement;
		Scanner sc =new Scanner(System.in);
		size=sc.nextInt();
		arayTest=new int[size];
		for(int i=0;i<size;i++)
			arayTest[i]=sc.nextInt();
		maxArry.setInputArray(arayTest);
		maxElement=maxArry.maxElementofArray();
		System.out.println("Max element of the array is: "+maxElement);
	}
}
