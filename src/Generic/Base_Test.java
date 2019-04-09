package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_Const
{
  public WebDriver driver;
  
  static
  {
	  System.setProperty(GECKO_KEY, GECKO_VALUE);
  }
	
  @BeforeMethod
  public void OpenApplication()
  {
	driver=new FirefoxDriver();
	
	driver.get("https://en-gb.facebook.com/login/");
  }
	
  @AfterMethod
  public void CloseApplication()
  {
	  driver.quit();
  }
	
}
