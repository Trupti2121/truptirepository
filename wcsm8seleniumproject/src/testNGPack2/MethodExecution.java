package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExecution {
  @Test
  public void method1() {
	  
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId +" : is the thread id of Method",true);
	  Reporter.log("method1");
	  
  }
  
  @Test
public void method2() {
	  
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId +" : is the thread id of Method",true);
	  Reporter.log("method2");
  }
}
