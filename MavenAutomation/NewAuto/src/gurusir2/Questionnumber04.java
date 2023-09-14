package gurusir2;

public class Questionnumber04 {

	public static void main(String[] args) {
		String str="Chennai is a green city";
		String[] str2=str.split(" ");
            for(int i=str2.length-1;i>=0;i--) {
            	//System.out.print(str2[i]+" ");
            	char[] ch=str2[i].toCharArray();
            	for(int j=ch.length-1;j>=0;j--) {
            	System.out.print(ch[j]);
            	
            	}
            	System.out.print(" ");
            }
	}

}
