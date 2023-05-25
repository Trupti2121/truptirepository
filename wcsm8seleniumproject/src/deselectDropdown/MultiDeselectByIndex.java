package deselectDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDeselectByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/MultiSelectDropdown.html");
		WebElement dropdowm = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdowm);
		for(int i=0;i<=8;i++)
		{
			if(i%2==0)
			{
				Thread.sleep(1000);
			    sel.selectByIndex(i);
			}
			else
			{
				System.out.println("It's an odd place");
			}
			
		}
		
		for(int i=0;i<=8;i++)
		{
			if(i%2==0)
			{
				Thread.sleep(1000);
			    sel.deselectByIndex(i);
			    //sel.deselectAll();
			}
			else
			{
				System.out.println("It's an odd place");
			}
		}
	}

}
