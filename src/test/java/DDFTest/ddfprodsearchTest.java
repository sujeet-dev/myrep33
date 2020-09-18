package DDFTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class ddfprodsearchTest 
{
  @Test(dataProvider = "ebaysearch")
  public void Search(String ddvalue,String txtvalue)
  {
	  WebDriverManager.chromedriver().version("85").setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  
		driver.findElement(By.id("gh-ac")).sendKeys(txtvalue);
		driver.findElement(By.id("gh-btn")).click();
		Reporter.log("Ebay searched is successfull",true);
  }

  @DataProvider
  public Object[][] ebaysearch() throws IOException
  {
	  Object[][] mydata=null;
	  
	  XSSFWorkbook wb=new XSSFWorkbook(System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\EbaySearch.xlsx");
	  XSSFSheet ws=wb.getSheet("Sheet1");
	  int rows=ws.getPhysicalNumberOfRows();
	  
	  mydata=new Object[rows][2];
	  for(int i=0;i<rows;i++)
	  {
		  mydata[i][0]=ws.getRow(i).getCell(0).getStringCellValue();
		  mydata[i][1]=ws.getRow(i).getCell(1).getStringCellValue();
	  }
	  return mydata;
    
  }
}
