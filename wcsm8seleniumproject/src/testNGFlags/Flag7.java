package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	
  @Test(groups = "Functional Testing")
  public void ftc1() {
	  
	  Reporter.log("FTC1" ,true);
  }
  @Test(groups  ="Integration Testing")
  public void itc1()
  {
	  Reporter.log("ITC1",true);
  }
  @Test(groups  ="Smoke Testing")
  public void stc1()
  {
	  Reporter.log("STC1",true);
  }
  
  //------------------------------------------------------------------------------
  
  @Test(groups = "Functional Testing")
  public void ftc2() {
	  
	  Reporter.log("FTC2" ,true);
  }
  @Test(groups  ="Integration Testing")
  public void itc2()
  {
	  Reporter.log("ITC2",true);
  }
  @Test(groups  ="Smoke Testing")
  public void stc2()
  {
	  Reporter.log("STC2",true);
  }
  
  //------------------------------------------------
   
  @Test(groups = "Functional Testing")
  public void ftc3() {
	  
	  Reporter.log("FTC3" ,true);
  }
  @Test(groups  ="Integration Testing")
  public void itc3()
  {
	  Reporter.log("ITC3",true);
  }
  @Test(groups  ="Smoke Testing")
  public void stc3()
  {
	  Reporter.log("STC3",true);
  }
  
  //------------------------------------------------------------------
  
  @Test(groups = "Functional Testing")
  public void ftc4() {
	  
	  Reporter.log("FTC4" ,true);
  }
  @Test(groups  ="Integration Testing")
  public void itc4()
  {
	  Reporter.log("ITC4",true);
  }
  @Test(groups  ="Smoke Testing")
  public void stc4()
  {
	  Reporter.log("STC4",true);
  }
  
  //-------------------------------------------------------------------------
  
  @Test(groups = "Functional Testing")
  public void ftc5() {
	  
	  Reporter.log("FTC5" ,true);
  }
  @Test(groups  ="Integration Testing")
  public void itc5()
  {
	  Reporter.log("ITC5",true);
  }
  @Test(groups  ="Smoke Testing")
  public void stc5()
  {
	  Reporter.log("STC5",true);
  }
  
  //---------------------------------------------------------------------
  
  @Test(groups = "Functional Testing")
  public void ftc6() {
	  
	  Reporter.log("FTC6" ,true);
  }
  @Test(groups  ="Integration Testing")
  public void itc6()
  {
	  Reporter.log("ITC6",true);
  }
  @Test(groups  ="Smoke Testing")
  public void stc6()
  {
	  Reporter.log("STC6",true);
  }
  
  //---------------------------------------------------------------------------
}
