package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AppsAndToolsPage;


public class TC_004_ValidateAppsAndTools extends TC_003_ValidateNewsItems{
	
	AppsAndToolsPage appsAndToolsPage;
	
	
	@Test
	public void validateAppsAndTools() {
		
		appsAndToolsPage = new AppsAndToolsPage(driver);
		
		logger.info("****** Starting TC_004_ValidateAppsAndTools ******");
		
		try {
			// Clicking on the All app's and tools link
			beCongnizantPage.clickOnAllAppsAndToolsLink();
			logger.info("Clicked on the all app's and tools link");
			// Printing all app's and tools text on the console 
			appsAndToolsPage.printAllAppsAndTools();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
			logger.error("Test failed...");
		}
		
		logger.info("****** finished TC_004_ValidateAppsAndTools ******");
		
	}

}
