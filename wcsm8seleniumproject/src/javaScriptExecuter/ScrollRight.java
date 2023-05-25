package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		//TO PERFORM SCROLL RIGHT OPERATION
		Thread.sleep(2000);
		//explicit type casting
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		//scrolling right
		jsc.executeScript("window.scrollBy(3000,0)");
		
		//scrolling lft
		jsc.executeScript("window.scrollBy(-3000,0)");
	}

}
