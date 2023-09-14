package gurusir2;

import java.util.HashMap;
import java.util.Map;

public class Questionnumber14 {
	public static  void test1(String str) {
		char[] ch=str.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> ent:map.entrySet()) {
			//if(ent.getValue()>1) {
			System.out.println(ent.getKey()+" "+ent.getValue());
			//}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"racecar", "abcdecac", "override", "madam"
		//String str="racecar";
//		char[] ch=str.toCharArray();
//		System.out.println(ch.length);
//		test1("racecar");
//		test1("abcdecac");
//		test1("override");
//		test1("madam");
	}

}
