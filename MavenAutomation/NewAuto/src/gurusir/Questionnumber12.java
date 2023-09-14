package gurusir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Questionnumber12 {
public static void test2(char[] a) {
	ArrayList<Character> ch=new ArrayList<>();
	for(int i=0;i<a.length;i++) {
     for(int j=i+1;j<a.length;j++) {
    	 if(a[i]==a[j]) {
    		ch.add(a[i]);
    	 }
     }
		
	}
	System.out.println("the first repetitive letter is"+"  "+ch.get(0) );
}
public static void test3(char[] a,int k) {
	HashMap<Character, Integer> map=new HashMap<>();
	boolean flag=false;	
	for(int i=0;i<a.length;i++) {
	if(map.containsKey(a[i])) {
		map.put(a[i],map.get(a[i])+1);	
	}
	else {
		map.put(a[i],1);
	}
	}
	for(Map.Entry<Character,Integer > entry: map.entrySet()) {
		
	int currentvalue=entry.getValue();
	if(k==currentvalue) {
		System.out.println(entry.getKey());
		flag=true;
		//break;
	}
	
		
	}
	if(flag==false) {
		System.out.println(map.get('c'));
	}
	
	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 char[] ch= {'a','b','b','c','d','c','f'};
 
// test1(ch, 4);
// test2(ch);
 test3(ch,2
		 );
 
 
	}

}
