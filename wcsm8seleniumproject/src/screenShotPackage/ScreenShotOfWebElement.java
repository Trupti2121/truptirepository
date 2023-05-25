package screenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//consider we are taking ss of selenium.dev
		driver.get("https://www.selenium.dev");
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//implementation of method
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/ss2.png");
		
		Files.copy(src, dest);
	}

}
