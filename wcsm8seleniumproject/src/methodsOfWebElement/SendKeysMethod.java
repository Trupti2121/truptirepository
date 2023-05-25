package methodsOfWebElement;

//import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-iceiogc/login.do");
		
		WebElement userNameTB = driver.findElement(By.name("username"));
		userNameTB.sendKeys("admin123");
		
	    WebElement passWordTB = driver.findElement(By.name("pwd"));
	    passWordTB.sendKeys("manager123");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

}
