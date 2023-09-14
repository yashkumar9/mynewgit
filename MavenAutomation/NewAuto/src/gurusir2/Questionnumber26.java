package gurusir2;

import java.util.HashSet;

public class Questionnumber26 {
	public static void test1(String str) {
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					
					flag=true;
					
				}
			}
			
		}
		if(flag) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static void test2(String str1) {
		char[] ch=str1.toCharArray();
		boolean flag=false;
		HashSet<Character> set=new HashSet<>();
		
		for(int i=0;i<ch.length;i++) {
			if(set.add(ch[i])==false) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1 = "abababcde";
			String s3="jery";
			//test1(s1);
			test2(s3);
	}

}
