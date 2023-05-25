package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	
	static WebDriver driver;
	@Parameters({"browser","url","VUsername","VPassword"})	
  @Test
 
  public void method1(String browser,String url,String usn , String pwd) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.id("loginButton")).click();
		}
		
	   else if(browser.equalsIgnoreCase("Edge"))
	   {
		   System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		   driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.id("loginButton")).click();
	   }
	   
	   else
	   {
			System.out.println("invalid browser!!");
		}
  }
}
