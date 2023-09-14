package gurusir2;

public class Questionnumber11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "abc123def45gh6i7";
			String[] str=s.split("[A-Za-z]");
			int sum=0;
			for(int i=0;i<str.length;i++) {
				if(str[i]!="") {
			sum=sum+Integer.parseInt(str[i]);
				}
			}
System.out.println(sum);
	}

}
