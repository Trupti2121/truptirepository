package webBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrievr.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/Confirmation.html");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		al.accept();
		String text = al.getText();
		System.out.println(text);
	}

}
