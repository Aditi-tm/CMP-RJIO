package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.managesims;
import utility.propertiesfile;

public class managesimscases extends BaseTest {

	public WebDriver driver;
	managesims mpage;
	Properties configprop;
	
	@Test
	public void ManageSIMS() throws IOException, InterruptedException {

		mpage = PageFactory.initElements(driver, managesims.class);
		mpage.ManageSims();
		
		mpage.Export_Data();
		
		mpage.Search(propertiesfile.readfile().getProperty("ICCID"),
				propertiesfile.readfile().getProperty("MSISDN"),
				propertiesfile.readfile().getProperty("IMSI"),
				propertiesfile.readfile().getProperty("SimAlias"));
		
		mpage.ManageSimFilter(propertiesfile.readfile().getProperty("SimState"),
				propertiesfile.readfile().getProperty("RatePlan"),
				propertiesfile.readfile().getProperty("Account"));
	
		mpage.ExportFilteredData();
		
		mpage.UpdateSimAlias(propertiesfile.readfile().getProperty("InputAlias"),
				propertiesfile.readfile().getProperty("SubNotes"));
	
	}
}
