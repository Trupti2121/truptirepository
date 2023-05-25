package set;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedHashsetClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/MultiSelectDropdown.html");
	    
	    WebElement dropdown = driver.findElement(By.name("menu"));
	    
	    Select sel = new Select(dropdown);
	    List<WebElement> allOptions = sel.getOptions();
	    
	    LinkedHashSet<String> lh = new LinkedHashSet<String>();
	    
	    for(int i=0;i<allOptions.size();i++)
	    {
	    	String op = allOptions.get(i).getText();
	    	lh.add(op);
	    }
	    
	    for(String options:lh)
	    {
	    	Thread.sleep(2000);
	    	System.out.println(options);
	    }
	}

}
