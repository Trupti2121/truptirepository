package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath4 {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");//input[@id='password']
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=' Login/Enrol']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='Email Address']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys("gfgf@gmail.com");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("me@22");
		Thread.sleep(2000);
		
		driver.quit();
}
}
	
