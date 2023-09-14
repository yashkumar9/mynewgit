package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	Loginpage(WebDriver d){
		driver=d;
	}
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbtn=By.id("login-button");
	public void login(String user, String pwd) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbtn).click();	
	}
	

}
