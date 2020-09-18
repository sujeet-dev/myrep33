package HybridFramework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.Browserfactory;
import pomPages.Getdata;
import pomPages.clsebay;

public class hybridprodSearchTest
{
	 @Test(dataProvider = "ebaysearch")
	  public void Search(String ddvalue,String txtvalue)
	  {
		WebDriver driver=Browserfactory.startbrowser("Chrome","http://ebay.com");
		  
			clsebay obj=new clsebay(driver);
			obj.fnsearch(txtvalue);
	  }

	  @DataProvider
	  public Object[][] ebaysearch() throws IOException
	  {
		  Object[][] mydata=Getdata.getExceldata(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\EbaySearch.xlsx");
		  return mydata;
	    
	  }
	}
