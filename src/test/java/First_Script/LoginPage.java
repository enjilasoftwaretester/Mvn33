package First_Script;

import org.testng.annotations.Test;

public class LoginPage 
{
  @Test
  public void EmailId() 
  {
	  System.out.println("User login with Email Id");
  }
  
  @Test
  public void MobileNo() 
  {
	  System.out.println("User otp is sent to mobile no");
  }
  
  @Test
  public void Submit() 
  {
	  System.out.println("User is able to click on Submit option ");
  }
}
