package gurusir;

public class Questionnumber17 {
	public static boolean  bracket(String str) {
		int count=0;
		for(char ch:str.toCharArray()) {
			if(ch=='(') {
				count++;
			}
			else if(ch==')') {
				count--;
				if(count<0) {
					return false;
				}
			}
			
		}
		
		return count==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="((()))";
//            int count=0;
//            int count2=0;
//            for(int i=0;i<str.length();i++) {
//            if(str.charAt(i)=='(') {
//            	count++;
//            	
//            }
//            else if(str.charAt(i)==')') {
//            	count--;
//            }
//            }
//            if(count==0) {
//            	System.out.println("true");
//            	
//            }
//            else {
//            	System.out.println("false");
//            }
           
           System.out.println(bracket(str));
	}

}
