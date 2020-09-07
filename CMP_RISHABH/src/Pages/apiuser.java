package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class apiuser extends BaseTest{
	
	WebDriver driver;
	
	public apiuser(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//li[contains(@class,'tempTabSelected')]//a[contains(text(),'API User')]")
	WebElement APIUserModule;
	
	@FindBy(xpath="//input[@placeholder='Enter Search Text']")
	WebElement APISearchUser;
	
	@FindBy(xpath="//a[@id='searchButton']")
	WebElement APISearchButton;
	
	@FindBy(xpath="//i[@id='closeBtn']")
	WebElement CloseButton;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-custom-color cursor-pointer')]")
	WebElement CreateButton;
	
	@FindBy(xpath="//span[@class='k-input']")
	WebElement InputGroup;
	
	@FindBy(xpath="//input[@placeholder='ex. James or James@mail.com']")
	WebElement UsersName;
	
	@FindBy(xpath="//input[@placeholder='ex : James']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='ex : Doe']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@placeholder='ex : James@mail.com']")
	WebElement EmailId;
	
	@FindBy(xpath="//label[@for='viewcheck1']")
	WebElement AllAuthServices;
	
	@FindBy(xpath="//label[@for='viewcheck2']")
	WebElement AllSimServices;
	
	@FindBy(xpath="//label[@for='viewcheck3']")
	WebElement AllReportingServices;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement Submitbtn;
	
	@FindBy(xpath="(//i[@class='k-grid-Edit'])[1]")
	WebElement Edit;
	
	@FindBy(xpath="(//i[@class='k-grid-Delete'])[1]")
	WebElement Delete;
	
	@FindBy(xpath="//button[@class='k-button k-primary']")
	WebElement ConfirmDelete;
	
	@FindBy(xpath="(//i[@title='Reset Password'])[1]")
	WebElement ResetPassword;
	
	@FindBy(xpath="//input[@name='emailId']")
	WebElement InputEmailId;
	
	@FindBy(xpath="//a[@class='btn btn-custom-color cursor-pointer m-r-10 width-75']")
	WebElement SubmitMailId;

	@FindBy(xpath="(//a[@class='k-icon k-i-expand'])[1]")
	WebElement Expand;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	WebElement Close;
	
	
	public void APIUser() throws IOException, InterruptedException {
	
		APIUserModule.click();
		Thread.sleep(10000);
	}
	
	public void CreateAPIUser(String UserSearch, String Group, String usersname, String Firstname, String Lastname, String Emailid) throws IOException, InterruptedException {
		
		APISearchUser.clear();
		APISearchUser.sendKeys(UserSearch);
		APISearchButton.click();
		Thread.sleep(8000);
		CloseButton.click();
		Thread.sleep(8000);
		
		CreateButton.click();
		Thread.sleep(3000);
		
		Actions grp1=new Actions(driver);
		grp1.moveToElement(InputGroup).click().sendKeys(Group,Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		UsersName.sendKeys(usersname);
		Thread.sleep(1000);

		FirstName.sendKeys(Firstname);
		Thread.sleep(1000);
		
		LastName.sendKeys(Lastname);
		Thread.sleep(1000);
		
		EmailId.sendKeys(Emailid);
		Thread.sleep(1000);
		
		AllAuthServices.click();
		Thread.sleep(1000);
		
		AllSimServices.click();
		Thread.sleep(1000);
		
		AllReportingServices.click();
		Thread.sleep(1000);
		
		Submitbtn.click();
		System.out.println("API User Created Successfully");
		Thread.sleep(10000);
		
	}
	public void EditAPIUser(String editname) throws IOException, InterruptedException {
		
		
		Edit.click();
		FirstName.clear();
		FirstName.sendKeys(editname);
		Thread.sleep(3000);
		Submitbtn.click();
		Thread.sleep(8000);
	}
	
	public void DeleteAPIUser() throws IOException, InterruptedException {
		
		Delete.click();
		ConfirmDelete.click();
		Thread.sleep(10000);
		System.out.println("User Deleted Sucessfully");
		
	}
	
	public void ResetPassword_APIUser(String Emailid) throws IOException, InterruptedException {
		
		ResetPassword.click();
		InputEmailId.sendKeys(Emailid);
		SubmitMailId.click();
		Thread.sleep(10000);
	}
	
	public void Expand_APIUser() throws IOException, InterruptedException {
		
		Expand.click();
		Thread.sleep(10000);
		Close.click();
		
		
		
		
	}
}
