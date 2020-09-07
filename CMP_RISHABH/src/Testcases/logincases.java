package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;

import Pages.BaseTest;
import Pages.loginpage;
import utility.propertiesfile;

public class logincases extends BaseTest {

	public WebDriver driver;
	loginpage lpage;
	Properties configprop;

	@BeforeTest	
	public void setUp() throws IOException, InterruptedException {
		init();
	  Thread.sleep(3000);
	}
	

	@Test(priority = 1)
	public void When_ValidUserNameAndPassword_Expect_LoginPass() throws IOException, InterruptedException {

		lpage = PageFactory.initElements(driver, loginpage.class);
		lpage.User_login(propertiesfile.readfile().getProperty("username"),
				propertiesfile.readfile().getProperty("password"));
		
		Thread.sleep(6000);
		
	}
}
