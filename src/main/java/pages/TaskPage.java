package pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import lib.selenium.WebDriverServiceImpl;

public class TaskPage extends WebDriverServiceImpl{
	
	
	public TaskPage clickTaskTab() throws IOException {
		clickscript(locateElement("xpath", "//a[@title='Tasks']/span"));
		System.out.println("Clicked Task Tab");
		return this;
	}

	public TaskPage clickRecentlyViewed() throws IOException {
		click(locateElement("xpath", "//a[@title='Select List View']"));
		click(locateElement("xpath", "//ul//span[text()='Recently Viewed']"));
		System.out.println("Clicked Recently Viewed");
        return this;
	}
	
	public TaskPage clickBootcamp() throws InterruptedException, IOException {
		WebElement searchboot=locateElement("xpath", "//input[@name='Task-search-input']");
		type(searchboot, "Bootcamp");
		searchboot.sendKeys(Keys.ENTER); 
		System.out.println("Searched Bootcamp");
		click(locateElement("xpath", "(//span[@class='slds-grow slds-text-body--regular slds-text-color--default fade test-splitViewCardData'])[1]//ancestor::a"));
		//driver.executeScript("arguments[0].click()", driver.findElementByXPath("(//span[@class='slds-grow slds-text-body--regular slds-text-color--default fade test-splitViewCardData'])[1]//ancestor::a"));
		System.out.println("Clicked Bootcamp"); 
		return this;
	}
	
	public TaskPage clickEdit() throws InterruptedException, IOException {
		click(locateElement("xpath", "(//li[@data-aura-class='oneActionsDropDown'])[2]//div"));
		System.out.println("Clicked Dropdown");
		click(locateElement("xpath", "//a[@title='Edit']"));
		System.out.println("Clicked Edit");
        return this;
	}
		
	public TaskPage selectTodayDate() throws IOException {
		click(locateElement("xpath", "//input[@class='inputDate input']"));
		click(locateElement("xpath", "//button[text()='Today']"));
		System.out.println("Selected TodayDate");
		return this;
	}
	
	public TaskPage selectPriorityLow() throws IOException {
		click(locateElement("xpath", "(//*[text()='Priority'])[2]//following::div[4]/a"));
		click(locateElement("xpath", "//a[@title='Low']"));
		System.out.println("selected priority to LOW");
		return this;
	}
	
	public TaskPage clickSaveEditPopup() throws IOException {
		click(locateElement("xpath", "//button[@title='Save']/span"));
		System.out.println("Clicked Save after Edit");
		return this;
	}
	
	public TaskPage clickDelete() throws InterruptedException, IOException {
		click(locateElement("xpath", "(//li[@data-aura-class='oneActionsDropDown'])[2]"));
		System.out.println("Clicked Dropdown");
		click(locateElement("xpath", "//a[@title='Delete']"));
		System.out.println("Clicked Delete");
        return this;
	}
	
	public TaskPage clickDeleteIconInDeletePopup() throws IOException {
		click(locateElement("xpath", "//button[@title='Delete']"));
		System.out.println("Clicked Delete icon");
		return this;
	}
		
	public void VerifyToastMessageByName(String expectedtext) throws InterruptedException, IOException
	{
		verifyPartialText(locateElement("xpath", "//*[@data-aura-class='forceActionsText']"), expectedtext);
		System.out.println("Verifying Toast text");
    }
}
