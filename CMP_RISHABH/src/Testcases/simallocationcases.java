package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.simallocation;

public class simallocationcases extends BaseTest
{

	public WebDriver driver;
	simallocation sapage;
	
	@Test
	public void Simallocation() throws InterruptedException, IOException {
		
	sapage = PageFactory.initElements(driver, simallocation.class);
	sapage.SimAllocation();
	
	sapage.FromGroup();
	
	sapage.SelectSIM();
	
	sapage.ToGroup();
	}
	
}
