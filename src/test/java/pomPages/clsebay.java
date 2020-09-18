package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class clsebay 
{
	public WebDriver wd;
	
	public clsebay(WebDriver d)
	{
		wd=d;
	}
	
	By txtsearch=By.id("gh-ac");
	By btnsearch=By.id("gh-btn");
	By ddvalue=By.id("gh-cat");
	
	public void fnsearch(String prod)
	{
		wd.findElement(txtsearch).sendKeys(prod);
		wd.findElement(btnsearch).click();
		
	}
	public void fncatsearch(String cat,String prod)
	{
		Select s=new Select(wd.findElement(ddvalue));
		s.selectByVisibleText(cat);
		fnsearch( prod);
		
		
	}

}
