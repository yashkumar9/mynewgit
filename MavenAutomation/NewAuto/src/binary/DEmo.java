package binary;

import java.util.Arrays;

public class DEmo {
	
	

	public static void main(String[] args) {
		String str1="dbac";
		//char[] ch1=str1.toCharArray();
		String str2="abcd";
		//char[] ch2=str2.toCharArray();
	//	String temp="";
		boolean result=false;
		
		for(int i=0;i<=str1.length()-1;i++) {
			if(str1.equalsIgnoreCase(str2)) {
				result=true;
				break;
			}
			str1=(str1.charAt(str1.length()-1))+str1.substring(0,str1.length()-1);	
			
		}
		if(result) {
		System.out.println(" string is a rotational one");
		}
		else
		{
			System.out.println(" string is not a rotational one");
			
		}
		
	
		
		

	}

}
