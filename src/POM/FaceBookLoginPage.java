package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Generic.Base_page;

public class FaceBookLoginPage extends Base_page
{
  @FindBy(xpath="//input[@id='email']")
  private WebElement untbox;
  
  @FindBy(xpath="//input[@name='pass']")
  private WebElement pwdtbox;
  
  @FindBy(xpath="//button[.='Log In']")
  private WebElement login;
  
  @FindBy(xpath="//a[.='Sign up for an account.']")
  private WebElement errmsg;
  
  public FaceBookLoginPage(WebDriver driver)
  {
	 
	  super(driver);    
  }

  public void setusername(String un)
  {
	 untbox.sendKeys(un);   
  }

  public void setpassword(String pwd)
  {
	  pwdtbox.sendKeys(pwd);
	  
  }
  
  public void clicklogin()
  {
	  login.click();
  }
  
  public void verifyfacebookloginpage(String lp_title)
  {
	  verifytitle(lp_title);
  }
  
  public void verifyerrormessage()
  {
	  verifyelement(errmsg);
  }
  
}
