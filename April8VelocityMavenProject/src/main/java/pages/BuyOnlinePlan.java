package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyOnlinePlan {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@data-action='online plans']")
	private WebElement onlineplan;
	
	@FindBy(xpath = "//*[text()='Retirement Plan']")
	private WebElement retirementplan;
	

	
	
public BuyOnlinePlan(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements( driver,this);
	
}
public void selectionplan() {
	Actions act = new Actions(driver);
	act.moveToElement(onlineplan).perform();
	
//	onlineplan.click();
	retirementplan.click();
	
	
}public String geturl() {
	String url = driver.getCurrentUrl();
	return url;
	
}
}
