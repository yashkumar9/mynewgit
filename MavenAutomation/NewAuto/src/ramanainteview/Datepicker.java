package ramanainteview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Datepicker {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.confirmtkt.com/rbooking-d/");
		driver.findElement(By.xpath("//label[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter from']")).sendKeys("ADH");
		//Actions ac=new Actions(driver);
		//ac.keyDown(Keys.ARROW_DOWN).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='source-item-0']")).click();
		driver.findElement(By.xpath("//label[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter to']")).sendKeys("BMT");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='destination-item-0']")).click();
		driver.findElement(By.xpath("//input[@id='dateOfJourney']")).click();
		driver.findElement(By.xpath("//*[text()='19']")).click();
		driver.findElement(By.xpath("//*[text()='SEARCH']")).click();
		}
}
