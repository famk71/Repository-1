package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class POM_Sign_in_form_Automation_Practice {

	WebDriver Driver;
	//By Homepagetitle= By.tagName("title");
	By Signinbutton= By.className("login");
	
	By Createaccountform= By.id("create-account_form");
	
	
	
	public POM_Sign_in_form_Automation_Practice(WebDriver Driver) {
		this.Driver= Driver;
	}
	
	public String Homepagetitle() {
		return Driver.getTitle();
	}
	public void Signin() {
		Driver.findElement(Signinbutton).click();
	}
	
	public void Createaccountformvisible() {
		String Actual="create-account_form";
		String Expected= Driver.findElement(Createaccountform).getAttribute("id");
		Assert.assertEquals(Actual, Expected);
		System.out.println(Expected);
	}
	
	public void Sign_in_page() {
		this.Homepagetitle();
		this.Signin();
		this.Createaccountformvisible();
		
	}
}
