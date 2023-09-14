package excelpackage;

public class DtoB {
	public static void  stringstr() {
		String str="jhonshian";
		
		System.out.println(str.substring(3,5));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str={"geekforgeks","geekhelloworld","geekbrodone","geeks","gees"};//{"};
		String str1="";
		//String str2=str[0];

		//System.out.println(str[1+1].charAt(0));
		try {
			for(int j=0;j<str[0].length();j++) {
				for(int i=0;i<str[i].length();i++) {
					if(str[j].charAt(i)==str[j+i].charAt(i)) {
						str1=str1+str[i].charAt(i);
					}
					else {
						break;
					}

				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(str1);



	}}



