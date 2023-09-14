package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LOgintest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		Properties config=new Properties();
		config.load(new FileInputStream("C:\\MavenAutomation\\NewAuto\\config.properties"));
		driver.get(config.getProperty("URL"));
		
		//Loginpage qt=new Loginpage(driver);
		//qt.login("standard_user", "secret_sauce");
		LOginpage2 hp=new LOginpage2(driver);
		hp.login(config.getProperty("username"),config.getProperty("password"));
	}

}
