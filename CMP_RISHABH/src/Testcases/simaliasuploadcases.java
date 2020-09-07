package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.simaliasupload;
import utility.propertiesfile;

public class simaliasuploadcases extends BaseTest {
	
	public WebDriver driver;
	simaliasupload smpage;
	Properties configprop;
	
	@Test
	public void SimAliasupload() throws IOException, InterruptedException {

		smpage = PageFactory.initElements(driver, simaliasupload.class);
		smpage.SimAliasUpload(propertiesfile.readfile().getProperty("Path"));
		
		smpage.CheckOnManageSIM(propertiesfile.readfile().getProperty("IMSI"));
		}
	}
