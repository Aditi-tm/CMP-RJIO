package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class simaliasupload extends BaseTest{
	
	WebDriver driver;
	
	public simaliasupload(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[contains(@class,'fa-custom-rightbaricons upload-icon')]")
	WebElement AliasButton;
	
	@FindBy(xpath="//input[@id='files']")
	WebElement SelectFile;
	
	@FindBy(xpath="//button[@title='Start Upload']")
	WebElement StartUpload;
	
	@FindBy(xpath="(//a[@href='/Managesims'])[4]")
	WebElement MovetoManageSim;
	
	@FindBy(xpath="//input[@id='searchinput']")
	WebElement InputSearch;
	
	@FindBy(xpath="(//i[@class='fa-custom-rightbaricons search-icon searchBoxTog'])[1]")
	WebElement SearchButton;
	
	@FindBy(xpath="//i[@id='closeBtn']")
	WebElement CloseButton;
	
	public void SimAliasUpload(String Path) throws IOException, InterruptedException {
	
	AliasButton.click();
	Thread.sleep(5000);
	
	SelectFile.sendKeys(Path);
	Thread.sleep(3000);
	
	StartUpload.click();
	Thread.sleep(10000);
	}
	
	public void CheckOnManageSIM(String IMSI) throws IOException, InterruptedException {
		
	MovetoManageSim.click();
	Thread.sleep(12000);
	
	InputSearch.clear();
	InputSearch.sendKeys(IMSI);
	SearchButton.click();
	
	Thread.sleep(10000);
	CloseButton.click();
	Thread.sleep(10000);
	
	System.out.println("Sim Alias Uploaded Successfully");
	
	
	
	
	}
}
