package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class DatePickersClass {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Date Pickers')]")
	WebElement Datepickerlink;
	@FindBy(xpath="//img[@alt='logo']")
	WebElement datepickerlogo;
	@FindBy(xpath="//input[@id='single-input-field']")
	WebElement date;
	UtilitiesClass utilities=new UtilitiesClass();
	public DatePickersClass (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);//initElements is static method that is why call with class name pagefactory
	}
	
	public void clickOnDatePickers() {
		
		Datepickerlink.click();
		}
	public String getSrcofLogo()
	{
		return utilities.get_Atribute(datepickerlogo,"src");
	}
	public void enterDate()
	{
		 utilities.dateonDatePicker(date);
	
	}
}
