package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePageClass {
	
	WebDriver driver;
	By tableclick=By.xpath("//a[contains(text(),'Table')]");
	By tablepagination=By.xpath("//div[contains(text(),'Table with Pagination Example')]");
	
	public TablePageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void tablePaginationClick()
	{
		WebElement tabclick=driver.findElement(tableclick);
		tabclick.click();
		
	}
		
	public String tablePaginationWithExample()
	{
		WebElement pagination=driver.findElement(tablepagination);
		return pagination.getText();
	}
		
		
	}

