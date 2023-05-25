package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://instagram.com");
		
		//to perform scrolling operations...
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		jsc.executeScript("window.scrollBy(0,350)");
	}

}
