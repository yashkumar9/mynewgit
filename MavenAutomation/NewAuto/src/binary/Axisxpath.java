package binary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.Configuration;

public class Axisxpath {
	public static void str() {
		String str="ramangouda";
		String str1=str.substring(str.indexOf("gouda"));
		System.out.println(str1);
		System.out.println(str.indexOf("gouda"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//str();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*"); //<-this is the fix
		//Configuration.browserCapabilities = chromeOptions; //(for Selenide, for example)
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/SPURGE/Downloads/SampleWebTable.html");
            
		

	}

}
