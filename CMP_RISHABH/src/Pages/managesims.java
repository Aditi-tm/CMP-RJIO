package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utility.propertiesfile;

public class managesims extends BaseTest 
{

	WebDriver driver;
	propertiesfile loginprop = new propertiesfile();
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement JioLogo;
	
	@FindBy(css=".upload-icon")
	WebElement Export;
	
	@FindBy(xpath="//button[@class='btn btn-custom-color width-75']")
	WebElement ConfirmExport;
	
	@FindBy(xpath="//i[@class='fa custom-manu-icon devices-menu-icon']")
	WebElement ManageSimsIcon;
	
	@FindBy(xpath="//a[contains(text(),'Manage SIMs')]")
	WebElement Managesims;
	
	@FindBy(xpath="//input[@id='searchinput']")
	WebElement InputSearch;
	
	@FindBy(xpath="(//i[@class='fa-custom-rightbaricons search-icon searchBoxTog'])[1]")
	WebElement SearchButton;
	
	@FindBy(xpath="//i[@id='closeBtn']")
	WebElement CloseButton;
	
	@FindBy(xpath="//a[@id='popupFilter']")
	WebElement Filter;
	
	@FindBy(xpath="//span[contains(text(),'SIM State')]")
	WebElement SimState;
	
	@FindBy(xpath="//input[@id='simStateInput']")
	WebElement SimStateInput;
	
	@FindBy(xpath="//span[@class='k-link'][contains(text(),'Active')]")
	WebElement GetState;
	
	@FindBy(xpath="//span[contains(@class,'k-link k-header')][contains(text(),'Rate Plan')]")
	WebElement FilterRatePlan;
	
	@FindBy(xpath="//input[@id='ratePlanInput']")
	WebElement InputRatePlan;
	
	@FindBy(xpath="(//span[contains(text(),'Suspend1')])[1]")
	WebElement GetRatePlan;
	
	@FindBy(xpath="//span[contains(@class,'k-link k-header')][contains(text(),'Group')]")
	WebElement FilterGroup;
	
	@FindBy(xpath="//input[@id='accountInput']")
	WebElement InputAccount;
	
	@FindBy(xpath="//li[text()='IL-ILILILIL_0']")
	WebElement GetAccount;
	
	@FindBy(xpath="//span[contains(text(),'Initial Activation Date')]")
	WebElement InitialActivationDate;
	
	@FindBy(xpath="(//span[@class='k-icon k-i-calendar'])[1]")
	WebElement DateIcon1;
	
	@FindBy(xpath="(//a[@title='Thursday, July 30, 2020'])[1]")
	WebElement StartDate;
			
	@FindBy(xpath="(//span[@class='k-icon k-i-calendar'])[2]")
	WebElement DateIcon2;
	
	@FindBy(xpath="(//a[@title='Saturday, August 08, 2020'])[2]")
	WebElement EndDate;			
			
	@FindBy(xpath="//input[@id='activationDateSubmit']")
	WebElement SubmitDate;			
	
	@FindBy(xpath="//button[@class='close cursar-pointer']")
	WebElement CloseFilter;
	
	@FindBy(css="#resetAllFilter")
	WebElement ResetAllFilter;
	
	@FindBy(xpath="(//a[@class='k-icon k-i-expand'])[1]")
	WebElement Expand;
	
	@FindBy(xpath="//i[@id='DEVICE_ID']")
	WebElement EditAliasButton;
	
	@FindBy(css=".m-0 > input:nth-child(1)")
	WebElement AliasInput;
	
	@FindBy(xpath="//textarea[@id='subsNotes']")
	WebElement SubNotes;
	
	@FindBy(xpath="//button[@id='prceedBtnGeneral']")
	WebElement ProceedButton;
	
	@FindBy(xpath="//a[text()='SIM Usage']")
	WebElement SimUsage;
	
	@FindBy(xpath="(//a[@data-toggle='tab'])[3]")
	WebElement RatePlanTab;	
	
	@FindBy(xpath="//a[text()='Customer Details']")
	WebElement CustomerDetails;	
	
	@FindBy(xpath="//a[text()='Audit Trail']")
	WebElement AuditTrail;	
	
	@FindBy(xpath="//select[@id='assetNoteFilter']")
	WebElement SelectAttribute;	
	
	@FindBy(xpath="//option[contains(text(),'SIM Alias')]")
	WebElement SelectAlias;	
	
	@FindBy(xpath="//button[@value='close']")
	WebElement Closebutton;	
	
	public void ManageSims() throws IOException, InterruptedException {
	
		Actions d=new Actions(driver);
		d.moveToElement(ManageSimsIcon).build().perform();
		Managesims.click();
		
		Thread.sleep(20000);
		System.out.println("Landed to Manage Sim Module");
		
	}
	
	public void Export_Data() throws IOException, InterruptedException {
		
		Export.click();
		ConfirmExport.click();
		Thread.sleep(13000);
		System.out.println("File Downloaded Successfully");
		
	}
	
	public void Search(String ICCID, String MSISDN, String IMSI, String SimAlias) throws IOException, InterruptedException {
		
		InputSearch.clear();
		InputSearch.sendKeys(ICCID);
		SearchButton.click();
		
		Thread.sleep(10000);
		CloseButton.click();
		Thread.sleep(10000);
		
		InputSearch.clear();
		InputSearch.sendKeys(IMSI);
		SearchButton.click();
		
		Thread.sleep(10000);
		CloseButton.click();
		Thread.sleep(10000);
		
		InputSearch.clear();
		InputSearch.sendKeys(MSISDN);
		SearchButton.click();
		
		Thread.sleep(10000);
		CloseButton.click();
		Thread.sleep(10000);
		
		InputSearch.clear();
		InputSearch.sendKeys(SimAlias);
		SearchButton.click();
		
		Thread.sleep(10000);
		CloseButton.click();
		Thread.sleep(10000);
		
	}
	
	public void ManageSimFilter(String Simstate, String Rateplan, String Account) throws IOException, InterruptedException {
		
		Filter.click();
		Thread.sleep(10000);
		
		SimState.click();
		SimStateInput.sendKeys(Simstate);
		Thread.sleep(2000);
		GetState.click();
		Thread.sleep(10000);
		SimState.click();
		
		FilterRatePlan.click();
		InputRatePlan.sendKeys(Rateplan);
		Thread.sleep(2000);
		GetRatePlan.click();
		Thread.sleep(10000);
		FilterRatePlan.click();
		
		FilterGroup.click();
		InputAccount.sendKeys(Account, Keys.ENTER);
		Thread.sleep(2000);
		GetAccount.click();
		Thread.sleep(10000);
		FilterGroup.click();
		
		InitialActivationDate.click();
		DateIcon1.click();
		Thread.sleep(1000);
		StartDate.click();
		DateIcon2.click();
		Thread.sleep(1000);
		EndDate.click();
		SubmitDate.click();
		Thread.sleep(10000);
		
		CloseFilter.click();
		Thread.sleep(1000);
	}
	
	public void ExportFilteredData() throws IOException, InterruptedException {
		
		Export.click();
		ConfirmExport.click();
		Thread.sleep(13000);
		
		ResetAllFilter.click();
		Thread.sleep(12000);
	}
	
	public void UpdateSimAlias(String InputAlias, String Subnotes) throws IOException, InterruptedException {
		
		Expand.click();
		Thread.sleep(5000);
		EditAliasButton.click();
		AliasInput.clear();
		AliasInput.sendKeys(InputAlias);
		EditAliasButton.click();
		Thread.sleep(2000);
		
		SubNotes.sendKeys(Subnotes);
		ProceedButton.click();
		System.out.println("SIM Alias Updated Sucessfully");
		Thread.sleep(15000);
		
	}
	
	public void ExpandSIM() throws IOException, InterruptedException {
		
		Expand.click();
		Thread.sleep(7000);
		SimUsage.click();
		Thread.sleep(7000);
		RatePlanTab.click();
		Thread.sleep(7000);
		CustomerDetails.click();
		Thread.sleep(7000);
		AuditTrail.click();
		Thread.sleep(20000);
		
		SelectAttribute.click();
		SelectAlias.click();
		Thread.sleep(20000);
		
		Closebutton.click();
		
	}
}
