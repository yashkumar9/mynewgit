package gurusir;

import java.util.ArrayList;
import java.util.Arrays;

public class Questionnumber2 {
	public static void removeelements(int[] arr,int num) {
		//int arr[]= {3,1,2,3,4,5};
		int arr2[] =new int[arr.length-1];
		//int num=4;
		for(int i=0;i<arr.length;i++) {
			if(num!=arr[i]) {
			arr2[i]=arr[i];
			}
		}
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}
	}

	public static void main(String[] args) {
		int arr[]= {3,1,2,3,4,5};
		removeelements(arr, 5);
	}

}
