package ramanainteview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Qedge {

	public static void main(String[] args) {
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(option);
//		//driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.get("http://webapp.qedgetech.com/login.php?expired=1");
		Integer[] number= {1,2,3,4,5};
		List<Integer> l=new ArrayList<Integer>(Arrays.asList(number));
		System.out.println(l.size());
		
		
}

}
