package TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.Test;
import Generic.Base_Test;
import Generic.Excel;
import POM.FaceBookHomePage;
import POM.FaceBookLoginPage;


public class FaceBookTestLogin extends Base_Test
{
 
  @Test
  public void facebooklogin() throws InterruptedException, AWTException
  {
	 
	 FaceBookLoginPage lp=new FaceBookLoginPage(driver);
	  
	 Thread.sleep(3000);
	 
	 //lp.setusername("santhosh_hassan@rediffmail.com");
	 
	 ////Fetch the username from the excel sheet
	 String un=Excel.getcellvalue(PATH, "validloginlogout",1,0);
	 
	 lp.setusername(un);
	 
	 Thread.sleep(3000);
	 
	// lp.setpassword("motherlove");
	 
	 //Fetch the password from the excel sheet
	 String pwd=Excel.getcellvalue(PATH, "validloginlogout",1,1);
	 
	 //// To Verify the Login page title
	 String lp_title=Excel.getcellvalue(PATH, "validloginlogout",1,2);
	 
	 lp.verifyfacebookloginpage(lp_title);
	 
	 lp.setpassword(pwd);

	 Thread.sleep(3000);
	 
	 lp.clicklogin();
	 
	 Thread.sleep(3000);
	 
	 Robot r=new Robot();
	 
	 r.keyPress(KeyEvent.VK_ESCAPE);
	 
	 r.keyRelease(KeyEvent.VK_ESCAPE);
	 
	 FaceBookHomePage hp=new FaceBookHomePage(driver);
	 
	 // To Verify the Home page title
	 String hp_titile=Excel.getcellvalue(PATH, "validloginlogout",1,3);
	 
	 hp.verifyhomepage(hp_titile);
	 
	 hp.clickacc_settings();
	 
	 Thread.sleep(3000);

	 hp.clicklogout();
	 
	 Thread.sleep(3000);
	 
  }
}
