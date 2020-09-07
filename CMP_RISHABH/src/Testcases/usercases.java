package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.user;
import utility.propertiesfile;

public class usercases extends BaseTest {
	
	public WebDriver driver;
	user upage;
	Properties configprop;
	
	@Test
	public void Move_to_User() throws InterruptedException, IOException {
		
	upage = PageFactory.initElements(driver, user.class);
	upage. CreateUser(propertiesfile.readfile().getProperty("Group"),
			propertiesfile.readfile().getProperty("usersname"),
			propertiesfile.readfile().getProperty("Firstname"),
			propertiesfile.readfile().getProperty("Lastname"),
			propertiesfile.readfile().getProperty("Telephonenumber"),
			propertiesfile.readfile().getProperty("Phonenumber"),
			propertiesfile.readfile().getProperty("Emailid"));
	
	
	upage.SearchUser(propertiesfile.readfile().getProperty("UserSearch"));
	
	upage.SuspendAndEditUser(propertiesfile.readfile().getProperty("editname"));
	
	upage.ExtendAndDeleteUser(propertiesfile.readfile().getProperty("GrpNameforExtend"));
	
	}	
}
