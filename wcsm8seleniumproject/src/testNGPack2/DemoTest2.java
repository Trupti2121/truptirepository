package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {
  @Test
  public void e() {
	  
	  Reporter.log("e method from DemoTest2",true);
  }
  
  @Test
  public void f()
  {
	  Reporter.log("f method from DemoTest2",true);
  }
  
  @Test
  public void f1()
  {
	  //create arithmetic exception
	  int i= 10;
	  int j = 0;
	  int k = i/j;
	  Reporter.log("f1 method from DemoTest2",true);
  }
}
