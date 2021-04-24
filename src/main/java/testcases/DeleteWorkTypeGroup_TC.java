package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class DeleteWorkTypeGroup_TC extends PreAndPost{
	
	@BeforeTest
	public void setFile() {
		 dataSheetName="deleteWTG";
		 testCaseName="Delete WorkType Group";
		 testDescription="Delete WorkType Group from APP launcher";
		 authors="praveena";
		 category="functional";
	}
	
	@Test(dataProvider="fetchdata")
	public void runCreateNewTaske(String uname,String pwrd,String searchname,String expectedtext) throws InterruptedException, IOException {
		
		new LoginPage()
		.enterusername(uname)
		.enterpassword(pwrd)
		.clickLoginButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickWorkTypeGroup()
		.ClickWorkTypeGroupTab()
		.SearchWorkTypeGroupName(searchname)
		.ClickDeleteWorkTypeGroupName()
		.ClickDeleteinpopup()
		.VerifyDeletedGroupwithName(expectedtext);
	}
}
