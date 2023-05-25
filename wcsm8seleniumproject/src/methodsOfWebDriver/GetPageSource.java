package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSource {
	
	public static void main(String[] args) {
		
		//to handle illegal state exception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    
	    WebDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.instagram.com/");
	    String scode = driver.getPageSource();
	    System.out.println(scode);
	
	}

}
