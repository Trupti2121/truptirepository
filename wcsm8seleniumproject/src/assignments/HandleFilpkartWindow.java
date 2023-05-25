package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFilpkartWindow {
	
	public static void main(String[] args) throws InterruptedException {
	     
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//handle of parent window
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
		
		//handle of parent and child window
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh : allHandles)
		{
		     if(!parentHandle.equals(wh))
		     {
		    	 //transfer the control to child window
		    	 driver.switchTo().window(wh);
		     }
		     else
		     {
		    	 
		     }
		}
		
		String actualTitle = driver.getTitle();
		if(actualTitle.equals("SAMSUNG Galaxy S23 Ultra 5G ( 256 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com"))
		{
			System.out.println("Its a child window");
		}
		else
		{
			System.out.println("Window is not handled");
		}
		
		WebElement scrollTillThisWebElement = driver.findElement(By.xpath("//span[text()='View Details']"));
		Point point = scrollTillThisWebElement.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']")).click();
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='512 GB']")).click();
		Thread.sleep(4000);
		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("411027");
		
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);
		
		WebElement removeButton = driver.findElement(By.xpath("//div[text()='Remove']"));
		Point point1 = removeButton.getLocation();
		int xaxis1 = point1.getX();
		int yaxis1 = point1.getY();
		
		jse.executeScript("window.scrollBy("+xaxis1+","+(yaxis1-250)+")");
		removeButton.click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
	}
}
