package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageClass {
	static int a=10;
	
	By logo=By.xpath("//img[@alt='logo']");
	
	WebDriver driver;
	public HomePageClass (WebDriver driver) {
		
		this.driver=driver;
		
	}
	public boolean isLogoDispalyed() {
		
		WebElement logoelement=driver.findElement(logo);
		return logoelement.isDisplayed();
		}
	
}
