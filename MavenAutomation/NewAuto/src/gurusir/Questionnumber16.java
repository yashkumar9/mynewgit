package gurusir;

import java.util.Arrays;

public class Questionnumber16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,5,6,7};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==5 || arr[i]==4) {
				arr[i]=3;
			}
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
