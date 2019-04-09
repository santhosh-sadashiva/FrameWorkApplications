package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Generic.Base_page;

public class FaceBookHomePage extends Base_page
{
  //Declaration
	
	@FindBy(xpath="//div[@id='userNavigationLabel']")
	private WebElement acc_set;
	
	@FindBy(xpath="//li[.='Log Out']")
	private WebElement logout;
	
	//Initialization
	public FaceBookHomePage(WebDriver driver) 
	{
		super(driver);
		
	}

	//Utilization
	
	public void clickacc_settings()
	{
		acc_set.click();
	}
	
	public void clicklogout()
	{
		logout.click();
	}	
	
	public void verifyhomepage(String hp_titile)
	{
		verifytitle(hp_titile);
		
	}
}
