package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleBluestoneFrame {

	//fc_widget
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(2000);
		
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		//switch the controls to frame for click on chatbox
		driver.switchTo().frame("fc_widget");  //by using name or id
		
		//driver.switchTo().frame(frameElement);  //by using frame element
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
		
		//switch the control to default webpage
		driver.switchTo().defaultContent();
		
		//insert inputs for textbox
		driver.findElement(By.id("chat-fc-name")).sendKeys("Trupti");
		driver.findElement(By.id("chat-fc-email")).sendKeys("acs@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("6423631890");
		
		//driver.findElement(By.xpath("//a[@class='fc-button']")).click();
	}

}