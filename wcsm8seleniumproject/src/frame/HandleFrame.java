package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/Frame.html");
		Thread.sleep(2000);
		
		WebElement usernameTB = driver.findElement(By.id("i2"));
		usernameTB.sendKeys("admin");  //username TB
		
		WebElement frameElement = driver.findElement(By.name("frname"));
		
		//driver.switchTo().frame(0);  //by using index value
		
		//driver.switchTo().frame("frname");  //handle by using name eor id
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		
		WebElement passwordTB = driver.findElement(By.id("i1"));
		passwordTB.sendKeys("manager");   //password TB
		
		Thread.sleep(2000);
		passwordTB.clear();
		Thread.sleep(2000);
		
		//switch control to parent
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		usernameTB.clear();
	}
}
