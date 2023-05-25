package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnSelect {
	
	//select dropdown witout using select method
	
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//for single select 
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/SingleSelectDropdown.html");
	
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdown);
		
		//to get all the options from dropdown
		List<WebElement> allOptions = sel.getOptions();
		
		//select option by using click() method
		for(WebElement op:allOptions)
		{
			if(op.getText().equals("Chakali"))
			{
				Thread.sleep(2000);
				op.click();
				break;
			}
		}
	}

}
