package mynewsession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigation {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/MainPage.html");
  //String n="Narendra Modi";
    driver.switchTo().newWindow(WindowType.TAB);
    Thread.sleep(5000);
    driver.get("file:///C:/Users/SPURGE/Downloads/SampleWebTable.html");
        String id=driver.findElement(By.xpath("//td[text()='Narendra Modi']/following::td[1]")).getText();
      String password =driver.findElement(By.xpath("//td[text()='Student3']/following::td[1]")).getText();
      //System.out.println(id+" "+password);
    Set<String> handles=driver.getWindowHandles();
    List<String> index= new ArrayList<>(handles);
    String parent=index.get(0);
  //  String second=index.get(1);
   String webtable=driver.getTitle();
   System.out.println(webtable);
    driver.close();
    driver.switchTo().window(parent);
    System.out.println(driver.getTitle());
    driver.switchTo().frame("Page1");
    driver.findElement(By.xpath("//input[@id='frm1_un_id1']")).sendKeys(id);
    driver.findElement(By.xpath("//input[@id='frm1_pwd_id1']")).sendKeys(password);
    Thread.sleep(5000);
    driver.quit();
   // driver.findElement(By.xpath("//input[@id='chk1']")).click();
	}

}
