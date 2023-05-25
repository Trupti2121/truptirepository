package windowBasedPopup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of (ActiTime)
		driver.get("http://laptop-knl22f4g/login.do");

		// Handle login page with valid inputs
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		// HOME PAGE

		// click on Setting 

		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();

		//click on logo & color
		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();

		Thread.sleep(2000);
		// click on radio button
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		// click on choose file button
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));

		// create obj of Actions Class
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		//  Use this method for DoubleClick....
		act.doubleClick(target).perform();
	//	Thread.sleep(2000);

		// To Handle FileUplaod Pop up ....

//		File file = new File("./autoit/Fileup.exe");
//		String absolutePath = file.getAbsolutePath();
//		Thread.sleep(2000);
//		Runtime.getRuntime().exec(absolutePath);
//		Thread.sleep(2000);
//		Runtime.getRuntime().exec(absolutePath);
//


		// close the browser
			driver.quit();






	}


}
