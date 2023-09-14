package ramanainteview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ramanaint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> countries= driver.findElements(By.xpath("//table[@id='countries']//tr//td[2]"));
		System.out.println(countries.size());
		for(int i=1;i<=countries.size()-1;i++) {
			driver.findElement(By.xpath("(//tr//td[2]//preceding::input[@type='checkbox'])["+i+"]")).click();
			//driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]")).click();
			//driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td[1]//input[@type='checkbox']")).click();
		}
		

	}

}
