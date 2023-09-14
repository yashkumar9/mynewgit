package binary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DtoB {
	public static double binary_to_digit(int num) {
     double decimal=0;
     for(int i=0;num!=0;i++) {
    	long rem=num%10;
    	num=num/10;
    	decimal=(decimal+(rem*Math.pow(2, i))); 
     }
   return decimal;
		
	}
	public static void digit_to_binary(int num) {
		int[] a=new int[10];
		int count=0;
		for(int i=0;i<num;i++) {
			count++;
			 a[i]=num%10;
			 num=num/10;
		}
		for(int i=count-1;i<=0;i--) {
			System.out.print(a[i]);
			
		}
		
	}
	public static void str1() {
		String str="Suresh#1234";
		String str1=str.replaceAll("[^a-z]","");
		System.out.println(str1);
		str=str.replaceAll("[0-9]","");
		System.out.println(str);
		for(int i=str1.length()-1;i>=0;i--) {
			str=str+str1.charAt(i);	
		}		
		System.out.println(str);
//		String[] str2=str.split("#");
//		String str3="";
//		String str4="";
//		for(int i=str2[1].length()-1;i>=0;i--) {
//			str3=str3+str2[1].charAt(i);	
//		}
//		for(int i=0;i<str2[0].length();i++) {
//			str4=str4+str2[0].charAt(i);	
//		}
//		System.out.println(str4+"#"+str3);
		
	}
	public static void prefix() {
		String[] str= {"geekforgeeks","geekshe","geekforhibro"};
		String str1=str[0].substring(0, 4);
		System.out.println(str1);
		int count=0;
		for(int i=0;i<str.length;i++) {
			if(str1.equals(str[i].substring(0,4))|| str[i].startsWith(str1)) {
				continue;
			}
			else {
				count++;
				System.out.println("gee is not the common prefix");
				break;
			}
		}
		if(count==0) {
		System.out.println("the common prefix is"+" "+str1);
		}
		
		
	}
	public static void arrcount() {
		int[] arr= {1,4,7,1,4,5,7,3,7};
		int count=1;
		HashMap<Integer, Integer> hashmap=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			//int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					hashmap.put(arr[i], count);
					count++;
				}
				//count++;
			}
		}
		System.out.println(hashmap.entrySet());
	}
	public static void str12() {
//		String str = "this is a string";
//		StringBuffer str1=new StringBuffer(str);
//		try {
//		for(int i=0;i<str1.length();i++) {
//			for(int j=i+1;j<str1.length();j++) {
//				if(str.charAt(i)==str.charAt(i)) {
//					str1.deleteCharAt(i);
//				}
//			}
//		}
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
//		System.out.println(str1);
		 String s="this is a string";
		  String out="";
		  HashSet<Character> set=new HashSet();
		  for(int i=0;i<=s.length()-1;i++)
		  {
		      if(set.add(s.charAt(i)))
		      {
		          out=out+s.charAt(i);
		      }
		  }  
		  System.out.println(out);
		    }


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  str12();
	
	}
}
