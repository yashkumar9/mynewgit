package mynewsession;

import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,2,3,4,5,6};
    int[] arr2= {7,8,9,8};
   // int[] temp= {};
   int n= arr.length;
  int m=  arr2.length;
    if(n!=m)
    {
   n=n+m;
   m=n-m;
   n=n-m;
    
    }
    System.out.println(arr.length);
//    	for(int i=0;i<=(n+m)-1;i++)
//    	{
//    		arr[i]=arr[i]+arr2[i];
//    		arr2[i]=arr[i]-arr2[i];
//    		arr[i]=arr[i]-arr2[i];
//    		System.out.println(arr2[i]);
//    	}
     
     
     
     
     
	}

}
