package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentOnId {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("dgwjdgk");
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_password")).sendKeys("12344sfefh");
		Thread.sleep(2000);

	    driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

}

