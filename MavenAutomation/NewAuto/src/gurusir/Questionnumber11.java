package gurusir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Questionnumber11 {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,4,4,4,4,5,5,5,5};
		//ArrayList<Integer> list=new ArrayList<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
		if(!(map.containsKey(arr[i]))) {
			map.put(arr[i],1); //map.get(arr[i])+1);	
		}
//		else {
//			map.put(arr[i], 1);
//		}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey());
			
		}
		
		
		
		
	//???????????????????????????????????????????????????	
//		HashSet<String> hash=new HashSet<>();
//		for(String l:str) {
//			if(hash.add(l)==false) {
//				System.out.println("duplicate value found"+" "+l);	
//			}
//		}

		
	}

}
