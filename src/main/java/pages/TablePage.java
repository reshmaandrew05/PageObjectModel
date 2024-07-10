package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class TablePage {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Table')]")
	WebElement tableelement;
	@FindBy(xpath="//a[@class='nav-link']")
	List <WebElement> headernames;
	
	@FindBy(xpath="//div[@id='dtBasicExample_wrapper']//tbody//tr//td[1]")
	List <WebElement> element;
	
	UtilitiesClass utilities=new UtilitiesClass();
	public TablePage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);//initElements is static method that is why call with class name pagefactory
	}
	
	public void clickOnTable() {
		
		tableelement.click();
		}
	public void getNames()
	{
		List<String> names=new ArrayList<String>();
		names=utilities.getTextofElements(element);
		System.out.println(names);
		
	}
	public List<String> printHeaders()
	{
		List<String> headerdata=new ArrayList<String>();	
		headerdata=utilities.getTextofElements(headernames);
		System.out.println("Actual data"+headerdata);
		return headerdata;
	}
	public List<String> headerVerification()
	{
		
		List<String> verifyheadr=new ArrayList<String>();
		verifyheadr=utilities.expectedData();
		return verifyheadr;
		
	}
	public void getOfficeofPerson(String personname) 
	{
		List<String> names=new ArrayList<String>();	
		names=utilities.getTextofElements(element);
		int index=0;
		for(index=0;index<element.size();index++)
		{
			if(personname.equals(names.get(index)))
			{
				index++;
				break;
			}
			
		}
		WebElement officeele=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+index+"]//td[3]"));
		System.out.println(officeele.getText());
		
	}
	public String getageofPerson(String personname) 
	{
		List<String> names=new ArrayList<String>();	
		names=utilities.getTextofElements(element);
		int index=0; 
		for(index=0;index<element.size();index++)
		{
			if(personname.equals(names.get(index)))
			{
				index++;
				break;
			}
			
		}
		WebElement officeele=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+index+"]//td[4]"));
		String age=(officeele.getText());
		return age;
		
		
	}
}
