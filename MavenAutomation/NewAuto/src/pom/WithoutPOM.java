package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutPOM {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
       driver.findElement(By.id("login-button")).click();
	}

}
