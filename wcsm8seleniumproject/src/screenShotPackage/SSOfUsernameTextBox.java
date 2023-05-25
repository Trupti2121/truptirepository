package screenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SSOfUsernameTextBox {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://instagram.com");
		
		WebElement textBox = driver.findElement(By.xpath("//span[text()='Phone number, username, or email']"));
		
		    
			File src = textBox.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShots/textboxss.png");
					
			Files.copy(src,dest);
		}
}

