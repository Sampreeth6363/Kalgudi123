package Septeber22package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	// store the login page webelements
	
	public WebDriver driver;
	public Loginpage(WebDriver driver2)
	{
		
		driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	
	//store the web elements
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement clickbtn;
	
	
	//we want to create associated methods
	
	
	public void setUsername(String username) 
	
	{
		
		txtusername.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void setPassword(String password)
	{
		txtpassword.sendKeys(password);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void clickLogin() 
	{
		
		clickbtn.click();
		
		
	}
	



}
