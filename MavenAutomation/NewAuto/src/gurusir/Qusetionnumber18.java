package gurusir;

import java.util.HashMap;
import java.util.Map;

public class Qusetionnumber18 {
	public static void test3(int [] a,int k) {

	HashMap<Integer, Integer> map=new HashMap<>();
	boolean flag=false;	
	for(int i=0;i<a.length;i++) {
	if(map.containsKey(a[i])) {
		map.put(a[i],map.get(a[i])+1);	
	}
	else {
		map.put(a[i],1);
	}
	}
	for(Map.Entry<Integer,Integer > entry: map.entrySet()) {
		
	int currentvalue=entry.getValue();
	if(k==currentvalue) {
		System.out.println(entry.getKey());
		flag=true;
		//break;
	}
	}
	
	if(flag==false) {
	System.out.println("no element is appear for" +k+ "times");	
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,3,4,5,2};

	}

}
