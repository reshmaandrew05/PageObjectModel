package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.TablePageClass;

public class TableTestClass extends BaseClass{
	
	
	TablePageClass tablepageclass;
	
	@Test
	public void verifyHeaderTablePagination()
	{
		tablepageclass=new TablePageClass(driver);
		tablepageclass.tablePaginationClick();
		String expecteddata="Table with Pagination Example";
		String actualdata=tablepageclass.tablePaginationWithExample();
		Assert.assertEquals(actualdata, expecteddata);
	}

}
