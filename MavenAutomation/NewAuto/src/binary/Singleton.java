package binary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class A{
	 public static WebDriver driver=null;
	private  A() {
			
	}
	public static WebDriver getdriverinstance() {
		if(driver==null) {
			driver=new ChromeDriver();
		}
		return driver;
	}
}

public class Singleton {
	public static void main(String[] args) {
//		WebDriver driver= A.getdriverinstance();
//		driver.get("https://www.gmail.com");
//		WebDriver duplicatedriver= A.getdriverinstance();
//		duplicatedriver.get("https://www.google.com");
		int sum=0;
		for(int i=0;i<=50;i++) {
			sum=sum+i;		
		}
		System.out.println(sum);
	}

}
