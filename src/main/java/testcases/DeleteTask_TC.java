package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class DeleteTask_TC extends PreAndPost{
	
	@BeforeTest
	public void setFile() {
		 dataSheetName="delete";
		// dataSheetName="Create";
		 testCaseName="CreateNewTask";
		 testDescription="Create new task from global actions";
		 authors="praveena";
		 category="functional";
	}
	
	@Test(dataProvider="fetchdata")
	public void runDeleteTask(String uname,String pwrd,String expectedtext) throws InterruptedException, IOException
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
		.clickDelete()
		.clickDeleteIconInDeletePopup()
		.VerifyToastMessageByName(expectedtext);
	}

}
