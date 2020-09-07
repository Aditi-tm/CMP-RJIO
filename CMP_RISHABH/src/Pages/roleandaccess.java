package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class roleandaccess extends BaseTest
{

WebDriver driver;
	
	public roleandaccess(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href='/ManageRole'])[2]")
	WebElement RolePage;	
	
	@FindBy(xpath="//input[@placeholder='Enter Search Text']")
	WebElement SearchRole;
	
	@FindBy(xpath="//a[@id='searchButton']")
	WebElement searchbutton;
	
	@FindBy(xpath="//i[@id='closeBtn']")
	WebElement closebutton;
	
	@FindBy(xpath="//a[@href='/CreateRole']")
	WebElement CreateRole;
	
	@FindBy(xpath="//span[@class='k-input']")
	WebElement SelectGroup;
	
	@FindBy(xpath="(//span[@class='k-list-filter'])[12]")
	WebElement inputGroup;
	
	@FindBy(xpath="//input[@placeholder='Enter Role Name']")
	WebElement RoleName;
	
	@FindBy(xpath="//input[@placeholder='Enter Role Description']")
	WebElement RoleDescription;
	
	@FindBy(xpath="//label[@for='viewcheck46']")
	WebElement CheckallDasboard;
	
	@FindBy(xpath="//label[@for='editcheck1']")
	WebElement CheckallSIMs;
	
	@FindBy(xpath="//label[@for='editcheck3']")
	WebElement CheckallRatePlan;
	
	@FindBy(xpath="//label[@for='viewcheck19']")
	WebElement CheckallReports;
	
	@FindBy(xpath="//label[@for='editcheck39']")
	WebElement CheckallRuleEngine;
	
	@FindBy(xpath="//label[@for='viewcheck40']")
	WebElement CheckallAlerts;
	
	@FindBy(xpath="//label[@for='editcheck5']")
	WebElement CheckallEditAdmin;
	
	@FindBy(xpath="//a[contains(text(),'Submit')]")
	WebElement Submit;
	
	@FindBy(xpath="(//i[@class='k-grid-Edit'])[1]")
	WebElement Edit;
	
	@FindBy(xpath="(//i[@class='k-grid-Delete'])[1]")
	WebElement Delete;
	
	@FindBy(xpath="//button[@class='k-button k-primary']")
	WebElement ConfirmDelete;
	
	@FindBy(xpath="(//a[@class='k-icon k-i-expand'])[1]")
	WebElement Expand;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	WebElement Closebutton;
	
	@FindBy(xpath="(//div[@class='form-groupcheck'])[45]")
	WebElement NotificationHistory;
	
	public void RoleAndAccess() throws IOException, InterruptedException 
	{
	
		RolePage.click();
		Thread.sleep(10000);
	}
	
	
	public void Search_RoleAndAccess(String RoleSearch) throws IOException, InterruptedException 
	{
	
		SearchRole.clear();
		SearchRole.sendKeys(RoleSearch);
		searchbutton.click();
		Thread.sleep(10000);
		
		closebutton.click();
		Thread.sleep(10000);
	}
	
	public void Create_Role(String Group, String rolename, String roledescription) throws IOException, InterruptedException 
	{
	
		CreateRole.click();
		Thread.sleep(5000);
		
		SelectGroup.click();
		inputGroup.sendKeys(Group,Keys.ENTER);
		Thread.sleep(3000);
		
		RoleName.sendKeys(rolename);
		Thread.sleep(1000);
		
		RoleDescription.sendKeys(roledescription);
		Thread.sleep(1000);

		CheckallDasboard.click();
		Thread.sleep(1000);
		
		CheckallSIMs.click();
		Thread.sleep(1000);
		
		CheckallRatePlan.click();
		Thread.sleep(1000);
		
		CheckallReports.click();
		Thread.sleep(1000);
		
		CheckallRuleEngine.click();
		Thread.sleep(1000);
		
		CheckallAlerts.click();
		Thread.sleep(1000);
		
		CheckallEditAdmin.click();
		Thread.sleep(1000);
		
		Submit.click();
		Thread.sleep(20000);
		System.out.println("Role Created Successfully");
	}
	
	public void Edit_RoleAndAccess(String EditDescription) throws IOException, InterruptedException 
	{
	
		Edit.click();
		Thread.sleep(6000);
		
		RoleDescription.clear();
		RoleDescription.sendKeys(EditDescription);
		Submit.click();
		Thread.sleep(20000);
		System.out.println("Role Updated Successfully");
	}
	
	public void Delete_Role() throws IOException, InterruptedException 
	{
	
		Delete.click();
		ConfirmDelete.click();
		Thread.sleep(16000);
		System.out.println("Role Deleted Successfully");
		
	}
	
	public void Expand_RoleAndAccess() throws IOException, InterruptedException 
	{
	
		Expand.click();
		
		
		JavascriptExecutor je1= (JavascriptExecutor)driver;             
		je1.executeScript("arguments[0].scrollIntoView();",CheckallDasboard);
		Thread.sleep(4000);                
		
		je1.executeScript("arguments[0].scrollIntoView();",CheckallEditAdmin);
		Thread.sleep(4000);
		
		je1.executeScript("arguments[0].scrollIntoView();",NotificationHistory);
		Thread.sleep(4000);
		
		
		Closebutton.click();
		
	}
	
}
