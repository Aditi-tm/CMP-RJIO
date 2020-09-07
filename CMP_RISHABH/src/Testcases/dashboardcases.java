package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.dashboard;

public class dashboardcases extends BaseTest {

	public WebDriver driver;
	dashboard dpage;
	

	@Test
	public void Move_to_Dashboard() throws InterruptedException, IOException {
		
		dpage = new dashboard(driver);
		dpage = PageFactory.initElements(driver, dashboard.class);
	dpage.Dashboard();

	dpage.DownloadingPDF();
	
	dpage.OpenRatePlan();
	}
}