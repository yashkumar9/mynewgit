package gurusir;

import java.util.Arrays;
import java.util.HashMap;

public class Questionnumber10 {

	public static void main(String[] args) {
		Integer[] arr= {1,1,1,3,2,2,2,2,0,0,0};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) 
				count++;
			
			else 
				break;
		}
		System.out.println(arr[i]+" "+count);
		i+=count-1;
		
		}
		
		}
		

}
