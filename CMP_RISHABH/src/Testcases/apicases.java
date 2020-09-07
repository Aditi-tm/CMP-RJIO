package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.apiuser;
import utility.propertiesfile;

public class apicases extends BaseTest 
{

	public WebDriver driver;
	apiuser aupage;
	Properties configprop;
	
	@Test
	public void Move_to_APIUser() throws InterruptedException, IOException {
		
	aupage = PageFactory.initElements(driver, apiuser.class);
	
	aupage.APIUser();
	
	aupage.CreateAPIUser(propertiesfile.readfile().getProperty("UserSearch"),
			propertiesfile.readfile().getProperty("Group"),
			propertiesfile.readfile().getProperty("usersname"),
			propertiesfile.readfile().getProperty("Firstname"),
			propertiesfile.readfile().getProperty("Lastname"),
			propertiesfile.readfile().getProperty("Emailid"));

	aupage.EditAPIUser(propertiesfile.readfile().getProperty("editname"));
	
	aupage.DeleteAPIUser();
	
	aupage.ResetPassword_APIUser(propertiesfile.readfile().getProperty("Emailid"));
	
	aupage.Expand_APIUser();
	
	}	
	
}
