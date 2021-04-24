package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import lib.selenium.WebDriverServiceImpl;

public class NewServiceAppointments extends WebDriverServiceImpl{
	
	public NewServiceAppointments click_SA_Newicon() throws InterruptedException {
		Thread.sleep(5000);
		click(locateElement("xpath", "//div[@title='New']"));
		System.out.println("Clicked newicon");
		return this;
	}
	
	public NewServiceAppointments enter_SA_Description(String desc) {
		type(locateElement("xpath", "//textarea[@class=' textarea']"),desc);
		System.out.println("entered SA_Description");
		return this;
	}
	
	public NewServiceAppointments searchAccounts(String name)
	{
		click(locateElement("xpath", "//input[@title='Search Accounts']"));
        click(locateElement("xpath", "//span[@title='New Account']"));
        type(locateElement("xpath", "//span[text()='Account Name']/following::input[1]"), name);
        click(locateElement("xpath", "(//button[@title='Save'])[2]"));
        System.out.println("created Accounts");
        return this;
	}
	
	public NewServiceAppointments selectEarliestStartPermittedDateAndTime() {
		clickscript(locateElement("xpath", "(//span[text()='Date Picker'])[1]"));
		//driver.executeScript("arguments[0].click()", driver.findElementByXPath("(//span[text()='Date Picker'])[1]"));
		click(locateElement("xpath", "//button[text()='Today']"));
		//driver.findElementByXPath("//button[text()='Today']").click();
		clickscript(locateElement("xpath", "(//span[text()='Time Picker'])[1]"));
		//driver.executeScript("arguments[0].click()", driver.findElementByXPath("(//span[text()='Time Picker'])[1]"));
		Date date = new Date();
		System.out.println(date);
		DateFormat currentTime = new SimpleDateFormat("HHmm");
		int time = Integer.parseInt(currentTime.format(date));
		System.out.println(time);
		List<WebElement> times = locateListOfWebelement("xpath", "//ul[@class='datepicker--time__list']/li");
		int size=times.size();
		System.out.println("size:" +size);
		String timeToSelect = "";
		for (WebElement items : times) {
			int currentItemValue =Integer.parseInt(items.getAttribute("id"));
			if(currentItemValue > time) 
			{	timeToSelect = items.getAttribute("id");
			break;
			}
		}
		click(locateElement("xpath", "//li[@id='"+timeToSelect+"']"));
		return this;
	}
	
	public NewServiceAppointments SelectDuDate() {
		//5days from current date
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Calendar c = Calendar.getInstance();    
		c.add(Calendar.DATE, 5);
		String dateToSelect =dateFormat.format(c.getTime());
		System.out.println(dateToSelect);
		clickscript(locateElement("xpath", "(//span[text()='Date Picker'])[2]"));
		clickscript(locateElement("xpath", "(//td[contains(@data-datevalue,'"+dateToSelect+"')])[1]"));
		//driver.executeScript("arguments[0].click()", driver.findElementByXPath("(//span[text()='Date Picker'])[2]"));
		//driver.executeScript("arguments[0].click()",driver.findElementByXPath("(//td[contains(@data-datevalue,'"+dateToSelect+"')])[1]"));
		return this;
	}
	
	public NewServiceAppointments ClickSaveIconInNewServiceAppoints() {
		click(locateElement("xpath", "//button[@title='Save']"));
		System.out.println("ServiceAppointment created successfully");
		return  this;
	}
	
	public void VerifyToastMessageByName(String expectedtext) throws InterruptedException
	{
	    verifyPartialText(locateElement("xpath", "/*[@data-aura-class='forceActionsText']"), expectedtext);
		System.out.println("Verified?? toast message check report ;) ");
	    }
}
