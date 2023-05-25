package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://instagram.com");
		
		//to perform up scrolling operation
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		
		//scroll down
		jsc.executeScript("window.scrollBy(0,950)");
		Thread.sleep(2000);
		
		//scroll up
		jsc.executeScript("window.scrollBy(0,-950)");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
