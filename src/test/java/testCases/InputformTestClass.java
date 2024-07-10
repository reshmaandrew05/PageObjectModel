package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InputformPageClass;

public class InputformTestClass extends BaseClass{
	
	InputformPageClass inputformpageclass;
	
	@Test
	public void verifyInputFormheader()
	{
		inputformpageclass=new InputformPageClass(driver);
		inputformpageclass.clickOnInputform();
		String expectedata="Single Input Field";
		String actualdata=inputformpageclass.getInputformHeader();
		Assert.assertEquals(actualdata, expectedata);
	}

}
 