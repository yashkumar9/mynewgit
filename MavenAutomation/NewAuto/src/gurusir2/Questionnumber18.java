package gurusir2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Questionnumber18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,8,5,4,2,5,9,7};
		HashSet<Integer> hash=new HashSet<>();
		ArrayList<Integer> list=new ArrayList<>();
		int[] arr2=new int[list.size()]; 
		for(int i=0;i<arr.length;i++) {
			if(hash.add(arr[i])) {
				list.add(arr[i]);
			}
		}
		for(int j=0;j<list.size();j++) {
			if(2.5<list.get(j)) {
				System.out.println(list.get(j));
			}
		}
		
	}

}
