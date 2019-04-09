package TestScripts;

import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Excel;
import POM.FaceBookLoginPage;


public class InvalidLogin extends Base_Test
{
	
  @Test	
  public void facebookinvalidlogin() throws InterruptedException
  {
  FaceBookLoginPage lp=new FaceBookLoginPage(driver);
  
  String un=Excel.getcellvalue(PATH, "invalidlogin", 1, 0);
  
  lp.setusername(un);
  
  Thread.sleep(3000);
  
  String pwd=Excel.getcellvalue(PATH, "invalidlogin", 1, 1);
  
  lp.setpassword(pwd);
  
  Thread.sleep(3000);
  
  lp.clicklogin();
  
  Thread.sleep(3000);
  
  lp.verifyerrormessage();
  
  }
}
