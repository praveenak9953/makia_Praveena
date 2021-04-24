package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class NewWorkTypeGroup_TC extends PreAndPost {
	
	@BeforeTest
	public void setFile() {
		dataSheetName="newWTG";
		testCaseName="New WorkType Group";
		testDescription="Create New WorkType Group from APP launcher";
		authors="praveena";
		category="functional";
	}
	
	@Test(dataProvider="fetchdata")
	public void createnewWorkTypegroup(String uname,String pwrd,String gname, String expectedtext) throws IOException {
		
		try {
			new LoginPage()
			.enterusername(uname)
			.enterpassword(pwrd)
			.clickLoginButton()
			.clickAppLauncher()
			.clickViewAll()
			.clickWorkTypeGroup()
			.newicon()
			.enterWGname(gname)
			.Save()
			.verifyWGcreated(expectedtext);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
