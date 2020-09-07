package Pages;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
import utility.propertiesfile;

public class BaseTest {

		public WebDriver driver;
		public static RemoteWebDriver rwd;
		Properties prop;
		
		public Properties OR = new Properties();
		String URL;
		String browser;

		public WebDriver getDriver()
		{
			return driver;
		}
     
		public void init() throws IOException, InterruptedException {
			
		Selectbrowser(browser);
			driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			getUrl(OR.getProperty("URL"));
			
		}
		
		public void Selectbrowser(String browsername) throws IOException {
			
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					driver.manage().window().maximize();
			
		}
		
		public void getUrl(String url) throws InterruptedException, IOException 
		{
			OR = propertiesfile.readfile();
		//	 Timer  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			System.out.println("Test :: "+OR.getProperty("url"));
			//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			try{
				driver.get(OR.getProperty("url"));
			}
			catch(WebDriverException e){
	              System.out.println("WebDriverException occured");
	          }
			
		}

		//Thread.sleep(5000);
		public void CloseBrowser()
		{
			driver.close();
		}
		
		}

