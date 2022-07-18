package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	@FindBy(xpath = "//*[@class='insurenceTypes']//*[text()='Health Insurance']")
	private WebElement healthinsurance;
	@FindBy(xpath = "//*[@class='insurenceTypes']//*[text()='Car Insurance']")
	private WebElement carinsurance;
	@FindBy(xpath = "//*[@class='insurenceTypes']//*[text()='Two Wheeler Insurance']")
	private WebElement twowheelerinsurance;


public Homepage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
	
	
}
public void selectInsurance(String insurancetype) throws InterruptedException {
	if(insurancetype.contains("health")) 
	{
		healthinsurance.click();
		Thread.sleep(3000);
	}else if (insurancetype.contains("carinsurance")) 
	{
		carinsurance.click();
	}else
		twowheelerinsurance.click();
	
}public String verifyUrl() {
	String url = driver.getCurrentUrl();
	return url;
	
}
}
