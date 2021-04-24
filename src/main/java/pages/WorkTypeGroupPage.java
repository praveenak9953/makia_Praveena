package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import lib.selenium.WebDriverServiceImpl;

public class WorkTypeGroupPage extends WebDriverServiceImpl{

	public WorkTypeGroupPage newicon() throws InterruptedException
	{
		Thread.sleep(5000);
		clickscript(locateElement("xpath","//div[text()='New']"));
		//driver.executeScript("arguments[0].click()", driver.findElementByXPath("//div[text()='New']"));
		return this;
	}
	
	public WorkTypeGroupPage enterWGname(String gname)
	{
		type(locateElement("xpath","//div[@class='uiInput uiInputText uiInput--default uiInput--input']//input"), gname);
		//gname="Salesforce Automation by Praveena";
		return this;
	}
	
	public WorkTypeGroupPage Save()
	{
		click(locateElement("xpath","//button[@title='Save']//span"));
		return this;
	}
	
	public WorkTypeGroupPage verifyWGcreated(String expectedtext)
	{
		verifyPartialText(locateElement("xpath", "//*[@data-aura-class='forceActionsText']"), expectedtext);
		System.out.println("Verified toast message?? check report ;) ");
		System.out.println("Test Pass:WorkType_Group created");
		return this;
	}
	
	public WorkTypeGroupPage ClickWorkTypeGroupTab() throws InterruptedException
	{
		Thread.sleep(10000);
		click(locateElement("xpath","(//span[text()='Recently Viewed | Work Type Groups']/ancestor::a)[1]"));
		/*Thread.sleep(8000);
		driver.executeScript("arguments[0].click()",driver.findElementByXPath("(//span[text()='Recently Viewed | Work Type Groups']/ancestor::a)[1]"));*/
		return this;
	}
	
	public WorkTypeGroupPage SearchWorkTypeGroupName(String searchname)
	{
		WebElement searchtext=locateElement("xpath","//input[@name='WorkTypeGroup-search-input']");
		type(searchtext, searchname);
		searchtext.sendKeys(Keys.ENTER);
		return this;
		/*WebElement searchtext=driver.findElementByXPath("//input[@name='WorkTypeGroup-search-input']");
		searchtext.sendKeys("Automation by Praveena");
		searchtext.sendKeys(Keys.ENTER);*/
	}
	
	public WorkTypeGroupPage ClickEditWorkTypeGroupName() throws InterruptedException
	{
		clickscript(locateElement("xpath","(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]"));
		clickscript(locateElement("xpath","//a[@title='Edit']"));
		return this;
/*		Thread.sleep(9000);
		driver.executeScript("arguments[0].click()",driver.findElementByXPath("(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]"));
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click()",driver.findElementByXPath("//a[@title='Edit']"));*/
	}
	
	public WorkTypeGroupPage EnterDescription(String descption)
	{
		type(locateElement("xpath","//div[@data-aura-class='forcePageBlockItem forcePageBlockItemEdit']//textarea"),descption);
		return this;
	}
	
	public WorkTypeGroupPage SelectGroupType()
	{
		click(locateElement("xpath","//a[@class='select']"));
		click(locateElement("xpath","//a[@title='Capacity']"));
		return this;
	}
	
	public WorkTypeGroupPage Clicksave()
	{
		click(locateElement("xpath","(//span[text()='Save'])[2]"));
		return this;
	}
	
	public WorkTypeGroupPage VerifyWorkTypeGroupDescription(String expectedtext, String descption) throws InterruptedException
	{
		verifyPartialText(locateElement("xpath", "//*[@data-aura-class='forceActionsText']"), expectedtext);
		System.out.println("Verified toast message?? check report ;) ");
		//String exptext="Salesforce Automation by Praveena";
		clickscript(locateElement("xpath", "//span[text()='Last Modified Date']"));
		//driver.executeScript("arguments[0].click()", driver.findElementByXPath("//span[text()='Last Modified Date']"));
		//Thread.sleep(3000);
		click(locateElement("xpath", "//a[@title='Salesforce Automation by Praveena']"));
		verifyPartialText(locateElement("xpath", "(//span[@class='test-id__field-value slds-form-element__static slds-grow ']//span)[2]"), descption);
		System.out.println("Verified toast message?? check report ;) ");
		System.out.println("Description Matched!!");
		return this;
	}
	
	public WorkTypeGroupPage ClickDeleteWorkTypeGroupName() throws InterruptedException
	{
		click(locateElement("xpath", "//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]"));
		/*Thread.sleep(6000);
		driver.executeScript("arguments[0].click()",driver.findElementByXPath("(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]"));*/
		click(locateElement("xpath", "//a[@title='Delete']"));
		/*Thread.sleep(2000);
		driver.executeScript("arguments[0].click()",driver.findElementByXPath("//a[@title='Delete']"));*/
		return this;
	}
	
	public WorkTypeGroupPage ClickDeleteinpopup()
	{
		click(locateElement("xpath","//span[text()='Delete']"));
		return this;
	}
	
	public WorkTypeGroupPage VerifyDeletedGroupwithName(String expectedtext)
	{
		verifyPartialText(locateElement("xpath", "//*[@data-aura-class='forceActionsText']"), expectedtext);
		System.out.println("Verified toast message?? check report ;) ");
        //String expectedtext="Salesforce Automation by Praveena";
       	System.out.println("Deleted work type group:Test Pass");
        return this;
	}
		
}
