package VikasVowel;
import java.util.*;
public class VikasVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	                            	String s=new String("He is my");
	                            	String s1="";
		                           String []arrOfStr=s.split("[aeiouAEIOU ]+");
		                           for (String a : arrOfStr) 
		                               s1+=a; 
		                           System.out.print(s1);
		
	}
	}


