package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickersClass;

public class DatePickersTestClass extends BaseClass {
	
	DatePickersClass datepickersclass;
	
	@Test
	public void verifyDatePickerHeader()
	{
		
		datepickersclass=new DatePickersClass(driver);
		datepickersclass.clickOnDatePickers();
	}
	@Test
	public void validateLogoAtribute()
	
	{	datepickersclass=new DatePickersClass(driver);
		datepickersclass.clickOnDatePickers();
		String actualdata=datepickersclass.getSrcofLogo();
		System.out.println(actualdata);
		String expectedata="https://selenium.qabible.in/images/logo.png";
		Assert.assertEquals(actualdata, expectedata);
	}
	@Test
	public void dateonDatePicker()
	{
		datepickersclass=new DatePickersClass(driver);
		datepickersclass.clickOnDatePickers();
		datepickersclass.enterDate();
		
	}
}
