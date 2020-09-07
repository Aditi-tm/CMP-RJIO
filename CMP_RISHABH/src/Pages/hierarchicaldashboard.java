package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hierarchicaldashboard extends BaseTest
{

	WebDriver driver;
	
	public hierarchicaldashboard(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="export")
	WebElement DownloadPDF;
		
	@FindBy(xpath="//h3[contains(text(),'Rate Plan Share (Top 10 Rate Plan)')]")
	WebElement RatePlanShare;
	
	@FindBy(className="btn btn-cancel-color  width-75 ")
	WebElement Close;
	
	@FindBy(xpath="//i[@class='fa custom-manu-icon dashboard-icon']")
	WebElement DashboardLogo;
	
	@FindBy(xpath="(//a[@href='/CustomerDashboard'])[1]")
	WebElement hierarchicalDashboard;
	
	@FindBy(id="rdts1_trigger")
	WebElement SelectGroup;
	
	@FindBy(id="rdts1-0")
	WebElement RJIO;
	
	@FindBy(id="rdts1-0-0")
	WebElement HQ;
	
	@FindBy(id="rdts1-0-0-0")
	WebElement IL;
	
	@FindBy(id="rdts1-0-0-0-0")
	WebElement CL1;
	
	@FindBy(id="rdts1-0-0-0-0-0")
	WebElement CL2;
	
	@FindBy(xpath="//input[@class='btn btn-custom-color width-75 ml-2']")
	WebElement Submit;
	
	@FindBy(css="div.margin-top-60 div.container div.row div.col-lg-12 div.row-flex:nth-child(5) div.line-chart div.row-flex div.line-chart-1.chartmr-1.bgarea div.gc-dash-pie.rateplanshare-last.k-chart:nth-child(2) g:nth-child(6) g:nth-child(1) g:nth-child(1) g:nth-child(1) > path:nth-child(1)")
	WebElement RatePlans;
	

	public void HierarchicalDashboard() throws InterruptedException 
	{
		Actions hd=new Actions(driver);
		hd.moveToElement(DashboardLogo).build().perform();
		hierarchicalDashboard.click();                             
				
		Thread.sleep(12000);
		System.out.println("Now Landed to Heirarchical Dashboard");
	}
	
	public void SelectGroupFromHierarchy() throws InterruptedException 
	{
	
		SelectGroup.click();
		Thread.sleep(4000);
		RJIO.click();
		Thread.sleep(2000);
		HQ.click();
		Thread.sleep(2000);
		IL.click();
		Thread.sleep(2000);
		CL1.click();
		Thread.sleep(2000);
		//CL2.click();
		//Thread.sleep(2000);
		Submit.click();
		Thread.sleep(10000);
	}
	
	public void downloadpdf() throws InterruptedException 
	{
	
		DownloadPDF.click();
		System.out.println("PDF File Downloaded Successfully");
		Thread.sleep(5000);
	}
	
	public void RatePlansOnAccount() throws InterruptedException 
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", RatePlanShare);
		
		Thread.sleep(6000);
		
		RatePlans.click();
		Thread.sleep(8000);
		
		Close.click();
	}

}
