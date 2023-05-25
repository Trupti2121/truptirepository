package deselectDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByGetText {

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
			    sel.selectByVisibleText("Wadapav");
			    Thread.sleep(1000);	    
			    sel.selectByVisibleText("Maggie");
		}
		
		//Deselect the options
		for(int i=0;i<=8;i++)
		{
			    sel.deselectByVisibleText("Maggie");
			    Thread.sleep(1000);
			    sel.deselectByVisibleText("Wadapav");
			    //sel.deselectAll();
		}
	}

}
