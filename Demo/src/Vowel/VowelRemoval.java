package Vowel;
import java.util.*;
public class VowelRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.print("Enter the String");
		s=sc.next();
		int l=s.length();
		char c1[]= {};
		char c[]= {'a','e','i','o','u','A','E','I','O','U'};
		for(int i=0;i<l;i++)
		{
			c1=s.toCharArray();	
			System.out.println(c1[i]);
		}		
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c1[i]==c[i])
				{
					
				}
			}
		
	}
	}

}
