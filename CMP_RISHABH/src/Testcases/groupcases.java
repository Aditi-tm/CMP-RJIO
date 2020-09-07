package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.group;
import utility.propertiesfile;

public class groupcases extends BaseTest{
	
	public WebDriver driver;
	group gpage;
	Properties configprop;
	
	@Test
	public void Move_to_Group() throws InterruptedException, IOException {
		
	gpage = PageFactory.initElements(driver, group.class);
	gpage.Group();
	
	gpage.Search_Group(propertiesfile.readfile().getProperty("GrpName"));
	
	gpage.Create_Group1(propertiesfile.readfile().getProperty("GroupName"),
			propertiesfile.readfile().getProperty("Input1"),
			propertiesfile.readfile().getProperty("Emailid"));
	
	gpage.Group2(propertiesfile.readfile().getProperty("GroupName"),
			propertiesfile.readfile().getProperty("Input2"),
			propertiesfile.readfile().getProperty("Emailid2"));
	
	gpage.Group3(propertiesfile.readfile().getProperty("GroupName"),
			propertiesfile.readfile().getProperty("Input3"),
			propertiesfile.readfile().getProperty("Emailid3"));
	
	gpage.Edit_Group(propertiesfile.readfile().getProperty("GroupNotes"));
	
	gpage.Expand_Group();

	}	

}
