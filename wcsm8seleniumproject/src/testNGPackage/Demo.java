package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test				//instead of main method we are using @Test annotation
  public void demoMethod() {
	  
	  //System.out.println("Hello TestNG!!!");
	  Reporter.log("Hello TestNG!!!",true);
  }
  
  //@Test
  //public void g()
  //{
	  //System.out.println("Hey Java!");
	 // Reporter.log("HEY Java!!!",true);
  //}
}
