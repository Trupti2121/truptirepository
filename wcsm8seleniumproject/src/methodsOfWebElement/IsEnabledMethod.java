package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.instagram.com/");
		
	    WebElement loginButton = driver.findElement(By.xpath("//button[@class=\"_acan _acap _acas _aj1-\"]"));
	    
	    boolean verifyButton = loginButton.isEnabled();
	    System.out.println(verifyButton);
	    
	    driver.findElement(By.name("username")).sendKeys("ewrey@12");
	    driver.findElement(By.name("password")).sendKeys("jh@7437");
	    
	    boolean verify = loginButton.isEnabled();
	    System.out.println(verify);
	}

}
