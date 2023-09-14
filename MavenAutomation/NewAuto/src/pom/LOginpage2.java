package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOginpage2 {
	WebDriver driver;
	LOginpage2(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="user-name")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement loginbtn;
	public void login(String user,String pwd) {
		username.sendKeys(user);
		password.sendKeys(pwd);
		loginbtn.click();
		
		
	}
	

}
