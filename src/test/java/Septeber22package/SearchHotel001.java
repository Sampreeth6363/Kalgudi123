package Septeber22package;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class SearchHotel001 extends Aug28_1
{
	@Test
	public void searchhoteltest()
	{
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Loginpage lp=new Loginpage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		SearchHotelPage sh=new SearchHotelPage(driver);
		
		sh.setLocation();
		
		sh.setSelectHotel();
		
		sh.setRoomType();
		
		sh.setNoofRooms();
		
		sh.setCheckinDate(checkindate);
		 
		sh.setCheckoutDate(checkoutdate);
		
		sh.setAdultsperroom();
		sh.setChildrensperroom();
		
		sh.clickSearchbtn();
	}

}
