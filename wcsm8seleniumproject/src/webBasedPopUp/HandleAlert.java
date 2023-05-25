package webBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/Alert.html");
		
		//generate alert popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='click me!']")).click();
		
		//handle alert
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		//al.accept();
		System.out.println(al.getText());
		al.dismiss();
	}

}
