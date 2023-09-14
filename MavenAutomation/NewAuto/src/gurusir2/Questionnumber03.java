package gurusir2;

import java.util.Arrays;

public class Questionnumber03 {
	public static void test1(int[] arr,int k) {
		boolean	flag =false;
		int [] arr2=new int[arr.length+1];
          for(int i=0;i<arr.length;i++) {
        	  if(arr[i]==k) {
        		  
        		  flag=true;
        	        	  }
          }
          if(flag) {
              
        	  for(int i=0;i<arr.length;i++) {
        		  arr2[i]=arr[i];
        	  } 
          }
          if(flag==false) {
        	  for(int i=0;i<arr.length;i++) {
        		  arr2[i]=arr[i];
        	  }
        	  arr2[arr2.length-1]=k;
        	  Arrays.sort(arr2);
          }
          
         
         
          for(int i=0;i<arr2.length;i++) {
  			if(arr2[i]==k) {
  			System.out.println("the array element"+" "+arr2[i]+ " "+"index number is"+" "+i);	
  			}
  		} 
		
	}

	public static void main(String[] args) {
		int[] arr= {1,3,5,6,7};//4
	test1(arr, 0);
          
	}
	
}
