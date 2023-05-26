package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
	//execute annotations or methods according to priority
  @Test
  public void f() {
	  
	  Reporter.log("f Method!!",true);
  }
  
  @Test
  public void a() {
	  
	  Reporter.log("a Method!!",true);
  }
  
  @Test
  public void g() {
	  
	  Reporter.log("g Method!!",true);
  }
  
  @Test
  public void m() {
	  
	  Reporter.log("m Method!!",true);
  }
  
  @Test(priority = -1)
  public void p() {
	  
	  Reporter.log("p Method!!",true);
  }
  
  @Test(priority = 1)
  public void e() {
	  
	  Reporter.log("e Method!!",true);
  }
  
  @Test
  public void z() {
	  
	  Reporter.log("z Method!!",true);
  }
  
  @Test(priority = 1)
  public void k() {
	  
	  Reporter.log("k Method!!",true);
  }
}
