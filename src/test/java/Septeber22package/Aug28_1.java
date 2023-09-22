package Septeber22package;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Aug28_1
{
   
	 

	
		ReadConfig rc=new ReadConfig();
		
		
		String URL=rc.getapplicationURL();
		String username=rc.getUsername();
		String password=rc.getPassword();
		
		String checkindate=rc.getCheckinDate();
	    String checkoutdate=rc.getCheckoutDaate();
     
		
		public RemoteWebDriver driver;
		
		@BeforeClass
		
		public void OpenApplication() 
		{
			//launch the web driver
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			//WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			
		}
		
		@AfterClass
		public void CloseApplication()
		{
			
			driver.close();
		}
	}
		


