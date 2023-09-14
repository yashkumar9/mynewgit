package ramanainteview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ramanainterview {
	WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		String actCountry = "Uganda";
		List<WebElement> countries = driver.findElements(By.xpath("//table[@id='countries']//tr//td[2]"));
		List<String> countrs = new ArrayList<String>();
		for (int i = 1; i <countries.size(); i++)
		{
			String country = countries.get(i).getText();
			countrs.add(country);
			//if (country.equals(actCountry)) 
			//{
				driver.findElement(By.xpath("(//table[@id='countries']//tr//input[@type='checkbox'])["+i+"]")).click();
			//}
		}
//		for (int i = 0; i < countrs.size(); i++) 
//		{
//			System.out.println(countrs.get(i));
//		}
		//Karthi234rth351k45c
		Thread.sleep(5000);
		driver.quit();
	}

}
