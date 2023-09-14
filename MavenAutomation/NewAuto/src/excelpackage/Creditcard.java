package excelpackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Creditcard {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String jio="";
         WebDriver driver=new ChromeDriver();
         Thread.sleep(3000);
         driver.manage().deleteAllCookies();
         driver.get("https://demo.tutorialzine.com/2016/11/simple-credit-card-validation-form/");
         driver.findElement(By.xpath("//input[@id='owner']")).sendKeys("herry");
         String cvv=driver.findElement(By.xpath("(//table[@class='table table-hover']//tr//td[3])[1]")).getText();
         driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(cvv);
         Actions ac = new Actions(driver);
         Thread.sleep(300);
         driver.findElement(By.xpath("(//table[@class='table table-hover']//tr//td[2])[1]")).sendKeys(Keys.CONTROL+"c");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys(Keys.CONTROL+"v");
//         System.out.println(cardnumber);
//         long li=Long.parseLong(cardnumber);
//         System.out.println(li);
//         Actions ac = new Actions(driver);
//         ac.sendKeys(args)
//         
         
         
         
        // driver.findElement(By.xpath("//input[@id='cardNumber']"))
//         for(int i=0;i<cardnumber.length();i++)
//         {
//        	if(i!=0 && i%4==0)
//        	{
//        		jio=jio+" ";
//        	}
//        	jio=jio+cardnumber.charAt(i);
//        	
//         }
//         System.out.println(jio);
         //System.out.println(jio1);
         //driver.findElement(By.xpath("//input[@id='cardNumber']"))
         
	}

}
