package gurusir2;

import java.util.HashMap;
import java.util.Map;

public class Questionnumber23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,4,5,8,6,2,7,3,9};
		HashMap<Integer, Integer> amp=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==8) {
					amp.put(arr[i], arr[j]);
				}
			}
		}
	
		for(Map.Entry<Integer, Integer> ent:amp.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}

	}

}
