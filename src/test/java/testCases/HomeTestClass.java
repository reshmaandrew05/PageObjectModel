package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePageClass;

public class HomeTestClass extends BaseClass {
	HomePageClass homepageclass;
	
	@Test
	public void verifyLogo()
	{
		homepageclass=new HomePageClass(driver);//browser should open from extended class after that this constructor invoke so we gave that sentence in method otherwise error,driver null
		Assert.assertTrue(homepageclass.isLogoDispalyed());
	}
}


