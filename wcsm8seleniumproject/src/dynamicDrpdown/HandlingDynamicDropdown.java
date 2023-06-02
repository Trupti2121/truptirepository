package dynamicDrpdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicDropdown {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	    
	   
	    WebElement dropdown = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	    dropdown.sendKeys("Admin");
	    //Select sel = new Select(dropdown);
	    
	    
	    //String optionToSelect = "Admin";
	    
	   // for(WebElement op:)
	}
}
