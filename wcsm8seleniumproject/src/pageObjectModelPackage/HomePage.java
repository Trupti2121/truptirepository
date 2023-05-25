package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 
	//store all webelements of login page
		//declare with @FindBy annotation
	@FindBy(xpath = "//a[.='Logout']") private WebElement LogoutLink;
	@FindBy(xpath = "//A[@class='content administration']/IMG[@class='sizer']") private WebElement SettingButton;
	@FindBy(xpath = "//A[@class='content users']/IMG[@class='sizer']") private WebElement Users;
	@FindBy(xpath = "//A[@class='content reports']/IMG[@class='sizer']") private WebElement Reports;
	@FindBy(xpath = "//A[@class='content reports']/IMG[@class='sizer']") private WebElement Task;
	@FindBy(xpath = "//A[@class='content tt_selected selected']/DIV[2]/IMG") private WebElement TimeTrack;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getLoginButton() {
		return LogoutLink;
	}

	public WebElement getSettingButton() {
		return SettingButton;
	}

	public WebElement getUsers() {
		return Users;
	}

	public WebElement getReports() {
		return Reports;
	}

	public WebElement getTask() {
		return Task;
	}

	public WebElement getTimeTrack() {
		return TimeTrack;
	}
	
	//operational Method
	public void logOutMethod()
	{
		LogoutLink.click();
		
	}
	
	public void Users()
	{
		Users.click();
	}
}
