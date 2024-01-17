package PageObject;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BeCongnizantPage extends BasePage {
	
	WebDriver driver;
	NewsPage newsPage;
	
	public BeCongnizantPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		newsPage = new NewsPage(driver);
	}
	
	// UserInfoButton Element
	@FindBy(xpath="//div[@id='O365_MainLink_MePhoto']")
	public WebElement userInfoButtonElement;
	
	// UserInfoTab Element 
	@FindBy(css = "div#mectrl_main_body")
	public WebElement userInfoTabElement;
	
	// User Name Element
	@FindBy(css = "div#mectrl_currentAccount_primary")
	public WebElement userNameElement;
	
	// User Email Element
	@FindBy(css = "div#mectrl_currentAccount_secondary")
	WebElement userEmailElement;
	
	// List of all featured news Elements
	@FindBy(xpath = "//div[@data-automation-id='newsItem']//img")
	public List<WebElement> imagElements;
	
	// List of all featured header Elements
	@FindBy(xpath = "//div[@data-automation-id='newsItem']/div/following-sibling::div/a")
	List<WebElement> headerElements;
	
	// news Element (CanvasSection)
	@FindBy(xpath = "(//div[@data-automation-id='CanvasSection'])[1]")
	public WebElement newsElement;
	
	// List of news link Elements
	@FindBy(xpath = "//div[@data-automation-id='newsItem']/div/following-sibling::div/a")
	public List<WebElement> newsLinkElements;
	
	// All app's and tools link Element
	@FindBy(xpath = "//a[@aria-label='All Apps & Tools.  ']")
	public WebElement allAppsAndToolsLinkElement;
	
	
	// Click on the User Info Button
	public void clickOnUserInfoButton() throws InterruptedException {
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.visibilityOf(userInfoButtonElement));
//		wait.until(ExpectedConditions.elementToBeClickable(userInfoButtonElement));
		try {
			userInfoButtonElement.click();
		}
		catch (Exception e) {
			userInfoButtonElement.click();
		}
		

	}
	
	// User Name
	public String getUserName() {
		return userNameElement.getText();
	}
	
	// User Email
	public String getUserEmail() {
		return userEmailElement.getText();
	}
	
	// Featured news Image Count
	public int getCountOfImages() {
		return imagElements.size();
	}
	
	// Print all the Featured news headers
	public void getHeaders() {
		int i = 1;
		for(WebElement ele:headerElements) {
			System.out.println(i+") "+ele.getText());
			i++;
		}
		System.out.println("===========================================================");
	}
	
	// Click on the all app's and tools link
	public void clickOnAllAppsAndToolsLink() {
		allAppsAndToolsLinkElement.click();
	}

}
