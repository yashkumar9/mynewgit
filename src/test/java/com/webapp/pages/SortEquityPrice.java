package com.webapp.pages;

import com.webapp.commonDef.CommonDef;
import com.automation.core.testng.reporter.CustomReporter;
import com.automation.core.utils.reporter.Report;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class SortEquityPrice 
{

	public SortEquityPrice() {}
	static By codeBy= By.xpath("//*[@id='pills-active']/table/tbody/tr/td[1]");
	static By nameBy= By.xpath("//*[@id='pills-active']/table/tbody/tr/th/div/a");
	static By changeBy=	By.xpath("//*[@id='pills-active']/table/tbody/tr/td[3]");
	static By volBy= By.xpath("//*[@id='pills-active']/table/tbody/tr/td[4]");
	static By closeBy= By.xpath("//a[text()='Close']");
	static By mostActiveBy= By.xpath("(//a[@class='nav-link btn btn-effect btn-white active' and @id='pills-active-tab'])[1]");
	// Method to enter the user Data
	public static boolean equityPageValidation() throws IOException {
		List<String> arr=new ArrayList<>();
		List<Double>	doub=new ArrayList<>();
		List<String> sorted=new ArrayList<>();
		try {
			CommonDef.click(closeBy);
			CommonDef.moveToElement(mostActiveBy);
			List<WebElement> Code=CommonDef.getCurrentDriver().findElements(codeBy);
			List<WebElement> Name=CommonDef.getCurrentDriver().findElements(nameBy);
			List<WebElement> Change=CommonDef.getCurrentDriver().findElements(changeBy);
			List<WebElement> Vol=CommonDef.getCurrentDriver().findElements(volBy);

			
			for(int m=0;m<Change.size();m++) {
				arr.add(Change.get(m).getText());
			}
		
			for(int j=0;j<Change.size();j++) {
				String str =Change.get(j).getText();
				if(!(str.length()==1)) {
					double d=Double.parseDouble(str);

					doub.add(d);
				}
			}
			Collections.sort(doub);
			Collections.reverse(doub);
			
			for(int k=0;k<doub.size();k++) {
				   String str1= new DecimalFormat("#0.000#").format(doub.get(k));
				  
				   if(str1.charAt(0)!='-'){
					   str1="+"+str1;
					  
				   sorted.add(str1);
				   }else {
					   sorted.add(str1);
				   }
			   }
			
			for(int n=sorted.size();n<10;n++) {
				
				sorted.add(n,"-");
			}

			for(int i=0;i<Change.size();i++) {
				boolean con=false;
				int index=0;
				//int count=0;
				//List<String> set=new ArrayList<>();
				for(int j=0;j<Change.size();j++) {

					//	System.out.println(sorted.get(i)+" "+arr.get(j));
					if(sorted.get(i).equals(arr.get(j))) {
						index=j;
						arr.set(index, null);
						con=true;
						break;
					}

				}if(con) {
					System.out.println(Code.get(index).getText()+" | "+Name.get(index).getText()+" | "+ sorted.get(i)+" | " +Vol.get(index).getText());
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}		
		return true;

	}
}

			
			