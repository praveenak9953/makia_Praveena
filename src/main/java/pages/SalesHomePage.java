package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.selenium.WebDriverServiceImpl;

public class SalesHomePage extends WebDriverServiceImpl{
	
	public TaskPage clickTaskTab() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver,35);
		WebElement actual = locateElement("xpath", "//a[@title='Tasks']/span");
	 	wait.until(ExpectedConditions.elementToBeClickable(actual));
		clickscript(actual);
		System.out.println("Clicked Task Tab");
		return new TaskPage();
	}
	
	public OpportunityPage clickOpportunityTab() {
		WebDriverWait wait = new WebDriverWait(driver,35);
		WebElement actual = locateElement("xpath","//a[@title='Opportunities']");
	 	wait.until(ExpectedConditions.elementToBeClickable(actual));
		click(actual);
		System.out.println("Clicked Opportunity tab");
		return new OpportunityPage();	
	}
	
	public void clickCampaignTab() {
		
	}
	
	public void clickContactsTab() {
		
	}
	
	public void clickDashboardTab() {
		
	}

}
