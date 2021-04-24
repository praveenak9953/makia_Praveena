package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class CreateNewTask_TC extends PreAndPost{
	
	@BeforeTest
	public void setFile() {
		 dataSheetName="create";
		 testCaseName="CreateNewTask";
		 testDescription="Create new task from global actions";
		 authors="praveena";
		 category="functional";
	}
	
	@Test(dataProvider="fetchdata")
	public void runCreateNewTaske(String uname,String pwrd,String sname,String searchby,String expectedtext) throws InterruptedException, IOException {

			new LoginPage()
			.enterusername(uname)
			.enterpassword(pwrd)
			.clickLoginButton()
			.clickGlobalActions()
			.clickNewTask()
			.clickMaximizeicon()
			.enterSubject(sname)
			.selectConacts(searchby)
			.selectStatus()
			.clickSaveIconNewTask()
			.VerifyToastMessageByName(expectedtext);

	}

}
