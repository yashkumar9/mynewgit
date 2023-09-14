package gurusir2;

import java.util.HashMap;
import java.util.Map;

public class Questionnumber17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Book key table key smart book key on the table science book";
		String[] str2=str.split(" ");
//		for(int i=0;i<str2.length;i++) {
//			System.out.println(str2[i]);
//		}
		
		HashMap<String, Integer> map=new HashMap<>();
		for(int i=0;i<str2.length;i++) {
			if(map.containsKey(str2[i])) {
				//map.put(ch[i], map.get(ch[i]+1));
				map.put(str2[i],map.get(str2[i])+1);
			}
			else {
				map.put(str2[i], 1);
			}
		}
		
		for(Map.Entry<String,Integer> ent:map.entrySet())  {
			int currentvalue=ent.getValue();
			if(currentvalue>1) {
				System.out.println(ent.getKey());
				
			}
			
			
		}
	}

}
