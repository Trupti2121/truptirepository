package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.netflix.com/in/Login");
		WebElement usernameTB = driver.findElement(By.name("userLoginId"));
		
		WebElement passwordTB = driver.findElement(By.name("password"));
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		if (usernameTB.isDisplayed()) {
			usernameTB.sendKeys("tqrytt244");
		}
		else
		{
			System.out.println("will get exception");
		}
		
		if (passwordTB.isDisplayed()) {
			passwordTB.sendKeys("hd8237@1");
		}
		else
		{
			System.out.println("will get exception");
		}
		if (button.isDisplayed()) {
			button.click();
		}
		else
		{
			System.out.println("will get exception");
		}
	}

}




