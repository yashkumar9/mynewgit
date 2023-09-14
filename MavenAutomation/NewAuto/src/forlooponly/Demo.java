package forlooponly;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class B{
	 public void test1(){
	        System.out.println("you and me togather");
	    }
	    public static void test2(){
	        System.out.println("test2");
	    }
}
public class Demo extends B{
	public static void str12() {
	 String str="madam";
	 String jio="";
	 for(int i=0;i<str.length();i++) {
		 int ind=1;
		 for(int j=i+1;j<str.length();j++) {
			 if(str.charAt(i)==str.charAt(j)) {
				ind++; 
			 }
			 
		 }
		 if(ind>1) {
			//System.out.println(str.substring(i+1));
			 System.out.println(str.substring(i+1));
			 break;
		 }
		 
		 
	 }
	}
	public static void demo() {
		String str="mada";
		StringBuffer s=new StringBuffer(str);
		StringBuffer str2=s.reverse();
		System.out.println(str2);
	}

	public static void main(String[] args) throws Throwable, IOException {
		demo();
//		Properties q=new Properties();
//		q.load(new FileInputStream("C:\\MavenAutomation\\NewAuto\\demo.properties"));
//		System.out.println(q.getProperty("browser"));
	}

}
