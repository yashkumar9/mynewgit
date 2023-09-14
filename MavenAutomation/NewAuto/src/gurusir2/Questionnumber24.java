package gurusir2;

public class Questionnumber24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="web internet web chrome internet safari";
		String [] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
	}

}
