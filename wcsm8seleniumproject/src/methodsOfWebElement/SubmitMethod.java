package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/");
		
	    driver.findElement(By.name("username")).sendKeys("ejuj@44");
		driver.findElement(By.name("password")).sendKeys("365qfwtq");
				
		WebElement button = driver.findElement(By.xpath("//button[@class=\"_acan _acap _acas _aj1-\"]"));
		button.submit();
		
		//driver.findElement(By.xpath("//button[@class=\"_acan _acap _acas _aj1-\"]")).submit();
	}
}
