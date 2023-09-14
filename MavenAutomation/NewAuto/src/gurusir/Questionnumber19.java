package gurusir;

import java.util.HashMap;
import java.util.Map;

public class Questionnumber19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,2};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i])+1);	
		}
		else {
			map.put(arr[i], 1);
		}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}

	}

}
