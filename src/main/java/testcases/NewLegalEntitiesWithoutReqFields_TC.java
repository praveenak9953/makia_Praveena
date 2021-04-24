package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class NewLegalEntitiesWithoutReqFields_TC extends PreAndPost{

	@BeforeTest
	public void setFile() {
		 dataSheetName="lEWithoutReqFields";
		 testCaseName="Legal Entitties without req fields";
		 testDescription="Create Legal Entitties without req fields from global actions";
		 authors="praveena";
		 category="functional";
	}
	
	@Test(dataProvider="fetchdata")
	public void runNewLegalEntitiesWithoutReqFields(String uname,String pwrd, String cname, String descrptn,String expectedtext) throws IOException, InterruptedException
	{
		//String expectedtext="Name";

			new LoginPage()
			.enterusername(uname)
			.enterpassword(pwrd)
			.clickLoginButton()
			.clickAppLauncher()
			.clickViewAll()
			.ClickLegalEntities()
			.clickNewLegalEntitiesIcon()
			.enterCompanyName(cname)
			.enterDescription(descrptn)
			.selectStatus()
			.ClickSaveInNewLegalEntitiesPopUp()
			.VerifyToastMessageByName(expectedtext);
	}
	
}
