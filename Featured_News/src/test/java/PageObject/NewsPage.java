package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ScreenShot;


public class NewsPage extends BasePage {
	
	BeCongnizantPage beCongnizantPage;
	NewsPage newsPage;
	ScreenShot screenShot;
	
	public NewsPage(WebDriver driver) {
		super(driver);
	}
	
	// Be.Cognizant link element
    @FindBy(xpath = "//a[@name='be.cognizant']")
    public WebElement beCognizantLinkElement;
	
	// immersiveReader Element
	public @FindBy(xpath = "//button[@name='Immersive Reader']")
	WebElement immersiveReaderElement;
	
	// Author Name Element
	@FindBy(xpath = "(//div[@data-automation-id='personaDetails']/div)[1]")
	public WebElement authorNameElement;
	
	// News Info Element
	@FindBy(xpath = "//div[@data-automation-id='textBox']")
	public WebElement newsInfoElement;
	
	// Growth page Image Element
	@FindBy(xpath = "//div[@class='gx_ab_9f38462c']//img")
	public WebElement growthPageImgElement;
	
//	public void getNewsInformation() throws InterruptedException {
//		
//			beCongnizantPage = new  BeCongnizantPage(driver);
//			newsPage = new NewsPage(driver);
//			screenShot = new ScreenShot(driver);
//			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			
//			System.out.println("News Information : ");
//			System.out.println();
//			
//			try {
//				for(int i=1;i<=beCongnizantPage.newsLinkElements.size();i++) {
//					
//	
//					wait.until(ExpectedConditions.visibilityOfAllElements(beCongnizantPage.newsLinkElements));
//					
//					// Featured news links 
//					driver.findElement(By.xpath(("(//div[@data-automation-id='newsItem']/div/following-sibling::div/a)["+i+"]"))).click();
//					
//					wait.until(ExpectedConditions.visibilityOf(newsPage.immersiveReaderElement));
//					
//					
//					String title = i+") News Title : "+driver.getTitle();
//					System.out.println(title);
//					System.out.println();
//					
//					String newsInfo = "";
//					
//					// retrieving Our growth mind set page news data
//					if(driver.getTitle().equals("Our growth mindset")) {
//						for(int j=1;j<3;j++) {
//							
//							wait.until(ExpectedConditions.visibilityOf(growthPageImgElement));
//		
//							newsInfo = driver.findElement(By.xpath("(//div[@data-automation-id='textBox'])["+j+"]")).getText();
//							System.out.println("News : "+newsInfo);
//						}
//					}
//					// retrieving other page news data
//					else {
//						newsInfo = newsPage.newsInfoElement.getText();
//						wait.until(ExpectedConditions.visibilityOf(authorNameElement));
//						System.out.println("Author Name : "+authorNameElement.getText());
//						System.out.println();
//						System.out.println("News : "+newsInfo);
//					}
//					
//					System.out.println("=========================================================================================================");
//					
//					String data = title+newsInfo;
//					
//					// Writing data into Excel 
//					ExcelUtility.writeData("NewsInformation", i, 0, data);
//					
//					// Taking individual Page ScreenShot
//					screenShot.getScreenShot(driver.getTitle().substring(0,8)+".png");
//					
//					// clicking on be.cognizant 
//					newsPage.beCognizantLinkElement.click();
//					
//					wait.until(ExpectedConditions.visibilityOfAllElements(beCongnizantPage.newsLinkElements));
//				}
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//				Assert.fail();
//			}
//		}
}
