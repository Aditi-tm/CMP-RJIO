package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class group extends BaseTest 
{

WebDriver driver;
	
	public group(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//a[@href='/ManageAccount'])[2]")
	WebElement GroupPage;	
	
	@FindBy(xpath="//input[@placeholder='Enter Search Text']")
	WebElement InputAccount;	
	
	@FindBy(xpath="//a[@id='searchButton']")
	WebElement SearchGrp;	
	
	@FindBy(xpath="//i[@id='closeBtn']")
	WebElement CloseButton;
	
	@FindBy(xpath="//a[@href='/CreateAccount']")
	WebElement CreateGroup;
	
	@FindBy(xpath="//span[@class='k-input']")
	WebElement InputGroup;
	
	@FindBy(xpath="//input[@placeholder='Enter Group Name']")
	WebElement InputNewGroup;
	
	@FindBy(xpath="//input[@placeholder='Enter Group Notes']")
	WebElement InputGroupNotes;
	
	@FindBy(xpath="//input[@placeholder='Enter Email Id']")
	WebElement Email_ID;
	
	@FindBy(xpath="//a[contains(text(),'Submit')]")
	WebElement SubmitButton;
	
	@FindBy(xpath="(//a[@href='/ManageAudit'])[2]")
	WebElement ApplicationLogs;
	
	@FindBy(xpath="(//i[@class='k-grid-Edit'])[1]")
	WebElement Edit;
	
	@FindBy(xpath="(//a[@class='k-icon k-i-expand'])[1]")
	WebElement Expand;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	WebElement Close;
	
	
	
	public void Group() throws IOException, InterruptedException 
	{
	
	GroupPage.click();
	Thread.sleep(15000);
	}
	
	public void Search_Group(String GrpName) throws IOException, InterruptedException 
	{
	
	InputAccount.clear();
	InputAccount.sendKeys(GrpName);
	SearchGrp.click();
	Thread.sleep(10000);
	
	CloseButton.click();
	}
	
	public void Create_Group1(String Groupname, String Input1, String Emailid1) throws IOException, InterruptedException 
	{
	
	CreateGroup.click();
	Thread.sleep(6000);
	
	Actions grp1=new Actions(driver);
	grp1.moveToElement(InputGroup).click().sendKeys(Groupname,Keys.ENTER).build().perform();
	Thread.sleep(3000);
	
	InputNewGroup.sendKeys(Input1);
	Thread.sleep(1000);
	InputGroupNotes.sendKeys(Input1);
	Thread.sleep(1000);
	
	Email_ID.sendKeys(Emailid1);
	Thread.sleep(1000);
	
	SubmitButton.click();
	Thread.sleep(15000);
	
	ApplicationLogs.click();
	Thread.sleep(8000);
	
	GroupPage.click();
	Thread.sleep(8000);
	}
	
	public void Group2(String Groupname, String Input2, String Emailid2) throws IOException, InterruptedException 
	{
	
	CreateGroup.click();
	Thread.sleep(6000);
	
	Actions grp2=new Actions(driver);
	grp2.moveToElement(InputGroup).click().sendKeys(Groupname,Keys.ENTER).build().perform();
	Thread.sleep(3000);
	
	InputNewGroup.sendKeys(Input2);
	Thread.sleep(1000);
	InputGroupNotes.sendKeys(Input2);
	Thread.sleep(1000);
	
	Email_ID.sendKeys(Emailid2);
	Thread.sleep(1000);
	
	SubmitButton.click();
	Thread.sleep(15000);
	
	ApplicationLogs.click();
	Thread.sleep(8000);
	
	GroupPage.click();
	Thread.sleep(8000);
	}
	
	public void Group3(String Groupname, String Input3, String Emailid3) throws IOException, InterruptedException 
	{
	
	CreateGroup.click();
	Thread.sleep(6000);
	
	Actions grp3=new Actions(driver);
	grp3.moveToElement(InputGroup).click().sendKeys(Groupname,Keys.ENTER).build().perform();
	Thread.sleep(3000);
	
	InputNewGroup.sendKeys(Input3);
	Thread.sleep(1000);
	InputGroupNotes.sendKeys(Input3);
	Thread.sleep(1000);
	
	Email_ID.sendKeys(Emailid3);
	Thread.sleep(1000);
	
	SubmitButton.click();
	Thread.sleep(15000);
	
	ApplicationLogs.click();
	Thread.sleep(8000);
	
	GroupPage.click();
	Thread.sleep(8000);
	}
	
	public void Edit_Group(String GroupNotes) throws IOException, InterruptedException 
	{
	
	Edit.click();
	Thread.sleep(5000);
	
	InputGroupNotes.sendKeys(GroupNotes);
	Thread.sleep(5000);
	
	SubmitButton.click();
	Thread.sleep(8000);
	}
	
	public void Expand_Group() throws IOException, InterruptedException 
	{
	
	Expand.click();
	Thread.sleep(10000);
	Close.click();

	}
	
}
