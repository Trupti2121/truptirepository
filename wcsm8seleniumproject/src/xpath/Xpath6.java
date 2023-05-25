package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath6 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in/subscribe/my-account");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Have a Facebook/Email account?']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='emailID']")).sendKeys("truptidesale54@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
		Thread.sleep(2000);
		
		driver.quit();
			
	}

}
