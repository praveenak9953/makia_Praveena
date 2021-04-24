package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class EditWorkTypeGroup_TC extends PreAndPost{
	
	@BeforeTest
	public void setFile() {
		 dataSheetName="editWTG";
		 testCaseName="Edit WorkType Group";
		 testDescription="Edit WorkType Group from APP launcher";
		 authors="praveena";
		 category="functional";
	}
	
	@Test(dataProvider="fetchdata")
	public void runCreateNewTaske(String uname,String pwrd,String searchname,String descption,String expectedtext) throws InterruptedException, IOException {
		
		new LoginPage()
		.enterusername(uname)
		.enterpassword(pwrd)
		.clickLoginButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickWorkTypeGroup()
		.ClickWorkTypeGroupTab()
		.SearchWorkTypeGroupName(searchname)
		.ClickEditWorkTypeGroupName()
		.EnterDescription(descption)
		.SelectGroupType()
		.Clicksave()
		.VerifyWorkTypeGroupDescription(expectedtext, descption);
	}

}
