package gurusir2;

public class Questionnumber01 {
	public static void indexnumber(int [] arr,int k) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				System.out.println("the index number of"+" "+k+" is"+" "+i);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("the element"+" "+k+" "+"not present on the array");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {3,5,6,9};
         indexnumber(arr, 4);
         
	}

}
