package utilities;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebElement;

public class UtilitiesClass {
	
	public String get_Atribute(WebElement element,  String atribute)
	{
		return element.getAttribute(atribute);
	}
	public void dateonDatePicker(WebElement ele)

	{
		ele.sendKeys("27/07/2024");
	}
	public String get_AtributeCssvalue(WebElement element, String cssvalue)
	{
		return element.getCssValue(cssvalue);
	}
	
	public List<String> getTextofElements(List <WebElement> element)
	{
		List <String> data=new ArrayList<String>();
		for(WebElement ele: element)
		{
			data.add(ele.getText());
		}
		return data;
	}
	public List<String> expectedData()
	{
		List<String> expecteddata= new ArrayList<String>();
		expecteddata.add("HOME");
		expecteddata.add("INPUT FORM");
		expecteddata.add("DATE PICKERS");
		expecteddata.add("TABLE");
		expecteddata.add("PROGRESS BARS");
		expecteddata.add("ALERTS AND MODALS");
		expecteddata.add("LIST BOX");
		expecteddata.add("OTHERS");
		System.out.println("Expecteddata is:"+expecteddata);
		/*ListIterator<String> itr=expecteddata.listIterator();    
		System.out.println("ExpectedData given below");
          
        while(itr.hasNext()){    
              
        System.out.print(itr.next()+",");    
        }    */
		return expecteddata;
		
	}
}
