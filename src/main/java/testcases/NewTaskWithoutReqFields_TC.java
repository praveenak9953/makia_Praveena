package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class NewTaskWithoutReqFields_TC extends PreAndPost{
	
	@BeforeTest
	public void setFile() {
		 dataSheetName="newTaskWithoutReq";
		 testCaseName="CreateNewTask Without Required values";
		 testDescription="CreateNewTask Without Required valuesfrom global actions";
		 authors="praveena";
		 category="functional";
	}
	
	@Test(dataProvider="fetchdata")
	public void runNewTaskWithoutRequiredFields(String uname,String pwrd,String searchby,String expectedtext) {
		try {
		new LoginPage()
		.enterusername(uname)
		.enterpassword(pwrd)
		.clickLoginButton()
		.clickGlobalActions()
		.clickNewTask()
		.clickMaximizeicon()
		.selectConacts(searchby)
		.deselectStatus()
		.clickSaveIconNewTask()
		.VerifyErrorMessage(expectedtext);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
