package forlooponly;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class REpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//       String str="my name is Hyderabad";
		//       String str2[]=str.split(" ");
		//       for(int i=0;i<=str2.length-1;i++)
		//       {
		//    	   //int count=str2[i].length();
		//    	  for(int j=1;j<str2[i].length();j++)
		//    	  {
		//    		  System.out.print(str2[i]+" ");
		//    	  }
		//    	  System.out.println();
		//		}
		//		int[] arr= {2,3,4,5,2,3,3,3,3};
		//		HashMap<Integer, Integer> map=new HashMap<>();
		//		for(int i:arr)
		//		{
		//			Integer val=map.get(i);
		//			if(/*val==null*/ !map.containsKey(val))
		//			{
		//				map.put(i, 1);
		//			}
		//			else {
		//			map.put(i, val+1)	;
		//				//map.remove(val);
		//			}
		//		}
		//		System.out.println(map.entrySet());
		//       for(Map.Entry<Integer, Integer> q:map.entrySet())		{
		//    	   if(q.getValue()>arr.length/2)
		//    	   {
		//    		  System.out.println("majority element is"+" "+q.getKey()+" "+"and its count is"+" "+q.getValue()); 
		//    	   }
		//    	   
		//       }
		//		System.out.println('a'+'b');
		//		for(int i='a';i<='z';i++)
		//		{
		//			if(i<='j') {
		//				System.out.println((char)i+" "+i);
		//			}
		//
		//		}
               int[] arr= {1,2,3,4,2,6,1,5,6};
               List<Integer> set=new ArrayList<>();
               for(int i=0;i<=arr.length-1;i++)
               {
            	set.add(arr[i]);   
               }
               System.out.println(set);
	}
}
