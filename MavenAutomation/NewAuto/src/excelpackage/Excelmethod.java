package excelpackage;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excelmethod extends XLUtils {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//		XLUtils q=new XLUtils();
		String file="C:\\MavenAutomation\\NewAuto\\excel\\Book1.xlsx";
		//		//String file1="C:\\MavenAutomation\\NewAuto\\excel\\output.xlsx";
		//		WebDriver driver=new FirefoxDriver();
		//		Thread.sleep(500);
		//		driver.get("file:///C:/Page1.html");
		//		System.out.println(q.getRowCount(file, "r"));
		//		for(int i=1;i<=q.getRowCount(file, "r");i++)
		//		{
		//			
		//		driver.findElement(By.xpath("//input[@id='frm1_un_id1']")).clear();
		//		driver.findElement(By.xpath("//input[@id='frm1_un_id1']")).sendKeys(q.getStringCellData(file, "r", i, 0));
		//		driver.findElement(By.xpath("//input[@id='frm1_pwd_id1']")).clear();
		//		driver.findElement(By.xpath("//input[@id='frm1_pwd_id1']")).sendKeys(q.getStringCellData(file, "r", i, 1));
		//		Thread.sleep(5000);
		//		}
		//		q.setCellData(file,"r",3, 0, "pass");
//		System.out.println(getStringCellData(file, "r", 1, 1));
//		for(int i=1;i<getRowCount(file, "r");i++) {	
//				if(getStringCellData(file, "r", i, 1).equalsIgnoreCase("pass")) {
//					fillGreenColor(file, "r", i, 1);	
//					//setCellData(file, "r", i, 2, "good");
//					
//			}
//				else {
//					fillRedColor(file, "r", i, 1);
//					
//				}
//		}
		  Cell c=getCellvalue(file, "r", 1, 0);
     DataFormatter ddt=new DataFormatter();
       Object ob=ddt.formatCellValue(c);
       System.out.println(ob);







		}

	}
