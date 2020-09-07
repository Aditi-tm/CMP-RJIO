package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class simallocation extends BaseTest{
	 
	WebDriver driver;
	
	public simallocation(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href='/SIMAllocation'])[2]")
	WebElement SimAllocationButton;
	
	@FindBy(xpath="//a[@id='accountSelect_trigger']")
	WebElement SelectGroup;
	
	@FindBy(xpath="//input[@id='accountSelect-0']")
	WebElement RJIO;
	
	@FindBy(xpath="//input[@id='accountSelect-0-0']")
	WebElement BL;
	
	@FindBy(xpath="//input[@id='accountSelect-0-0-0']")
	WebElement IL;
	
	@FindBy(xpath="//input[@id='accountSelect-0-0-0-2']")
	WebElement CL;
	
	@FindBy(xpath="(//input[@class='btn btn-custom-color cursor-pointer ml-2'])[1]")
	WebElement SubmitButton;
	
	@FindBy(xpath="//input[@class='sel']")
	WebElement SelectSim;
	
	@FindBy(xpath="//a[@id='rdts1_trigger']")
	WebElement AssignSim;
	
	@FindBy(xpath="//input[@id='rdts1-0']")
	WebElement Grp1;
	
	@FindBy(xpath="//button[@id='submitAction']")
	WebElement SubmitAction;
	
	public void SimAllocation() throws IOException, InterruptedException {

	SimAllocationButton.click();
	Thread.sleep(15000);
	System.out.println("Landed to Sim Allocation module");
	}
	
	public void FromGroup() throws IOException, InterruptedException {

	SelectGroup.click();
	Thread.sleep(2000);
	RJIO.click();
	Thread.sleep(2000);
	BL.click();
	Thread.sleep(2000);
	IL.click();
	Thread.sleep(2000);
	CL.click();
	Thread.sleep(2000);
	
	SubmitButton.click();
	Thread.sleep(7000);
	}
	
	public void SelectSIM() throws IOException, InterruptedException {


	SelectSim.click();
	Thread.sleep(3000);
	}
	
	public void ToGroup() throws IOException, InterruptedException {


	AssignSim.click();
	Thread.sleep(2000);
	Grp1.click();
	Thread.sleep(10000);
	
	SubmitAction.click();
	System.out.println("Successfully Allocated sim");
	
	
		
	}
	

}
