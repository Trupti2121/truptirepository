package set;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSetClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/WCSM8/MultiSelectDropdown.html");
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		//to handle dropdown create obj of select class
		Select sel = new Select(dropdown);
	    
	    //to get all the options from dropdown
		 List<WebElement> allOptions = sel.getOptions(); 
		 
	    //to eleiminate duplicate and maintain insertion order
	    TreeSet<String> ts = new TreeSet<String>();
	    
	    //to read list by eleminating duplicates
	    for(int i=0;i<allOptions.size();i++)
	    {
	    	//get text and options of options
	    	String op = allOptions.get(i).getText();
	    	
	    	//add text of options to treeset
	    	ts.add(op);
	    }
	    
	    //to read options from set
	    for(String options:ts)
	    {
	    	Thread.sleep(2000);
	    	System.out.println(options);
	    }
	}

}
