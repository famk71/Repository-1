package Page_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Page_Object_Signin {

	
		WebDriver Driver;
		By PageTitle= By.tagName("title");
		By SignIn= By.className("login");
		By Createaccountfrom = By.cssSelector("#create-account_form");
		
	public Page_Object_Signin(WebDriver Driver) {
		this.Driver= Driver;
	}
	
	public String MainpageTitle() {
		return Driver.getTitle();
	}
	
	public void Signin() {
		Driver.findElement(SignIn).click();
	}
	
	public String SigninPageTitle() {
		return Driver.getTitle();
	}
	
	public void verifySignupForm() {
	    String expectedForm = "create-account_form";
	    String actualForm = Driver.findElement(Createaccountfrom).getAttribute("id");
	    Assert.assertEquals(actualForm, expectedForm);
	}
	
	
	
	public void Opensinginpage() {
		this.MainpageTitle();
		this.Signin();
		this.SigninPageTitle();
		this.verifySignupForm();
	}
	}
