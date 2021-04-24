package pages;

import java.io.IOException;

import lib.selenium.WebDriverServiceImpl;

public class LoginPage extends WebDriverServiceImpl{
	
	public LoginPage enterusername(String uname) throws IOException {
		type(locateElement("id", "username"),uname);
		return this;
	}
	
	public LoginPage enterpassword(String pwrd) throws IOException {
		type(locateElement("id", "password"),pwrd);
		return this;
	}
	
	public Homepage clickLoginButton() throws IOException {
		click(locateElement("id", "Login"));
		System.out.println("Clicked Login");
		return new Homepage();
	}

}
