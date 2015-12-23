package com.lists;

import java.util.Stack;


public class OperatorEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> OpStack = new Stack<String>();
		Stack<Integer> NumStack = new Stack<Integer>();
		int result = 0;
		System.out.println("Enter an expression with numbers and operators *-+");
		System.out.println("Operates left to right");
		String test ="3+4*6-9*4";
		
		StringBuffer sb = new StringBuffer(test);
		
		char[] chars = (sb.reverse()).toString().toCharArray();
		
		System.out.println(chars.toString());
		
		for(int i=0; i<chars.length ;i++)
		{
			if(chars[i]=='*' || chars[i]=='-' || chars[i]=='+')
			{
			OpStack.push(Character.toString(chars[i]));
			}
			
			else if(Character.isDigit(chars[i]))
			{
				String number = "";
				int pushnumber;
				while(Character.isDigit(chars[i]))
				{
					number += chars[i];
					
							i++;
							
							if( i > chars.length-1)
								break;
				}
				
				StringBuffer buffer = new StringBuffer(number);
				String push = (buffer.reverse()).toString();
				pushnumber = Integer.parseInt(push);
				
			NumStack.push(pushnumber);
			i--;
			}	
			
			else
				break;
			
		}
		
		while(!OpStack.isEmpty()  )
		{
			String op = OpStack.pop();
			char c = op.charAt(0);
			
			int a = NumStack.pop();
			int b = NumStack.pop();
			
			if(c == '*')
			
				result =  a*b;
				
			
			if(c== '+')
			
			  result = (a+b);
			  			
			if(c == '-')
		
				result = (a-b); 
			
			
			
		    NumStack.push(result);
			
			
		}
		System.out.println(result);
		
		
		
	}

	

}
