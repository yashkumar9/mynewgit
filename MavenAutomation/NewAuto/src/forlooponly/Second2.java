package forlooponly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Second2 {
	public static Map<Integer, List<String>> separateStringbylength(String str){
        String [] arr=str.split(" ");
         Map<Integer, List<String>> map=new HashMap<>();
         
         for(int i=0;i<arr.length;i++) {
             
             Integer count =arr[i].length();
             
             
            if(!map.containsKey(count)) {
                List<String> s=new ArrayList<>();
                s.add(arr[i]);
                map.put(count,s);        
            }else {
                List<String> s=map.get(count);
                s.add(arr[i]);

            }           
         }
         return map;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str =" i am rockstar but not fameous";
	//System.out.println(separateStringbylength(str).keySet());
	 for (Map.Entry<Integer,List<String>> entry :separateStringbylength(str) .entrySet()) 
         System.out.println("Key = " + entry.getKey() +
                          ", Value = " + entry.getValue());

	}

}
