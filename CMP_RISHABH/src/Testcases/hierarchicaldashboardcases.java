package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.hierarchicaldashboard;

public class hierarchicaldashboardcases extends BaseTest 
{
	public WebDriver driver;
	hierarchicaldashboard hdpage;

	@Test
	public void Hierarchical_Dashboard() throws IOException, InterruptedException {
	
	hdpage = PageFactory.initElements(driver, hierarchicaldashboard.class);
	hdpage.HierarchicalDashboard();

	hdpage.SelectGroupFromHierarchy();
	
	hdpage.downloadpdf();
	
	hdpage.RatePlansOnAccount();
	
	}
	
	
}
