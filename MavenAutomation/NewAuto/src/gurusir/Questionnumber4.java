package gurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Questionnumber4 {
	public static void main(String[] args) {
		Integer arr[]= {3,1,2,3,4,5,6,2,1,5,6,1,1,1,1};
		HashSet<Integer> hash=new HashSet<>(Arrays.asList(arr));
		//int[] arr2=new int[hash.size()];
		ArrayList<Integer> name=new ArrayList<Integer>(hash);
		System.out.println(name);
		
		
	}

}
