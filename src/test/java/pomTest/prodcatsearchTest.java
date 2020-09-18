package pomTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.Browserfactory;
import pomPages.clsebay;

public class prodcatsearchTest {
  @Test
  public void f() 
  {
	WebDriver driver=Browserfactory.startbrowser("Chrome", "http://ebay.com");
	clsebay obj=new clsebay(driver);
	obj.fncatsearch("Cameras & Photo","Sony");
		Reporter.log("Ebay searched is successfull",true);
  }
}
