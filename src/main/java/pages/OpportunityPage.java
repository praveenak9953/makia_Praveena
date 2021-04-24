package pages;

import lib.selenium.WebDriverServiceImpl;

public class OpportunityPage extends WebDriverServiceImpl{

	
	public OpportunityPage clickNewOpp() {
		click(locateElement("xpath", "//a[@title='New']//div"));
		return this;
	}
	
	public OpportunityPage clickAndSearchBootcamp(String searchkey) {
		type(locateElement("xpath", "//input[@name='Opportunity-search-input']"), searchkey);
		System.out.println("Clicked and Searched Bootcamp");
		return this;
	}
	
	public OpportunityPage ClickBootcampLink() {
		click(locateElement("xpath", "//a[@title='Bootcamp']"));
		System.out.println("Clicked Boothcamp link");
		return this;
	}
	
	public OpportunityPage ClickDetailsTab() {
		clickscript(locateElement("xpath", "//a[@id='detailTab__item']"));
		System.out.println("Clicked DetailsTab");
		return this;
	}
	
	public OpportunityPage clickEditCloseDate() {
		
		return this;
	}
	
	public OpportunityPage ChangeEndDate() {
		
		return this;
	}
	
	public OpportunityPage ChangeRevenueAmount(String amount) {
		type(locateElement("xpath", ""), amount);
		return this;
	}
	
	
	public OpportunityPage click_EditOpp_Save() {
		
		return this;
	}
	
	public OpportunityPage verifytoastmessage() {
		
		return this;
	}
}
