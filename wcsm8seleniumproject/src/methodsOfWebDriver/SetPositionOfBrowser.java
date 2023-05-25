package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetPositionOfBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to avoid illegal state exception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//upcasting
		WebDriver driver = new ChromeDriver(co); 
	    driver.manage().window().maximize();
	    
	    Dimension targetSize = new Dimension(450,350);
        Thread.sleep(2000);
        driver.manage().window().setSize(targetSize);
        
	    Point targetPosition = new Point(450,350);
	    Thread.sleep(2000);
	    driver.manage().window().setPosition(targetPosition);
	}

}
