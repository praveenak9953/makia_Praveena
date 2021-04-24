package pages;

import lib.selenium.WebDriverServiceImpl;

public class NewLegalEntitiesWithoutReqFields extends WebDriverServiceImpl{

public NewLegalEntitiesWithoutReqFields clickNewLegalEntitiesIcon() throws InterruptedException
{
	
	click(locateElement("xpath", "//div[@title='New']"));
	System.out.println("Clicked New icon in Legal Entities");
	return this;
}

public NewLegalEntitiesWithoutReqFields enterCompanyName(String cname) {
	type(locateElement("xpath", "(//label[@class='label inputLabel uiLabel-left form-element__label uiLabel']//following-sibling::input)[2]"), cname);
	System.out.println("Entered CompanyName");
	return this;
}

public NewLegalEntitiesWithoutReqFields enterDescription(String description) {
	 type(locateElement("xpath", "(//div[@data-aura-class='forcePageBlockSectionRow']//textarea)[2]"), description);
	 System.out.println("Entered Description");
	 return this;
}

public NewLegalEntitiesWithoutReqFields selectStatus() {
	 click(locateElement("xpath", "//a[text()='--None--']"));
	 click(locateElement("xpath", "//a[@title='Active']"));
     System.out.println("Selected Status");
     return this;
}

public NewLegalEntitiesWithoutReqFields ClickSaveInNewLegalEntitiesPopUp() {
	 click(locateElement("xpath", "//button[@title='Save']"));
	 System.out.println("Clicked save icon in Legal Entities popup");
	 return this;
}

public void VerifyToastMessageByName(String expectedtext) throws InterruptedException
{
    verifyPartialText(locateElement("xpath", "//*[text()='These required fields must be completed: Name']"), expectedtext);
	System.out.println("Verifying Toast text");
    }
}
