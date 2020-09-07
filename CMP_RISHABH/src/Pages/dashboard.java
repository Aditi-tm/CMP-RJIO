package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class dashboard extends BaseTest{
	
	WebDriver driver;
	
	public dashboard(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement JioLogo;
	
	@FindBy(xpath="//div[@class='fa custom-manu-icon devices-menu-icon']")
	WebElement SIMs;
	
	@FindBy(xpath="//div[@class='fa custom-manu-icon report-menu-icon']")
	WebElement Reports;
	
	@FindBy(xpath="//div[@class='fa custom-manu-icon rule-engine-menu-icon']")
	WebElement RuleEngine;
	
	@FindBy(xpath="//div[@class='fa custom-manu-icon active-menu-icon']")
	WebElement AlertCentre;
	
	@FindBy(xpath="//div[@class='fa custom-manu-icon admin-menu-icon']")
	WebElement Admin;
	
	@FindBy(css="div.margin-top-60 div.container div.row div.col-lg-12 div.row-flex:nth-child(5) div.line-chart div.row-flex div.line-chart-1.chartmr-1.bgarea div.gc-dash-pie.rateplanshare-last.k-chart:nth-child(2) g:nth-child(6) g:nth-child(1) g:nth-child(6) g:nth-child(1) > path:nth-child(1)")
	WebElement RatePlans;
	
	@FindBy(xpath="//input[@placeholder='User Name']")
	WebElement UserNameTextBox;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement PasswordTextBox;
	
	@FindBy(xpath="//input[@class='btn btn-custom-color']")
	WebElement LoginButton;
	
	@FindBy(xpath="//div[@class='fa custom-manu-icon dashboard-icon']")
	WebElement Dashboardicon;
	
	@FindBy(xpath="(//a[@href='/Dashboard'])[4]")
	WebElement Dashboardbutton;
	
	@FindBy(id="export")
	WebElement DownloadPDF;
	
	@FindBy(xpath="//h3[contains(text(),'Rate Plan Share (Top 10 Rate Plan)')]")
	WebElement RatePlanShare;
	
	@FindBy(css="div.margin-top-60 div.container div.row div.col-lg-12 div.row-flex:nth-child(5) div.line-chart div.row-flex div.line-chart-1.chartmr-1.bgarea div.gc-dash-pie.rateplanshare-last.k-chart:nth-child(2) g:nth-child(6) g:nth-child(1) g:nth-child(6) g:nth-child(1) > path:nth-child(1)")
	WebElement RatePlan;
	
	@FindBy(xpath="//button[contains(@class,'width-75')]")
	WebElement Close;
	
	
	public void Dashboard() throws IOException, InterruptedException {
		
	
		Actions d=new Actions(driver);
		d.moveToElement(Dashboardicon).build().perform();
		
		Dashboardbutton.click();
		Thread.sleep(12000);
		System.out.println("Successfully Landed to Dashboard");
		}
	
		public void DownloadingPDF() throws IOException, InterruptedException {
				
		DownloadPDF.click();
		System.out.println("PDF File Downloaded Successfully");
		Thread.sleep(5000);
		}
		
		public void OpenRatePlan() throws IOException, InterruptedException {
			
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", RatePlanShare);
		
		Thread.sleep(6000);
		
		RatePlans.click();
		Thread.sleep(8000);
		
		Close.click();	
		
		
		}
}
