package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	//Method or annotation is enabled or disabled
  @Test(description = "Login method")
  public void method1() {
	  
	  Reporter.log("Login Performed!!",true);
  }
  
  @Test(enabled = false , description = "Logout method")
  public void method2()
  {
	  Reporter.log("Logout Performed!!",true);
  }
}
