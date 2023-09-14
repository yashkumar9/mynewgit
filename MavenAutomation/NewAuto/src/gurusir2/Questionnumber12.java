package gurusir2;

import java.util.HashMap;
import java.util.Map;

public class Questionnumber12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String colors = "red, blue, green, red, blue, orange, blue, red";
		String[] str=colors.split(",");
       String [] str2=new String[str.length];
       for(int i=0;i<str.length;i++) {
    	   str2[i]=str[i].trim();
       }
			
			
			HashMap<String, Integer> map=new HashMap<>();
			for(int i=0;i<str2.length;i++) {
				if(map.containsKey(str[i].trim())) {
					map.put(str2[i], map.get(str2[i])+1);
				}
				else {
					map.put(str2[i], 1);
				}
			}
			
			for(Map.Entry<String, Integer> ent:map.entrySet()) {
				//if(ent.getValue()>1) {
				System.out.println(ent.getKey()+" "+ent.getValue());
				//}
			}
			
	}

}
