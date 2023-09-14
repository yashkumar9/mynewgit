package gurusir2;

public class Questionnumber25 {
	public static String reverse(String str) {
		//char[] ch=str.toCharArray();
		String[] str2=str.split("");
		String str3="";
		for(int i=str.length()-1;i>=0;i--) {
			str3=str3+str2[i];
		}
		return str3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="Surya";
      //reverse(str);
//      String str2=reverse(str);
//      System.out.println(reverse(str2));
      StringBuffer li=new StringBuffer(str);
      System.out.println(li.reverse());
	}

}
