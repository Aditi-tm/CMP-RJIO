package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class user extends BaseTest{
	
	WebDriver driver;
	
	public user(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//i[@class='fa custom-manu-icon admin-menu-icon']")
	WebElement UserIcon;
	
	@FindBy(xpath="//ul[@class='sub']//a[@class='selected'][contains(text(),'User')]")
	WebElement UserModule;
	
	@FindBy(xpath="//input[@placeholder='Enter Search Text']")
	WebElement SearchUser;
	
	@FindBy(css=".input-group-addon")
	WebElement SearchButton;
	
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
	
	@FindBy(xpath="//input[@placeholder='ex : (555) 555-5555']")
	WebElement TelephoneNumber;
	
	@FindBy(xpath="//input[@placeholder='ex : 123-456-7890']")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@placeholder='ex : James@mail.com']")
	WebElement EmailId;
	
	@FindBy(xpath="//input[@name='confirmEmailId']")
	WebElement ConfirmEmailId;
	
	@FindBy(xpath="//select[@name='roleSelectedValue']")
	WebElement SelectRole;
	
	@FindBy(xpath="//option[contains(text(),'HQ-11110044-OperationAdmin')]")
	WebElement SelectRoleValue;
	
	@FindBy(xpath="//select[@name='countrySelectedValue']")
	WebElement SelectCountry;
	
	@FindBy(xpath="(//option[contains(text(),'India')])[2]")
	WebElement SelectCountryValue;
	
	@FindBy(xpath="//a[contains(text(),'Submit')]")
	WebElement Submit;

	@FindBy(xpath="(//i[@title='Suspend User'])[1]")
	WebElement Suspend;
	
	@FindBy(xpath="//button[@class='k-button k-primary']")
	WebElement ConfirmSuspend;
	
	@FindBy(xpath="(//i[@class='k-grid-Edit'])[1]")
	WebElement Edit;
	
	@FindBy(xpath="(//i[@class='k-grid-ExtendedAccess'])[1]")
	WebElement ExtendedAccess;			
	
	@FindBy(xpath="//div[@class='css-1hwfws3']")
	WebElement SelectGroups;	
	
	@FindBy(xpath="//div[contains(@class,'css-1g6gooi')]")
	WebElement EnterGroup;
	
	@FindBy(xpath="//div[contains(@class,'css-1wy0on6')]//div[2]//*[local-name()='svg']")
	WebElement Arrow;
	
	@FindBy(css="input.btn:nth-child(2)")
	WebElement ExtendSubmit;
	
	@FindBy(xpath="(//i[@class='k-grid-Delete'])[1]")
	WebElement Delete;
	
	@FindBy(xpath="//button[@class='k-button k-primary']")
	WebElement ConfirmDelete;
	
	@FindBy(xpath="(//a[@class='k-icon k-i-expand'])[1]")
	WebElement Expand;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	WebElement Close;
	
	public void CreateUser(String Group, String usersname, String Firstname, String Lastname, String Telephonenumber, String Phonenumber, String Emailid) throws IOException, InterruptedException {
		
		Actions d=new Actions(driver);
		d.moveToElement(UserIcon).build().perform();
		UserModule.click();
		Thread.sleep(20000);
		
		CreateButton.click();
		Thread.sleep(20000);
		
		Actions grp=new Actions(driver);
		grp.moveToElement(InputGroup).click().sendKeys(Group,Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
		UsersName.sendKeys(usersname);
		Thread.sleep(1000);
		
		FirstName.sendKeys(Firstname);
		Thread.sleep(1000);
		
		LastName.sendKeys(Lastname);
		Thread.sleep(1000);
		
		TelephoneNumber.sendKeys(Telephonenumber);
		Thread.sleep(1000);
		
		PhoneNumber.sendKeys(Phonenumber);
		Thread.sleep(1000);
		
		EmailId.sendKeys(Emailid);
		Thread.sleep(1000);
		
		ConfirmEmailId.sendKeys(Emailid);
		Thread.sleep(1000);
		
		SelectRole.click();
		SelectRoleValue.click();
		Thread.sleep(1000);
		
		SelectCountry.click();
		SelectCountryValue.click();
		Thread.sleep(1000);
		
		Submit.click();
		Thread.sleep(7000);
		System.out.println("User Created Successfully");
	}
	
	public void SearchUser(String UserSearch) throws IOException, InterruptedException {
		
		SearchUser.clear();
		SearchUser.sendKeys(UserSearch);
		SearchButton.click();
		Thread.sleep(7000);
		CloseButton.click();
		Thread.sleep(7000);
	}
	
	public void SuspendAndEditUser(String editname) throws IOException, InterruptedException {
			
		Suspend.click();
		Thread.sleep(5000);
		ConfirmSuspend.click();
		System.out.println("User Locked Successfully");
		
		Edit.click();
		FirstName.clear();
		FirstName.sendKeys(editname);
		Thread.sleep(3000);
		
		Submit.click();
		Thread.sleep(12000);
	}
	
	public void ExtendAndDeleteUser(String GrpNameforExtend) throws IOException, InterruptedException {
		
		ExtendedAccess.click();
		Thread.sleep(5000);
		SelectGroups.click();
		EnterGroup.sendKeys(GrpNameforExtend,Keys.ENTER);
		Arrow.click();
		
		ExtendSubmit.click();
		Thread.sleep(8000);
		
		Delete.click();
		ConfirmDelete.click();
		Thread.sleep(10000);
		System.out.println("User Deleted Sucessfully");
		
		Expand.click();
		Thread.sleep(10000);
		Close.click();
		
		
		
	}
}
