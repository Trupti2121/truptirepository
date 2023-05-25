package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NameLocator {
	
	public static void main(String[] args) throws InterruptedException {
	  
		//to avoid illegal state exception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
		//to avoid connection failed exception
		co.addArguments("--remote-allow-origins=*");
		
		//upcasting
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=10nubo4s9nv8q"); 
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginButton")).click();
	
	}

}
