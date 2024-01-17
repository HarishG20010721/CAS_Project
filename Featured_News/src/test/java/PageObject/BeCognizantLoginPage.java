package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BeCognizantLoginPage extends BasePage{

	public BeCognizantLoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@name='passwd']")
	WebElement passWordElement;
	
	public void userLogin() {
		
	}
	
	
	
}
