package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.selenium.WebDriverServiceImpl;

public class Homepage extends WebDriverServiceImpl{
	
	public Homepage clickGlobalActions()  {
		click(locateElement("xpath","(//div[@data-aura-class='oneGlobalCreate']//div)[5]"));
		System.out.println("Clicked GlobalActions");
		return this;
	}
	
	public Homepage clickNewTask() throws IOException {
		click(locateElement("xpath","//span[text()='New Task']"));
		System.out.println("Clicked NewTask");
		return this;
	}

	public Homepage clickMaximizeicon() throws IOException {
		click(locateElement("xpath", "//*[@title='Maximize']"));
		System.out.println("Clicked Maximizeicon");
		return this;
	}
	
	public Homepage enterSubject(String name) throws IOException {
		type(locateElement("xpath", "//input[@id='input-81']"),name);
		System.out.println("Entered Subject");
		return this;
	}
	
	public Homepage selectConacts(String searchby) throws IOException {
        	click(locateElement("xpath", "//input[@title='Search Contacts']"));
        	click(locateElement("xpath", "//span[@title='New Contact']"));
        	type(locateElement("xpath", "//input[@placeholder='First Name']"),searchby);
        	type(locateElement("xpath", "//input[@placeholder='Last Name']"),"lesley");
        	click(locateElement("xpath", "(//button[@title='Save'])[2]"));
        	System.out.println("Selected Conacts");
        	return this;
	}
        
	public Homepage selectStatus() throws IOException {
		click(locateElement("xpath", "//*[text()='Not Started']"));
		click(locateElement("xpath", "//a[text()='Waiting on someone else']"));
		System.out.println("Clicked NewTask");
			return this;
	}
	public Homepage clickSaveIconNewTask() throws IOException {
		click(locateElement("xpath", "(//span[text()='Save'])[2]"));
		System.out.println("Clicked SaveIcon in NewTask");
		return this;
	}
	
	public  Homepage deselectStatus() throws InterruptedException {
		click(locateElement("xpath", "//*[text()='Not Started']"));
		click(locateElement("xpath", "//a[text()='--None--']"));
		System.out.println("Removed Status");
		return this;
		}

	
	public void VerifyToastMessageByName(String expectedtext) throws InterruptedException, IOException
	{
		verifyPartialText(locateElement("xpath", "//*[@data-aura-class='forceActionsText']"), expectedtext);
		System.out.println("Verified toast message");
	}
	
	public void VerifyErrorMessage(String expectedtext) throws InterruptedException, IOException
	{
		verifyPartialText(locateElement("xpath", "//div[@class='desktop forcePageError']//li"), expectedtext);
		System.out.println("Verifed error message text");
    }
	
	public Homepage clickAppLauncher() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver,35);
		WebElement actual = locateElement("class","slds-icon-waffle");
		wait.until(ExpectedConditions.elementToBeClickable(actual));
		click(actual);
		System.out.println("Clicked AppLauncher");
		return this;
	}
	
	public Homepage clickViewAll() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver,35);
		WebElement actual = locateElement("class","slds-icon-waffle");
	 	wait.until(ExpectedConditions.elementToBeClickable(actual));
		click(actual);
		System.out.println("Clicked ViewAll");
		return this;
	}
	
	public SalesHomePage clickSales() throws IOException {
		click(locateElement("xpath","//p[contains(text(),'Manage your sales')]"));
		System.out.println("Clicked Sales");
		return new SalesHomePage();
	}

	public NewLegalEntitiesWithoutReqFields ClickLegalEntities() {
		 WebDriverWait wait = new WebDriverWait(driver,35);
		 WebElement actual = locateElement("xpath", "//a[@data-label='Legal Entities']");
		 wait.until(ExpectedConditions.elementToBeClickable(actual));
		 clickscript(actual);
		 System.out.println("Clicked LegalEntities");
	//	driver.executeScript("arguments[0].click()", driver.findElementByXPath("//a[@data-label='Legal Entities']"));
		 return new NewLegalEntitiesWithoutReqFields();
	}

	public NewServiceAppointments ClickServiceAppointments() {
		clickscript(locateElement("xpath", "//a[@data-label='Service Appointments']"));
		System.out.println("Clicked ServiceAppointments");
		return new NewServiceAppointments();
	//driver.executeScript("arguments[0].click()", driver.findElementByXPath("//a[@data-label='Service Appointments']"));
	}
	
/*	public DashboardPage clickDashboard()
	{
		clickscript(locateElement("xpath","//p[text()='Dashboards']/ancestor::a"));
		System.out.println("Clicked NewTask");
		//driver.executeScript("arguments[0].click()", driver.findElementByXPath("//p[text()='Dashboards']/ancestor::a"));
		System.out.println("clicked-Dashboards");
		return new DashboardPage();
	}*/
	
	public WorkTypeGroupPage clickWorkTypeGroup() throws InterruptedException
	{
		Thread.sleep(10000);
		clickscript(locateElement("xpath","//p[text()='Work Type Groups']"));
		System.out.println("clicked-WorkTypeGroup");
		return new WorkTypeGroupPage();
		//driver.executeScript("arguments[0].click()", driver.findElementByXPath("//p[text()='Work Type Groups']/ancestor::a"));
		}

/*	public ServiceConsole clickServiceConsole() {
		click(locateElement("xpath", "//p[text()='Service Console']"));
		System.out.println("Clicked ServiceConsole");
		return new ServiceConsole();
	}*/
}
