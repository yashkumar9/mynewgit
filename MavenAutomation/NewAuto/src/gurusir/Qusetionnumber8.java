package gurusir;

import java.util.Arrays;

public class Qusetionnumber8 {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}	
		System.out.println();
	}
public static void main(String[] args) {
	int arr []={0,2,1,0,3,0,0,0};
	//int arr[]= {7,8,3,1,2};
	  for(int i=0;i<arr.length-1;i++)
      {
     	for(int j=0;j<arr.length-i-1;j++) {
     		if(arr[j]==0) {
     			int temp=arr[j];
     			arr[j]=arr[j+1];
     			arr[j+1]=temp;
     		}
     		
     	}
     	 
      }
      System.out.println(Arrays.toString(arr));
//      int arr2[]= {2,1,1,0,0,0,3};
//      Arrays.sort(arr2);
//      System.out.println(Arrays.toString(arr2));
	
}
}
