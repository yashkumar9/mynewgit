package gurusir2;

import java.util.HashMap;
import java.util.Map;

public class Questionnumber5 {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("herry", 102);
		map.put("jhon", 101);
		map.put("hennary", 107);
		System.out.println(map.entrySet());
		System.out.println(map.keySet()+" "+map.values());
		System.out.println(map.get("jhon"));
		for(Map.Entry<String, Integer> ent:map.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		

	}

}
