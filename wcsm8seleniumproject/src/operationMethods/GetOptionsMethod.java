package operationMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/SingleSelectDropdown.html");
		
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/MultiSelectDropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdown);
		
		List<WebElement> allOptions = sel.getOptions();
		
		//to read webelement we use for loop or advanced for loop
		//for(int i = 0 ; i<allOptions.size();i++)
		//{
		//	String option = allOptions.get(i).getText();
			//System.out.println(option);
			
		//}
		
		for(WebElement op:allOptions)
		{
			String options = op.getText();
			System.out.println(options);
		}
	}
}






