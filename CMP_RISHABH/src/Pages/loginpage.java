package Pages;


	import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.propertiesfile;


	public class loginpage extends BaseTest {
		
		propertiesfile loginprop = new propertiesfile();
		
		WebDriver driver;
		
		
		public loginpage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	    @FindBy(xpath="//input[@placeholder='User Name']")
		WebElement UserNameTextBox;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement PasswordTextBox;
		
		@FindBy(xpath="//input[@class='btn btn-custom-color']")
		WebElement LoginButton;
		
		
		public void User_login(String user, String pwd) throws IOException, InterruptedException {

				    UserNameTextBox.clear();
				    UserNameTextBox.sendKeys(user);
				    PasswordTextBox.clear();
			        PasswordTextBox.sendKeys(pwd);
			        LoginButton.click();		        
		}
		
		public void invaliduserlogin(String user, String pwd) throws IOException {

				  
				    UserNameTextBox.clear();
				    UserNameTextBox.sendKeys(user);
				    PasswordTextBox.clear();
			        PasswordTextBox.sendKeys(pwd);
			        LoginButton.click();
			        	    	
		}
			

	}






		




