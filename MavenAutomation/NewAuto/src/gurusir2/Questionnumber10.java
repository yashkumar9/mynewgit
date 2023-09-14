package gurusir2;

public class Questionnumber10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java java is a good good language";

		String [] str2=s.split(" ");
		//System.out.println(str2[1]);
//		String str=s.replaceAll(" ", "");
//		char[] ch=str.toCharArray();
		//System.out.println("number of charcter in the given sting with duplicates"+ch.length);
		for(int i=0;i<str2.length;i++) {
			for(int j=i+1;j<str2.length;j++) {
				if(str2[i].equals(str2[j])) {
					System.out.println("the duplicate word of the given string"+" "+str2[i]);
				}
			}
		}
	}

}
