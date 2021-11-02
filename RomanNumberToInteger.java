package Java_Assignmetn_01Nov2021;

import java.util.Scanner;

//Assignment link :- https://onedrive.live.com/view.aspx?resid=B270BFA8B6522593!218&ithint=file%2cdocx&authkey=!AJn3nCj6TliBsnc

/*2. Roman Number to Integer

Given a string in roman no format (s) your task is to convert it to an integer .
 Various symbols and their values are given below. 
 I 1
 V 5 
 X 10 
 L 50 
 C 100 
 D 500 
 M 1000   
 
 Example 1:       Example 2:
  Input: 		  Input:
 	s = V		  	s = III
 Output: 5			  Output: 3
 */

public class RomanNumberToInteger {

	public int RomanNum(char c) {
		if (c == 'I')
			return 1;
		if (c == 'V')
			return 5;
		if (c == 'X')
			return 10;
		if (c == 'L')
			return 50;
		if (c == 'C')
			return 100;
		if (c == 'D')
			return 500;
		if (c == 'M')
			return 1000;
		return -1;
	}

	public int  RomanNumToInt(String s) {
		int res=0;
		for(int i=0;i<s.length();i++)
		{
			int s1=RomanNum(s.charAt(i));
			
			if(i+1<s.length())
			{
				int s2=RomanNum(s.charAt(i+1));
				
				if(s1>=s2)
				{
					res=res+s1;
				
				}
				else
				{
					res=res+s2-s1;
					i++;
				}
			}
			else
			{
				res=res+s1;
			}
			
		}
		return res;
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Read a Roman Number");
		String str=scan.next();
		RomanNumberToInteger rnti=new RomanNumberToInteger();
		System.out.println(rnti.RomanNumToInt(str));
		

	}

}
