package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
	// Store all the webelement of login page 
	
		// declare with @FindBy annotation
	@FindBy(name = "username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(linkText = "Actimind Inc.") private WebElement actiMindLink;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	
	//operational methods
	 public void validLogin(String validUsername,String validPassword)
     {
    	 usernameTB.sendKeys(validUsername);
    	 passwordTB.sendKeys(validPassword);
    	 loginButton.click();
     }
     
     public void inValidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
     {
    	 usernameTB.sendKeys(invalidUsername);
    	 passwordTB.sendKeys(invalidPassword);
    	 loginButton.click();
    	 Thread.sleep(2000);
    	 usernameTB.clear();
     }
}
