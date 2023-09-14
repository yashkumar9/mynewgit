package gurusir;

public class Questionnumber7 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,10};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		for(int j=arr[0];j<=arr[arr.length-1];j++) {
			sum2=sum2+j;	
		}
		//System.out.println(sum1+" "+sum2);
		System.out.println("the missing number is"+" "+(sum2-sum1));
		

	}

}
