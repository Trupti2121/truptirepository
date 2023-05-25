package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	@FindBy(xpath="//input[@value='Create New User']") private WebElement CreateNewUser;
	@FindBy(xpath="//*[@name='username']") private WebElement usernameTB;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath = "//*[@name='passwordTextRetype']") WebElement PasswordRetype;
	@FindBy(xpath = "//*[@name='firstName']") WebElement FirstName;
	@FindBy(xpath = "//*[@name='lastName']") WebElement LastName;
	
	@FindBy(xpath = "//input[@type='submit']") WebElement CreateUser;
	//@FindBy(xpath = "//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") WebElement CancelButton;

	@FindBy(xpath = "//a[contains(.,'A, Developer (TestEngg') and contains(.,')')]") WebElement CreatedUserLink;
	@FindBy(xpath = "//input[@value='Delete This User']") WebElement DeleteUserButton ;
	
	
	//INITIIALIZATION
	public UserListPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
	
	//utilization
	public WebElement getCreateNewUser() {
		return CreateNewUser;
	}
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getPasswordRetype() {
		return PasswordRetype;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getCreateUser() {
		return CreateUser;
	}
	
	public WebElement getCreatedUserLink() {
		return CreatedUserLink;
	}
	public WebElement getDeleteUserButton() {
		return DeleteUserButton;
	}
	
	//operational methods
	public void createUserButton(String usn,String pass,String Fn,String Ln) throws InterruptedException
	{
		CreateNewUser.click();
		Thread.sleep(2000);
		usernameTB.sendKeys(usn);
		Thread.sleep(2000);
		passwordTB.sendKeys(pass);
		Thread.sleep(2000);
		PasswordRetype.sendKeys(pass);
		Thread.sleep(2000);
		FirstName.sendKeys(Fn);
		Thread.sleep(2000);
		LastName.sendKeys(Ln);
		Thread.sleep(2000);
		CreateUser.click();
	}
	
	public void deleteUserMethod() throws InterruptedException
	 {
		 CreatedUserLink.click();
		 Thread.sleep(1000);
		 DeleteUserButton.click();
	     WorkLib wl = new WorkLib();
	     wl.handleConfirmationPopup();
	 }
}
