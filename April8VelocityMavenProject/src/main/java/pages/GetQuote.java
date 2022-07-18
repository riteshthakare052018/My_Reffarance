package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetQuote extends BaseClass {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@class ='btnValSec adultMemVal']//*[text()='+']")
	private WebElement addadults;
	
	@FindBy(xpath = "//*[@id='txtMobile']")
	private WebElement entermobileno;
	
	@FindBy(xpath = "//*[@class='btnValSec']//*[text()='+']")
	private WebElement addkids;
	
	@FindBy (xpath = "//*[@id='txtPinCode']")
	private WebElement pincode;
	
	@FindBy(xpath = "//*[@id='ctl00_Content_C001_btnCalculte']")
	private WebElement submit;

public GetQuote(WebDriver driver) throws IOException
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
	
	
}
public void enterData() throws InterruptedException {
	addadults.click();
	entermobileno.sendKeys(prop.getProperty("mobileno"));
	addkids.click();
	pincode.sendKeys(prop.getProperty("pincode"));
	Thread.sleep(2000);
	submit.click();
	

	

	
}
}
