package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class NewServiceAppointments_TC extends PreAndPost{

	@BeforeTest
	public void setFile()
	{
		 dataSheetName="ServiceAppointments";
		 testCaseName="Create New ServiceAppointments";
		 testDescription="Create new ServiceAppointments from global actions";
		 authors="praveena";
		 category="functional";
	}
	
	@Test(dataProvider="fetchdata")
	public void runNewServieAppointments(String uname, String pwrd,String desc,String accountname,String expectedtext) throws InterruptedException, IOException {
		//String expectedtext="SA-00";

			new LoginPage()
			.enterusername(uname)
			.enterpassword(pwrd)
			.clickLoginButton()
			.clickAppLauncher()
			.clickViewAll()
			.ClickServiceAppointments()
			.click_SA_Newicon()
			.enter_SA_Description(desc)
			.searchAccounts(accountname)
			.selectEarliestStartPermittedDateAndTime()
			.SelectDuDate()
			.ClickSaveIconInNewServiceAppoints()
			.VerifyToastMessageByName(expectedtext);
	}
}
