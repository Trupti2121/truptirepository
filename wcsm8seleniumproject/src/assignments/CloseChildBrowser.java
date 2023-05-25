package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		
		Point point = link.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
		
		//handle address of current/parent window
		String parentHandle = driver.getWindowHandle();
		//System.out.println("handle of parent window : " +parentHandle);
		
		//click on link and get child window
		link.click();
		Thread.sleep(2000);
	    
		//to close child browser only
		Set<String> allHandles = driver.getWindowHandles();
		
		//
		for(String wh : allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh).close();
			}
		}
	}

}
