package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("http://desktop-iceiogc/login.do");
		
		WebElement CheckBox = driver.findElement(By.name("remember"));
		boolean verify = CheckBox.isSelected();
		System.out.println(verify);
		
        CheckBox.click();
        
        boolean verify1 = CheckBox.isSelected();
        System.out.println(verify1);
	}

}
