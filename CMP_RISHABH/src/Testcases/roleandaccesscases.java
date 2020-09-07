package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.roleandaccess;
import utility.propertiesfile;

public class roleandaccesscases extends BaseTest{
	
	public WebDriver driver;
	roleandaccess rapage;
	Properties configprop;
	
	@Test
	public void Move_to_RoleAndAccess() throws InterruptedException, IOException {
		
	rapage = PageFactory.initElements(driver, roleandaccess.class);
	rapage.RoleAndAccess();
	
	rapage.Search_RoleAndAccess(propertiesfile.readfile().getProperty("RoleSearch"));
	
	rapage.Create_Role(propertiesfile.readfile().getProperty("Group"),
			propertiesfile.readfile().getProperty("rolename"),
			propertiesfile.readfile().getProperty("roledescription"));
	
	rapage.Edit_RoleAndAccess(propertiesfile.readfile().getProperty("EditDescription"));
	
	rapage.Delete_Role();
	
	rapage.Expand_RoleAndAccess();
			
	}
}
