package TestBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	

	@BeforeClass
	@Parameters({"os","browser"})
	public void setUp(String os,String browser) throws InterruptedException {
		
		logger = LogManager.getLogger(Test.class);
		
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("No Matching browser");
			return;
		}
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String baseURL = "https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx";
		
		driver.get(baseURL);
		
		Thread.sleep(30000);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

}
