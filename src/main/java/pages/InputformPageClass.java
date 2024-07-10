package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputformPageClass {
	
	WebDriver driver;
	By inputformlink=By.xpath("//a[contains(text(),'Input Form')]");
	By inputheader=By.xpath("//div[contains(text(),'Single Input Field')]");
	
	public InputformPageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnInputform()
	{
		WebElement inputformelement=driver.findElement(inputformlink);
		inputformelement.click();
	}
	
	public String getInputformHeader()
	{
		
		WebElement inputformele=driver.findElement(inputheader);
		return inputformele.getText();
	}
}
