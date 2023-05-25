package operationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//for single select it will return false
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/SingleSelectDropdown.html");
		
		//for multi select it will rwturn true
		//driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/MultiSelectDropdown.html");
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdown);
		boolean verify = sel.isMultiple();
		
		System.out.println(verify);
		
	}

}
