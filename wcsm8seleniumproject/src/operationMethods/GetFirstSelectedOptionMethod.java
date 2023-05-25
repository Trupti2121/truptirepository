package operationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //for singlr select
		 driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/MultiSelectDropdown.html");
		 
		 WebElement dropdown = driver.findElement(By.name("menu"));
		 
		 Select sel = new Select(dropdown);
		 
		 for(int i =3;i<6;i++)
		 {
			 sel.selectByIndex(i);
		 }
		 
		 Thread.sleep(2000);
		 WebElement firstOption = sel.getFirstSelectedOption();
		 String value = firstOption.getText();
		 System.out.println(value);
		 
		 //to select FIRST selected option
		 //WebElement dropdown = driver.findElement(By.name("menu"));
			
			//Select sel = new Select(dropdown);
			//if()
		 
	}

}
