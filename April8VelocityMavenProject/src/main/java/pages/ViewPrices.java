package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ViewPrices  {
	WebDriver driver;
	
	@FindBy(xpath ="(//*[@value='Male'])[1]")
	private WebElement RadioButtonMale;
	@FindBy (xpath = "(//*[@class='year'])[1]")
	private WebElement BoxYear;
	Select dropY = new   Select(BoxYear);
	@FindBy(xpath = "(//*[@class='month'])[1]")
	private WebElement BoxMonth;
	Select dropM = new   Select(BoxMonth);
	@FindBy(xpath = "(//*[@class='day'])[1]")
	private WebElement BoxDay;
	Select dropD = new   Select(BoxDay);
	@FindBy(xpath = "//*[@id='ddlAdult1Relation']")
	private WebElement selectRelationship;
	Select dropR = new   Select(selectRelationship);
	
	@FindBy (xpath = "//*[@id='rbChild1Gender_0']")
	private WebElement radio;
	@FindBy (xpath = "(//*[@class='year'])[2]")
	private WebElement BoxYear1;
	Select dropY1 = new   Select(BoxYear1);
	@FindBy(xpath = "(//*[@class='month'])[2]")
	private WebElement BoxMonth1;
	Select dropM1 = new   Select(BoxMonth1);
	@FindBy(xpath = "(//*[@class='day'])[2]")
	private WebElement BoxDay1;
	Select dropD1 = new   Select(BoxDay1);
	@FindBy(xpath = "//*[@id='ddlChild1Relation']")
	private WebElement selectChildRelationship;
	Select dropc = new   Select(selectChildRelationship);
	@FindBy (xpath = "//*[@class='button-form-control btnContinue mt-2']")
	private WebElement submit;
	
	public ViewPrices (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void pricePlan () throws InterruptedException 
	{
		dropY.selectByIndex(10);
		Thread.sleep(1000);
		dropM.selectByVisibleText("January");
		Thread.sleep(1000);
		dropD.selectByValue("23");
		Thread.sleep(1000);
		dropR.selectByValue("Son");
		Thread.sleep(1000);
		
		dropY.selectByIndex(5);
		Thread.sleep(1000);
		dropM.selectByVisibleText("January");
		Thread.sleep(1000);
		dropD.selectByValue("23");
		Thread.sleep(1000);
		dropc.selectByValue("Father");
		Thread.sleep(1000);

		submit.click();
	}

}
