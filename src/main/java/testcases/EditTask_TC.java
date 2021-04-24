package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class EditTask_TC extends PreAndPost{
	
	@BeforeTest
	public void setFile() {
		 dataSheetName="edit";
		 testCaseName="EditTask";
		 testDescription="Edit task from App launcher";
		 authors="praveena";
		 category="functional";
	}
	
	@Test(dataProvider="fetchdata")
	public void runEditTask(String uname,String pwrd,String expectedtext) throws InterruptedException, IOException
	{
			new LoginPage()
			.enterusername(uname)
			.enterpassword(pwrd)
			.clickLoginButton()
			.clickAppLauncher()
			.clickViewAll()
			.clickSales()
			.clickTaskTab()
			.clickRecentlyViewed()
			.clickBootcamp()
			.clickEdit()
			.selectTodayDate()
			.selectPriorityLow()
			.clickSaveEditPopup()
			.VerifyToastMessageByName(expectedtext);
	}

}
