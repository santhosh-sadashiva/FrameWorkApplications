package Generic;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public abstract class Base_page
{
  public WebDriver driver;
  
  public Base_page(WebDriver driver)
  {
	  this.driver=driver;
	  
	  //PageFactory.initElements(driver,this);
      PageFactory.initElements(driver,this); 
  }
  
	
 public void verifytitle(String title)
 {
	 WebDriverWait wait=new WebDriverWait(driver,10);
	 
	 try
	 {
		 wait.until(ExpectedConditions.titleContains(title));
		 
		 Reporter.log("The title is matching",true);	 
	 }
	 catch(Exception e)
	 {
		 Reporter.log("The title is not matching",true);
		 Assert.fail();	 
	 }
 }
	
public void verifyelement(WebElement element)
{
	 WebDriverWait wait=new WebDriverWait(driver,10);
	 
	 try
	 {
		 wait.until(ExpectedConditions.visibilityOf(element));
		 
		 Reporter.log("Element is present",true);
	 }
	 catch(Exception e)
	 {
		 Reporter.log("Element is not present",true);
		 
		 Assert.fail();
		 
	 }
}
 
 
 
 
 
 
 
}
