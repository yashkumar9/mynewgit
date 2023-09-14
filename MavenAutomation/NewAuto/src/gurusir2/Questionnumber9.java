package gurusir2;

import java.util.HashMap;
import java.util.Map;

public class Questionnumber9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s = "This is sample string to count the strings";
		
		String str=s.replaceAll(" ", "");
		char[] ch=str.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i])) {
				//map.put(ch[i], map.get(ch[i]+1));
				map.put(ch[i],map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		
		for(Map.Entry<Character,Integer> ent:map.entrySet())  {
			int currentvalue=ent.getValue();
			if(currentvalue!=1) {
				System.out.println(ent.getKey());
				
			}
			
			
		}
		
		
	}

}
