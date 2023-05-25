package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeTestCase2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-iceiogc/login.do");
		
		String loginPageTitle = driver.getTitle();
		if(waitMethod(driver,30 , loginPageTitle))
		{
			System.out.println("Login page title is matched!! Test case passed");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		}
		else
		{
			System.out.println("Login page title is not matched!! Test case failed");
		}
		String homePageTitle = driver.getTitle();
		if (waitMethod(driver , 30 , homePageTitle)) 
		{
			System.out.println("Home page title is matched!! Test case passed");	
		}
		else
		{
			System.out.println("Home page title is not matched!! Test case failed");
		}
		
}

	private static Boolean waitMethod(WebDriver driver, int sec, String Title) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Boolean titleOfPage = wait.until(ExpectedConditions.titleContains(Title));
		return titleOfPage;
	}
}
