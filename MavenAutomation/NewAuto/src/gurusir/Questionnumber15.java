package gurusir;

import java.util.ArrayList;

public class Questionnumber15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcddeff";
		ArrayList<Character> ch=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
         for(int j=i+1;j<str.length();j++) {
        	 if(str.charAt(i)==str.charAt(j)) {
        		ch.add(str.charAt(i));
        	 }
         }
			
		}
		System.out.println("the first repetitive letter is"+"  "+ch.get(0) );
	}

}
