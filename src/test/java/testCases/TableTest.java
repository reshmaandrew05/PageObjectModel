package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass{
TablePage tablepage;
	
	@Test
	public void verifyNames()
	{
		
		tablepage=new TablePage(driver);
		tablepage.clickOnTable();
		tablepage.getNames();
		
	}
	@Test
	public void verifyHeaderName()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTable();
		List<String> actualdata = tablepage.printHeaders();
		List<String> exdata=tablepage.headerVerification();
		Assert.assertEquals(actualdata, exdata);
		
	}
	@Test
	public void oficePrint()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTable();
		tablepage.getOfficeofPerson("Brielle Williamson");
		
	}
	@Test
	public void agePrint()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTable();
		String age=tablepage.getageofPerson("Brielle Williamson");
		System.out.println(age);
		String actualage=age;
		String expectedage="61";
		Assert.assertEquals(actualage, expectedage);
		
		
		
		
		
	}
	
	
}
