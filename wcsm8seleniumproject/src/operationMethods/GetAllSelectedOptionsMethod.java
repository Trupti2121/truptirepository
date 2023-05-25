package operationMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //for singlr select
		 driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/MultiSelectDropdown.html");
		 
		 WebElement dropdown = driver.findElement(By.name("menu"));
		 
		 Select sel = new Select(dropdown);
		 
		 //to select all select options
		 for(int i=0;i<3;i++)
		 {
			 sel.selectByIndex(i);
		 }
		 List<WebElement> allOptions = sel.getAllSelectedOptions();
		 for(WebElement op:allOptions)
		 {
			String option = op.getText();
			System.out.println(option);
		 }
	}

}
